import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        // Read input values
        int i2 = scan.nextInt();
        double d2 = scan.nextDouble();
        scan.nextLine();  // consume the leftover newline
        String s2 = scan.nextLine();

        // Print results
        System.out.println(i + i2);
        System.out.println(d + d2);
        System.out.println(s + s2);

        scan.close();
    }
}