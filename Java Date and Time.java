
/**
 * The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.
 * <p>
 * You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
 * <p>
 * For example, if you are given the date , the method should return  as the day on that date.
 * <p>
 * image
 * <p>
 * Input Format
 * <p>
 * A single line of input containing the space separated month, day and year, respectively, in    format.
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * Output the correct day in capital letters.
 * <p>
 * Sample Input
 * <p>
 * 08 05 2015
 * Sample Output
 * <p>
 * WEDNESDAY
 * Explanation
 * <p>
 * The day on August th  was WEDNESDAY.
 */
 
 
 ✔Solution
 
 
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
    
    //Solution Code
        
        Calendar cal = Calendar.getInstance();
        
        cal.set(Calendar.MONTH, month-1);
        
        cal.set(Calendar.DAY_OF_MONTH, day);
        
        cal.set(Calendar.YEAR, year);
        
        String[] day_of_week = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        
        return day_of_week[cal.get(Calendar.DAY_OF_WEEK)-1];
        
        //Solution Code

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
