import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the missingNumbers function below.
    static int[] missingNumbers(int[] arr, int[] brr) {
        int[] miss=new int[brr.length-arr.length];
        List<Integer> al = new ArrayList<>();
        Arrays.sort(arr);
        Arrays.sort(brr);
        int i=0,j=0,k=0;
        while(j<brr.length)
        {
            if(i<arr.length){
                if(arr[i]>brr[j])
                { int flag=0;
                    for(int n : miss){
                        if(n==brr[j]){
                            flag=1;
                            break;
                        }
                    }if(flag==0){
                        miss[k]=brr[j];
                        al.add(brr[j]);
                        k++;
                    }
                    j++;
                }else{
                    j++;i++;
                }
            }else{
                int flag=0;
                    for(int n : miss){
                        if(n==brr[j]){
                            flag=1;
                            break;
                        }
                    }if(flag==0){
                        miss[k]=brr[j];
                         al.add(brr[j]);
                        k++;
                    }
                    j++;
                
            }
            
    }System.out.println(al.size()+"  ..."+k);
    int[] newmiss=new int[al.size()];
    for(int m=0;m<al.size();m++)
    {
        newmiss[m]=al.get(m);
    }
    //Arrays.sort(miss);
        return newmiss;

}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] brr = new int[m];

        String[] brrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrItems[i]);
            brr[i] = brrItem;
        }

        int[] result = missingNumbers(arr, brr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

//https://www.hackerrank.com/challenges/missing-numbers/problem
