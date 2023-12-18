package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {


    public static void main(String args[])
    {
        //Assign Map values and print it as entry sets
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Prabu");
        map.put(2, "Karthik");
        map.put(3, "Rohit");
        System.out.println("The map key-values are : \n"
        + map.entrySet());

        //Check if Map is empty or not
        boolean status = map.isEmpty();
        System.out.println("The status of map having elements is : \n"
        + status);

        //Clear all map elements
        map.clear();
        System.out.println("The map key-values are after clearing is : \n"
        + map.entrySet());
        System.out.println("The status of map having elements after clearing all is : \n"
        + map.isEmpty());

        Map<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "Prabu");
        map1.put(2, "Karthik");
        map1.put(3, "Rohit");

        //Check if map contains specific key
        System.out.println("Check if map contains 2 : \n"
        + map1.containsKey(2));

        //Check if map contains specific value
        System.out.println("Check if map contains value - karthik is : \n"
        + map1.containsValue("Karthik"));

        //Print all hashcode
        System.out.println("Print all hashcode : \n"
        + map1.hashCode());

        //Print all map key-value pairs
        for(Map.Entry<Integer, String> entry : map1.entrySet())
                {
                    System.out.println(entry.getKey() + " + " + entry.getValue());
                }

        //Remove specific key
        map1.remove(1);
        System.out.println("Map after removing key 1 : \n"
        + map1.entrySet());

        //Getting values
        System.out.println("Getting values of specific keys : \n"
        + "Available value at key 2 \n" + map1.get(2)
        + "\n Removed value at key 1 \n" + map1.get(1));

        //Adding removed value again at given key
        map1.put(1, "Prabu");
        System.out.println("Adding Prabu again \n"
        + map1.get(1));

        //Print all key value pairs with hashcode
        for(Map.Entry<Integer, String> e1 : map1.entrySet())
        {
            System.out.println("Key is " + e1.getKey()
            + "\t"
            + "Value is " + e1.getValue()
            + "\t"
            + "hashcode is " + e1.hashCode());
        }

        map1.remove(2);
        map1.put(2, "");
        for(Map.Entry<Integer, String> e2 : map1.entrySet())
        {
            if(e2.getValue().isEmpty())
            {
                e2.setValue("Kohli");
            }
        }

        for(Map.Entry<Integer, String> e3 : map1.entrySet())
        {
            System.out.println("Key is " + e3.getKey()
                    + "\t"
                    + "Value is " + e3.getValue()
                    + "\t"
                    + "hashcode is " + e3.hashCode());
        }

        map1.replace(1, "Prabu", "Pandya");
        System.out.println(map1.get(1));
        map1.replace(2, "Gill");
        System.out.println(map1.get(2));







    }
}
