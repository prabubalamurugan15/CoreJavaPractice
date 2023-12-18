package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedhashMapPractice
{

    public static final int max = 6;

    public static void main(String args[])
    {

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>()
        {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                return size() > max;
            }
        };

        linkedHashMap.put("Prabu", 1);
        linkedHashMap.put("Rohit", 2);

        System.out.println(linkedHashMap);

        linkedHashMap.put("Kohli", 3);
        linkedHashMap.put("Iyer", 4);

        System.out.println(linkedHashMap);

        linkedHashMap.put(null, null);
        System.out.println(linkedHashMap);

        linkedHashMap.put("KL", 6);
        System.out.println(linkedHashMap);

        linkedHashMap.put("Irfan", 7);
        System.out.println(linkedHashMap);

        linkedHashMap.put("Myskkin", 8);
        System.out.println(linkedHashMap);


    }
}
