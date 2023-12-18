package Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapPractice {


    public static void main(String args[])
    {
        SortedMap<Integer, String> sortedMap = new
                TreeMap<Integer, String>();
        sortedMap.put(4, "Prabu");
        sortedMap.put(2, "Kohli");
        sortedMap.put(3, "Rohit");
        sortedMap.put(1, "Laxman");

        System.out.println(sortedMap);

        SortedMap<Integer, String> sortedMap1 = new
                TreeMap<Integer, String>(
                Collections.reverseOrder()
        );
        sortedMap1.put(1, "Prabu");
        sortedMap1.put(2, "kohli");
        sortedMap1.put(3, "Rohit");
        sortedMap1.put(4, "laxman");

        System.out.println(sortedMap1);

        sortedMap1.put(5, "Kane");
        sortedMap1.put(9, "Rachin");
        sortedMap1.put(6, "Sodhi");

        System.out.println(sortedMap1);

        System.out.println("Getting head of 3 : "
        + sortedMap1.headMap(3));

        System.out.println("Getting last of 3 : "
        + sortedMap1.tailMap(3));

        System.out.println("Getting sub values between 3 & 7"
                + sortedMap1.subMap(6, 3));

        System.out.println("Getting the first key value is : "
        + sortedMap1.firstKey());

        System.out.println("Getting the last key value is : "
        + sortedMap1.lastKey());

        Comparator comparator = sortedMap1.comparator();
        System.out.println("using comparator : "
        +comparator);






    }

}
