package String;

public class StringBasics {

    public static void main(String args[])
    {
        String string1 = " Prabu Balamurugan ";
        String string2 = "Virat Kohli";

        System.out.println("The string created with string literal : "
        + string1);
        System.out.println("The string created with string objects : "
        + string2);

        System.out.println("The length of string " + string1 + " is : " + string1.length());

        System.out.println("To uppercase : " + string1.toUpperCase());

        System.out.println("To Lowercase : " + string2.toLowerCase());

        System.out.println("To check whether string 1 is empty : " + string1.isEmpty());

        System.out.println("Check both strings are same : " + string1.equals(string2));

        System.out.println("To get character at index 5 : " + string1.charAt(5));

        System.out.println("Trimming white spaces : " + string1.trim());

        System.out.println("Equal Ignore Case : " + string1.equalsIgnoreCase(string2));

        char[] ch = string1.toCharArray();
        System.out.println("THe array characters are : ");
        for(char ch1 : ch)
        {
            System.out.println(ch1);
        }

        System.out.println("Code Point at : " + string1.codePointAt(4));

        System.out.println("Check string contains : " + string1.contains("murugan"));

        System.out.println("Content equals : " + string1.contentEquals(string2));

        System.out.println("Concat : " + string1.concat(string2));

        System.out.println("Substring : " + string1.substring(4));

        System.out.println("Substring first and last index : " + string1.substring(3, 9));

        System.out.println("String starts with check : " + string1.startsWith("P"));

        String splitString[] = string1.split(" ");
        System.out.println("Split Strings : ");
        for(String s : splitString)
        {
            System.out.println(s);
        }

        String splitString2[] = string2.split("a");
        System.out.println("Split Strings using a : ");
        for(String s1 : splitString2)
        {
            System.out.println(s1);
        }







    }
}
