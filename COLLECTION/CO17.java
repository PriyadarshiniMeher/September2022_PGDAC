
//Java program to convert HashSet to array
  
import java.io.*;
import java.util.*;
  
class CO17 {
    public static void main(String[] args)
    {
        HashSet<String> set = new HashSet<String>();
        set.add("priyanka");
        set.add("pratiksha");
        set.add("pratik");
        set.add("priydarshini");
        set.add("prathmesh");
  
        System.out.println("Hash Set Contains :" + set);
        String arr[] = new String[set.size()];
        
        // toArray() method converts the set to array
        set.toArray(arr);
  System.out.println("after converting to array:");
        for (String n : arr)
            System.out.println(n);
    }
}