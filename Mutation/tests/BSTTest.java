import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static org.junit.Assert.*;

public class BSTTest {


    @Test
    public void getRootNodeValue() {

        BST tree = new BST();

        assertNull(tree.getRootNode());

        ArrayList<Integer> randValues = oracle();

        tree.addArrayList(randValues);

        assertEquals(randValues.get(0),(Integer) tree.getRootNodeValue());
    }

    @Test
    public void find() {


        ArrayList<Integer> randValues = oracle();

        BST tree = new BST(randValues);



        for(int value: randValues){

            assertTrue(tree.find(value));

        }

    }

    @Test
    public void delete() {
        ArrayList<Integer> randValues = oracle();

        BST tree = new BST(randValues);

        for(int value: randValues){

            System.out.println(value);

            //assertTrue(tree.delete(value));
        }

        System.out.println("\n");

        for(int value: randValues){

            System.out.println(value);
            System.out.println(tree.delete(value));
            //assertTrue(tree.delete(value));
        }

    }

    @Test
    public void minValue(){
        ArrayList<Integer> randValues = oracle();

        BST tree = new BST(randValues);

        Collections.sort(randValues);

        assertEquals(randValues.get(0),(Integer) tree.minValue());
    }

    @Test
    public void getSuccessor() {


    }

    @Test
    public void insert() {
        ArrayList<Integer> randValues = oracle();

        BST tree = new BST();

        ArrayList<Integer> noDuplicateValues = removeDuplicates(randValues);

        for(int value: randValues)
        {
            assertTrue(tree.insert(value));
        }


    }

    @Test
    public void display() {

        ArrayList<Integer> randValues = oracle();

        BST tree = new BST(randValues);

        tree.display();
        randValues = removeDuplicates(randValues);
        Collections.sort(randValues);

        String stringVal= randValues.toString();
        String temp= "";
        for(int i = 0; i < randValues.size();i++)
        {

                temp += " "+ randValues.get(i).toString();

        }


    }



    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list){
        ArrayList<Integer> noDuplicates = new ArrayList<>();

        for(int i = 0; i < list.size();i++)
        {
            if(!noDuplicates.contains(list.get(i)))
            {
                noDuplicates.add(list.get(i));
            }
        }
        return noDuplicates;
    }

    public static ArrayList<Integer>oracle()
    {
        final int MAX = 20;
        final int MIN = -10;
        final int SIZE = 20;//number of random numbers

        ArrayList<Integer> values= generateRandomValues(SIZE,MAX,MIN);

        return values;
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
}

