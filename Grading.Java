#Hackerrank
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
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
        ArrayList<Integer> new1 = new ArrayList<Integer>();
        for (int i=0;i<grades.size();i++){
            int temp = grades.get(i);
            if (temp<38) {
                new1.add(temp);
            }
            else {
                int no =  temp / 5;
                if((5*(no+1)-temp)<3){
                    int temp1 = 5*(no+1);
                    new1.add(temp1);
                } else new1.add(temp);
            }
        }
        return new1;
        
    }

}
