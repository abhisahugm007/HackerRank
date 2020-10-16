import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the camelcase function below.
    static int camelcase(String s) {
        int count=0;
        if(s.length()!=0){
            count=1;
            for(int i=1;i<s.length();i++){
                if(Character.isUpperCase(s.charAt(i)))
                    count++;
            }
            
    }else{
                count=0;
            }
            return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = camelcase(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

/*Alice wrote a sequence of words in CamelCase as a string of letters,

, having the following properties:

    It is a concatenation of one or more words consisting of English letters.
    All letters in the first word are lowercase.
    For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.

Given
, print the number of words in

on a new line.

For example,
. There are

words in the string.

Function Description

Complete the camelcase function in the editor below. It must return the integer number of words in the input string.

camelcase has the following parameter(s):

    s: the string to analyze

Input Format

A single line containing string

.

Constraints

Output Format

Print the number of words in string

.

Sample Input

saveChangesInTheEditor

Sample Output

5

Explanation

String

contains five words:

    save
    Changes
    In
    The
    Editor

Thus, we print
on a new line.
*/
