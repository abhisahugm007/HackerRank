import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int l) {
        int k=l%26;
        int len=s.length();
        StringBuilder string = new StringBuilder(s);
        for(int i=0;i<len;i++){
            if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122)
            {
                int demo;
                if(((int)s.charAt(i)+k)>122)
                    demo=(int)s.charAt(i)+k-26;
                else{
                    demo=(int)s.charAt(i)+k;
                }
                string.setCharAt(i,(char)demo);
            }
            if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90)
            {
                int demo;
                if(((int)s.charAt(i)+k)>90)
                    demo=(int)s.charAt(i)+k-26;
                else{
                    demo=(int)s.charAt(i)+k;
                }
                string.setCharAt(i,(char)demo);
            }
        }
        return string.toString();

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

//https://www.hackerrank.com/challenges/caesar-cipher-1/problem
