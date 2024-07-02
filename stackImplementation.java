
import java.util.Stack;

public class stackImplementation {
    public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();

            // push the elements inside the stack
            stack.push(4);
            stack.push(9);
            stack.push(6);
            stack.push(2);
            stack.push(10);

            // print the top most element in the stack
        System.out.println("The topmost element in the stack before deletion is: "+stack.peek());

            // delete the top element from the stack
            stack.pop();

            // print the top most element in the stack
            System.out.println("TOP MOST ELEMENT IN THE STACK IS: " + stack.peek());

            
         // Search an element in the stack
         // Search function returns -1 when the element is not present in the stack
         System.out.println("Element 6 present at position: " + stack.search(6));
        
         // Check whether the stack is empty or not
         // empty function returns the boolean value (true/false)
         System.out.println("Is stack empty or not: " + stack.empty());
    }
}
