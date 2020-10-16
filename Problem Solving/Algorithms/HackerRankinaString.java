import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hackerrankInString function below.
    static String hackerrankInString(String s) {
        String h="hackerrank";
        if(s.length()<h.length())
            return "NO";


    // for (int i = 0; i < s.length(); i++) {
    //         if (j < str.length() && s.charAt(i) == str.charAt(j)) {
    //                 j++;
    //         }
    //     }






        int len=0;
        for(int i=0;i<s.length();i++)
        {
            if( len<h.length() && s.charAt(i)==h.charAt(len))
                len++;
        }
        if(len==h.length())
            return "YES";
            else
                return "NO";
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = hackerrankInString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}




//https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem
