package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapPractice {

    public static void main(String args[])
    {

        HashMap<Integer, String> hashmap1 = new HashMap<>();
        HashMap<Integer, String> hashmap2 = new HashMap<>();
        HashMap<Integer, String> hashMap3 = new HashMap<>();

        hashmap1.put(1, "Rutu");
        hashmap1.put(2, "Jaiswal");
        hashmap1.put(3, "Sky");
        hashmap1.put(4, "Tilak");
        hashmap1.put(5, "Pandya");
        hashmap1.put(6, "Rinku");
        hashmap1.put(7, "Axar");
        hashmap1.put(8, "Chahar");
        hashmap1.put(9, "Washi");
        hashmap1.put(10, "Bumrah");
        hashmap1.put(11, "Arshdeep");

        //Print HashMap as entrySet
        System.out.println("Indian T20 team XI : \n"
        + hashmap1.entrySet());

        //Print hashMap as HashMap
        System.out.println("Indian T20 team XI : \n"
        + hashmap1);

        //Captain - Get specific value
        System.out.println("Captain of T20 team is : \n"
        + hashmap1.get(5));

        //New t20 team XI
        hashmap1.replace(9, "Bishnoi");
        System.out.println("Based on Conditions, replacing a spinner for Washi : \n"
        + hashmap1);

        //If Bumrah rests, Can be replaced with substitute
        hashmap1.replace(10, "Bumrah", "Mukesh");
        System.out.println("After Bumrah replaced : \n"
        + hashmap1.entrySet());

        //Print size
        int totalPlayers = hashmap1.size();
        System.out.println("Total Players in T20 team XI is : " + totalPlayers);

        //Pick same team for ODI XI - Copy
        System.out.println("ODI XI before selection : \n "
        + hashmap2);
        hashmap2.putAll(hashmap1);
        System.out.println("ODI XI after selection from T20 success is : \n"
        + hashmap2);

        //Compare both XIs
        System.out.println("Are we going with Same XI for T20 & ODIs : \n"
        + hashmap1.equals(hashmap2));


        //Test Lineup
        hashMap3.putAll(hashmap1);
        System.out.println("Initial test lineup : \n"
        + hashMap3);

        //Revamping the test side with experience
        hashMap3.remove(1);
        hashMap3.remove(2);
        System.out.println("After removing openers : \n"
        + hashMap3);
        System.out.println("Check if t20 openers is available or not \n"
        + hashMap3.containsKey(1) + hashMap3.containsKey(2));
        System.out.println("Check if Captain slot & Captain name is available now \n"
        + hashMap3.containsKey(5) + " " + hashMap3.containsValue("Pandya"));
        hashMap3.remove(5, "Pandya");
        hashMap3.remove(4, "KL"); //if we give wrong value, it will not remove
        System.out.println("Remove middle order \n"
        + hashMap3);

        //Remove full Test XI
        hashMap3.clear();
        System.out.println("After sacking all new players in Test : \n"
        + hashMap3);

        //Check team is empty now
        System.out.println("Check team is empty or not \n"
        + hashMap3.isEmpty());

        System.out.println(hashMap3.get(1));

        hashMap3.put(1, "Rohit");
        hashMap3.put(2, "KL");
        hashMap3.put(3, "Gill");
        hashMap3.put(4, "Kohli");
        hashMap3.put(5, "Iyer");
        hashMap3.put(6, "Pant");
        hashMap3.put(7, "Jadeja");
        hashMap3.put(8, "Ashwin");
        hashMap3.put(9, "Bumrah");
        hashMap3.put(10, "Shami");
        hashMap3.put(11, "Siraj");
        System.out.println("Test team XI after selection in order-wise : \n");
        for(Map.Entry<Integer, String> e : hashMap3.entrySet())
        {
            System.out.println("Position: " + e.getKey() + " Player: " + e.getValue());
        }
        Set<Integer> slots = hashMap3.keySet();
        for(int i : slots)
        {
            if(i <=5 )
            {
                System.out.println("Position " + i + " Batsman");
            } else if (i ==6 )
            {
                System.out.println("Position " + i + " Wicket-keeper");
            } else if (i ==7)
            {
                System.out.println("Position " + i + " Allrounder");
            }else
            {
                System.out.println("Position " + i + " Bowler");
            }
        }

        //Adding null key & values
        hashMap3.put(null, null);
        System.out.println(hashMap3);
        hashMap3.put(null, "Ishant");
        hashMap3.put(12, null);
        //hashMap3.put(null, null);
        hashMap3.put(13, "Umesh");
        hashMap3.put(13, "Umesh");
        System.out.println(hashMap3);

        System.out.println("Print only player names for Test XI : \n"
        + hashMap3.values());



    }
}
