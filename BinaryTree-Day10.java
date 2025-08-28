import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
 String binary = Integer.toBinaryString(n);

        int maxCount = 0;
        int currentCount = 0;

        // Traverse binary string and count consecutive 1s
        for (char c : binary.toCharArray()) {
            if (c == '1') {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }

        // Print result
        System.out.println(maxCount);
        bufferedReader.close();
    }
}
