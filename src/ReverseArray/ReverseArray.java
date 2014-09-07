package ReverseArray;

import java.util.ArrayList;

/**
 * Created by Jude Baffico on 9/7/14.
 */
public class ReverseArray {

    /**
     * Main method
     * Create an array of strings
     * Create a new array and reverse the order
     * Print out to console the results
     * @param args
     */
    public static void main(String[] args)
    {
        //Declare and initialize the String Array
        String[] climbingGear = {"cam", "carabiner", "harness", "helmet", "rope"};

        //Create a new array to store the reversed list
        ArrayList<String> result = new ArrayList<String>();

        //Loop through the String Array and reverse the order then print the new list
        for (int i = climbingGear.length -1; i >= 0; i--)
        {
            result.add(climbingGear[i]);
        }

        System.out.println(result);
    }
}
