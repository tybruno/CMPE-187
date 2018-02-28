import java.util.ArrayList;

public class Palindrome {

    public static void main(String[] args){
        String p1 = "poop";
        String p2 = "lol";
        String mistake1 = "Mistake";


        ArrayList<String> list = new ArrayList<>();

        list.add(p1);
        list.add(p2);
        list.add(mistake1);

        for(String s: list)
        {
            print(s + " is palindrome: " + isPalindrom(s));
        }

    }
    public static int getSize(String s){
        /**
         * Gets the size of the string.
         *
         * @param s string that we want to know the size
         * @return the lenghth of the string
         */
        return s.length();

    }


    public static boolean isPalindrom(String s){
        /**
         * checks if the string is a palindrome
         *
         * @param s is the string we check if it is a palindrome
         * @return true if string is a palindrome
         */

        //Reverse string and save it
        String reversed = reverseString(s);

        //If the old string and the reversed string are equal, return true
        if(s.toLowerCase().equals(reversed))
        {
            return true;
        }

        return false;
    }

    public static String reverseString(String s){
        /**
         * reverse the string
         *
         * @param s the string that will be reversed
         *
         * @return the string in reverse
         */
        String reversed = "";

        //Reverse the string
        for(int i = s.length()-1; i >= 0; i--) {
           reversed += s.charAt(i);

        }
        return reversed;
    }


    public static void print(Object s){
        /**
         * Print the object.
         *
         * @param s is the object that will be printed
         */
        System.out.println(s);
    }


}





