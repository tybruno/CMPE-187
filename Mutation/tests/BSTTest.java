import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.*;

public class BSTTest {
    final int MAX = 20;
    final int MIN = -10;
    final int SIZE = 20;//number of random numbers

    ArrayList<Integer> values= generateRandomValues(SIZE,MAX,MIN);

    BST tree = new BST();


    for(int value: values)
    {
        tree.insert(value);
    }
    @Test
    public void getRootNode() {



    }

    @Test
    public void getRootNodeValue() {



    }

    @Test
    public void find() {


    }

    @Test
    public void delete() {
    }

    @Test
    public void getSuccessor() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void display() {
    }

    @Test
    public void display1() {
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
}

