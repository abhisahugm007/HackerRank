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

    public static void main(String[] abhi){
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
    int[] ar=new int[n];
    for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
    int date=sc.nextInt();
    int month=sc.nextInt();
    if(month>n){
        System.out.println(count);
        return;
    }
   
     for(int i=0;i<n-month+1;i++)
     {
         int sum=0;
         for(int j=i;j<i+month;j++)
            sum=sum+ar[j];
        if(sum==date)
            count++;
     }
     System.out.println(count);
    }

}

//https://www.hackerrank.com/challenges/the-birthday-bar/problem
