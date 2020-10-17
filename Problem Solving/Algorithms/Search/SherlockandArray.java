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

    // Complete the balancedSums function below.
    static String balancedSums(List<Integer> arr) {

        int n=arr.size();
        int sum=0;
        int[] left=new int[n];
        int[] right=new int[n];
        left[0]=right[0]=0;
        for(int i=1;i<n;i++){
            sum=sum+arr.get(i-1);
            left[i]=sum;
        }sum=0;
        for(int i=1;i<n;i++){
            sum=sum+arr.get(n-i);
            right[i]=sum;
        }
        // for(int i=0;i<n;i++){
        //     System.out.print(left[i]+" ");
        // }System.out.println("  ");
        // for(int i=0;i<n;i++){
        //     System.out.print(right[i]+" ");
        // }
        for(int i=0;i<n;i++){
            if(left[i]==right[n-i-1])
                return "YES";
        }
        return "NO";





    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, T).forEach(TItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                String result = balancedSums(arr);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

//https://www.hackerrank.com/challenges/sherlock-and-array/problem
