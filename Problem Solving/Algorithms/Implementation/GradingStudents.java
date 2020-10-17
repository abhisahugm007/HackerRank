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
    public static void main(String[] args)
  {
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      int[] ar=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
      for(int i=0;i<n;i++){
        if(arr[i]<=37){

            ar[i]=arr[i];
        }
        else{
        if(arr[i]%10 < 5)
        {
           int temp=(arr[i]/10)*10 +5;
           int dif=temp-arr[i];
           if(dif<3)
            ar[i]=temp;
            if(dif>=3)
                ar[i]=arr[i];
        }
        else
        {
            int temp=(arr[i]/10)*10 +10;
            int dif=temp-arr[i];
           if(dif<3)
            ar[i]=temp;
            if(dif>=3)
                ar[i]=arr[i];
        }

      }
      }
      for(int i=0;i<n;i++)
        System.out.println(ar[i]);
  }
}

//https://www.hackerrank.com/challenges/grading/problem
