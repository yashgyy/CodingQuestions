//Hackerrank
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

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    String s1 = s.substring(s.length()-2,s.length());
    if(s1.equals("PM")){
        String Temp = s.substring(0,2);
        int x1 = Integer.valueOf(Temp);
        int x2 = x1%12;
        return Integer.toString(x2+12)+s.substring(2,s.length()-2);
        
    } else {
        
    }
    
   
        String Temp = s.substring(0,2);
        int x1 = Integer.valueOf(Temp);
        int x2 = x1%12;
        String x3 = String.format("%02d", x2);
        return x3+s.substring(2,s.length()-2);
    }

}
