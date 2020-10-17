import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s)
    {
        if(s.charAt(8)=='A')
        {
          if(s.charAt(0)=='1'){
            char[] myNameChars = s.toCharArray();
            myNameChars[0] = '0';
            myNameChars[1] = '0';
            return String.valueOf(myNameChars).substring(0,8);
            }
            return s.substring(0,8);
        }              
        else{
            if(s.charAt(8)=='P' && s.charAt(0)=='1' && s.charAt(1)=='2')
                return s.substring(0,8);
            else{
                int x=Integer.parseInt(s.substring(0,2));
                int sum=x+12;
                String time=String.valueOf(sum)+s.substring(2,8);
                return time;
            }
           
        }
         
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}

//https://www.hackerrank.com/challenges/time-conversion/problem
