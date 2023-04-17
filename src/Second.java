import java.util.*;
import java.io.*;

public class Second {
    public static void main(String[] args) throws IOException {
        var file = new File("second");
        BufferedReader br = new BufferedReader(new FileReader(file));
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            map.put(a, map.getOrDefault(a, 0) + b);
            if (map.get(a) != 1 || map.get(a) != -1) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}