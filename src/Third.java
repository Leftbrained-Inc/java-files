import java.util.*;
import java.io.*;

public class Third {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("third"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output"));
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            int type = Integer.parseInt(line[0]);
            int t = Integer.parseInt(line[1]);
            int a = Integer.parseInt(line[2]);
            if (type == 1) {
                map.put(a, t);
            } else {
                int parkingTime = t - map.get(a);
                bw.write(calculateCost(parkingTime) + "\n");
            }
        }
        bw.close();
    }

    private static int calculateCost(int parkingTime) {
        if (parkingTime <= 15) {
            return 0;
        } else if (parkingTime <= 30) {
            return 120;
        } else {
            return 120 + ((parkingTime - 1) / 30) * 50;
        }
    }
}