package Stack;

/**
 * Created by Jude Baffico on 9/7/14.
 * Credit: From www.beingjavaguys.com
 *
 * What I learned:
 * Stack is a restricted data structure
 * Last in is the first out, leaving the bottom of the stack the last to come out
 * Push adds to the stack
 * Pop removes from the top of the stack
 * This seems like it is like a LinkedHashMap or an ordered array
 * Would love to discuss more about how you use this (if at all)
 */
public class PushPop {

    private static final int capacity = 3;

    //Create and initialize an array of 3 elements
    int arr[] = new int[capacity];
    int top = -1;

    public static void main(String[] args) {
        //Instantiate a type of PushPop
        PushPop pushPopDemo = new PushPop();

        pushPopDemo.pop();
        pushPopDemo.push(23);
        pushPopDemo.push(2);
        pushPopDemo.push(73);
        //Will not add to the stack
        pushPopDemo.push(21);
        pushPopDemo.pop();
        pushPopDemo.pop();
        pushPopDemo.pop();
        //Nothing to remove from the stack
        pushPopDemo.pop();
    }

    public void push(int pushedElement) {
        if (top < capacity - 1) {
            top++;
            arr[top] = pushedElement;
            System.out.println("Element " + pushedElement
                    + " is pushed to Stack !");
            printElements();
        } else {
            System.out.println("Stack Overflow !");
        }
    }

    public void pop() {
        if (top >= 0) {
            top--;
            System.out.println("Pop operation done !");
            printElements();
        } else {
            System.out.println("Stack Underflow !");
        }
    }

    public void printElements() {
        if (top >= 0) {
            System.out.println("Elements in stack :");
            for (int i = 0; i <= top; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}