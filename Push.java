
import java.util.*;
 
public class Push {
    public static void main(String args[])
    {
        
        Stack<Integer> STACK = new Stack<Integer>();
 
        // Use push() to add elements into the Stack
        STACK.push(10);
        STACK.push(15);
        STACK.push(30);
        STACK.push(20);
        STACK.push(5);
        STACK.push(null);
 
        
        System.out.println("Initial Stack: " + STACK);
 
        
        STACK.push(1254);
        STACK.push(4521);
 
        
        System.out.println("Final Stack: " + STACK);
    }
}