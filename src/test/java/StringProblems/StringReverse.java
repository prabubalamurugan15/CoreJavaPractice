package StringProblems;

public class StringReverse {

    public String stringReverse(String string)
    {
        String reverse = "";
        int length = string.length();

        for(int i= length-1; i>=0; i--)
        {
            reverse += string.charAt(i);
        }

        return reverse;
    }

    public String stringReverseInWords(String string)
    {
        String reverse = "";
        String givenString = string.replace(".", "");
        String reverseWords = "";
        String[] words = givenString.split(" ");

        for(String s : words)
        {
            for(int i = s.length()-1; i>=0; i--)
            {
                reverseWords += s.charAt(i);
            }
            reverse += reverseWords + " ";
            reverseWords = "";
        }
        return reverse;
    }

    public boolean palindromeCheck(String string)
    {
        boolean status = false;
        String palindrome = string.replace(" ", "").trim().toLowerCase();

        String reverse = "";
        for(int i= palindrome.length() -1; i>=0; i--)
        {
            reverse += palindrome.charAt(i);
        }
        System.out.println(reverse);

        if(reverse.equals(palindrome))
        {
            status = true;
        }
        else
        {
            status = false;
        }
        return status;
    }

    public String reverseWordsByPositions(String string)
    {
        String stringReverseWords = "";
        

        return stringReverseWords;
    }


    public static void main(String args[])
    {
        StringReverse object = new StringReverse();
        String string = "My name is Prabu Balamurugan. I work as an Lead Quality Engineer.";
        String string1 = "Madam";

        //Original String
        System.out.println("The original given string is : \n" + string);

        //Reverse of string
        System.out.println("The reverse of given string : \n"
        + object.stringReverse(string));

        //Reverse of String in Words
        System.out.println("The reverse of given string in words : \n"
        + object.stringReverseInWords(string));

        //To check given string is palindrome or not
        System.out.println("Given string is palindrome or not : " + object.palindromeCheck(string1));
    }
}
