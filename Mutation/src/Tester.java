import java.util.Random;
import java.util.ArrayList;

public class Tester {



    public static void main(String[] args) {

//        final int MAX = 65536;
//        final int MIN = -32768;

//        BST tree = new BSt();

        oracle();
        oracle();
        oracle();

    }

    public static void oracle()
    {

        final int MAX = 20;
        final int MIN = -10;
        final int SIZE = 20;//number of random numbers

        ArrayList<Integer> values= generateRandomValues(SIZE,MAX,MIN);

////        println("Psudo Random test values:");
//        printArrayList(values);

        BST tree = new BST();


        for(int value: values)
        {
            tree.insert(value);
        }

        println("BST: ");
        tree.display();

        testFind(tree,values);

    }

//    @Test
    public static void testFind(BST tree, ArrayList<Integer> values)
    {
        for(int value: values)
        {
//            assertEquals(true,tree.find(value));
            assert tree.find(value) : false;
            assert true;
        }


    }



    public static void print(Object value)
    {
        /**
         * Prints Object values to the screen.
         *
         * @return void
         */
        System.out.print(value);

    }

    public static void println(Object value)
    {
        /**
         * Prints Object values to the screen.
         *
         * @return void
         */
        System.out.println(value);

    }


    public static ArrayList<Integer> generateRandomValues(int size, int max, int min)
    {
        /**
         * Generates random values and returns them as an arraylist
         *
         * @param size is the number of random values added to the arraylist
         * @param max is the maximum possible value for the random number
         * @param min is the minimum possible value for the random number
         */
        Random rand = new Random();

        ArrayList<Integer> values = new ArrayList<Integer>();

        //generate random values
        for(int i = 0; i < size ; i ++ )
        {
            values.add(rand.nextInt(max)+min);
        }

        return values;

    }

    public static void printArrayList(ArrayList<Integer> list)
    {
        /**
         * prints to screen the array list
         *
         * @list is the arraylist of integer values that will be printed
         * @return void
         */
        for(Object value: list)
        {
            print(value);
            print(", ");
        }
        println("");
    }
}
