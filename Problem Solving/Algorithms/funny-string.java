import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the funnyString function below.
    static String funnyString(String s) {
        int[] a=new int[s.length()];
        int[] b=new int[s.length()];
        for(int i=0;i<s.length();i++){
            a[i]=(int)s.charAt(i);
            b[s.length()-i-1]=(int)s.charAt(i);
        }
        int n=s.length()-1;
        int[] a1=new int[n];
        int[] b1=new int[n];
        for(int i=0;i<n;i++){
            if(a[i]-a[i+1]<0)
                a1[i]=(a[i]-a[i+1])*-1;
            else
                a1[i]=a[i]-a[i+1];
            if((b[i]-b[i+1])<0)
                b1[i]=(b[i]-b[i+1])*-1;
            else
                b1[i]=b[i]-b[i+1];
        }
       for(int i=0;i<n;i++){
           if(a1[i]!=b1[i])
                return "Not Funny";
       }
         return "Funny";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

//https://www.hackerrank.com/challenges/funny-string/problem
