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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] arr=new int[n][n];
        int d1sum=0,sum;
        int d2sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            arr[i][j]=sc.nextInt();
            }
        }
         for(int i=0;i<n;i++){
             d1sum=d1sum+arr[i][i];
             d2sum=d2sum+arr[i][n-i-1];
         }
         sum=d1sum-d2sum;
         if(sum<0)    
            System.out.println(sum*(-1));
            else{
                System.out.println(sum);
            }


    }
}
//https://www.hackerrank.com/challenges/diagonal-difference/problem
