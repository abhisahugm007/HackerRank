import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int[] col=new int[n];
        for(int i=0;i<n;i++)
            col[i]=1;
        Arrays.sort(ar);
        int j=0,max=0;
        //1 1 1 2 2 2 3 3 3 3 5 5 5 5 6        2
        for(int i=1;i<n;i++)
        {
            if(ar[i-1]==ar[i])
                col[j]++;
                else 
                    j++;
        }
        for(int i=0;i<n;i++)
        {
            if(col[i]%2==0 && col[i]!=1)
                max=max+col[i]/2;
            else
            {
                if(col[i]!=1)
                    max=max+(col[i]-1)/2;
            }

        }
        
        return max;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
//https://www.hackerrank.com/challenges/sock-merchant/problem
