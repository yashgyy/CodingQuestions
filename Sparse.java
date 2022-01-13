#hackerrank
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
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    // Write your code here
    
        HashMap<String,Integer> k1 = new HashMap<String,Integer>();
        for (String str:strings){
            if (k1.containsKey(str)){
                k1.put(str,k1.get(str)+1);
            } else {
                k1.put(str,1);
            }
        }
        ArrayList<Integer> freq = new ArrayList<Integer>();
        for (String abc:queries){
            freq.add(k1.getOrDefault(abc,0));
        }
        return freq;

    }

}
