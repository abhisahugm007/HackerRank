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

public static void main(String[] args){

        int[] alice=new int[3];
        int[] bob=new int[3];
        int[] result=new int[2];

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            alice[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            bob[i]=sc.nextInt();
        }int a=0,b=0;
        for(int i=0;i<3;i++){
            if(alice[i]>bob[i])
                result[0]=++a;
            if(alice[i]<bob[i])
                result[1]=++b;
        }
        System.out.println(result[0]+" "+result[1]);

    }
}

//https://www.hackerrank.com/challenges/compare-the-triplets/problem
