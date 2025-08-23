import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i = 1; i <= 10; i++) {
            int res = n * i;
            System.out.println(n + " x " + i + " = " + res);
        }

        bufferedReader.close();
    }
}
