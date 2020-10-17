import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] a) {
        long min,max,sum=0;
        for(int i=0;i < a.length; i++)
        {
            sum=sum+a[i];
        }
        long dif=sum-a[0];
        min=max=dif;
        for(int j=1;j<a.length;j++)
        {
            dif = sum-a[j];
            if(max < dif)
                max=dif;
            if(min > dif)
                min=dif;
        }
        System.out.println(min+" "+max);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
//https://www.hackerrank.com/challenges/mini-max-sum/problem
