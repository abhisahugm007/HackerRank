import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int a[] = new int[3];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
                a[0]++;
            else if(arr[i]==0)
                a[1]++;
                else 
                a[2]++;
        }
        float f;
        f=(float)a[2]/arr.length;
        System.out.println(f);
        f=(float)a[0]/arr.length;
        System.out.println(f);
        f=(float)a[1]/arr.length;
        System.out.println(f);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
//https://www.hackerrank.com/challenges/plus-minus/problem
