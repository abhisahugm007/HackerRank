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

    // Complete the migratoryBirds function below.
    static int migratoryBirds(int[] arr,int n) {
        int c1=0,c2=0,c3=0,c4=0,c5=0;
        for(int i=0;i<n;i++)
        {
         if(arr[i]==1)
            c1++;
         if(arr[i]==2)
            c2++;
            if(arr[i]==3)
            c3++;
            if(arr[i]==4)
            c4++;
            if(arr[i]==5)
            c5++;
        }
        if(c1>=c2 && c1>=c3 && c1>=c4 && c1>=c5)
            return 1;
        else{
             if(c2>=c1 && c2>=c3 && c2>=c4 && c2>=c5)
                return 2;
            else{
                if(c3>=c2 && c3>=c1 && c3>=c4 && c3>=c5)
                   return 3;
                else{
                    if(c4>=c2 && c4>=c3 && c4>=c1 && c4>=c5)
                        return 4;
                    else{
                        return 5;
            }}}}
        
     }

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
            int x=migratoryBirds(arr,n);
            System.out.println(x);
    }
}
//https://www.hackerrank.com/challenges/migratory-birds/problem
