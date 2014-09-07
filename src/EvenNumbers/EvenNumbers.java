package EvenNumbers;

/**
 * Created by Jude Baffico on 9/7/14.
 */
public class EvenNumbers {

    /**
     * Loops thru a for loop printing out all even numbers between 0 and 100
     * @param args
     */
    public static void main( String args[])
    {
        //Initialize the variable x
        int x;

        //Assign x = 2 to start the even count
        //The loop will continue until x is equal to 100
        //Increment x by 2 each time the loop is executed
        for(x = 2; x <= 100; x += 2)
        {
            System.out.println(x);
        }
    }
}
