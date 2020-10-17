import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        HashSet h1=new HashSet();
        HashSet h2=new HashSet();
        for(int i=0;i<s1.length();i++){
            h1.add(s1.charAt(i));
        }
        for(int i=0;i<s2.length();i++){
            h2.add(s2.charAt(i));
        }
        h1.retainAll(h2);
        if(h1.size()!=0)
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
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

//https://www.hackerrank.com/challenges/two-strings/problem
