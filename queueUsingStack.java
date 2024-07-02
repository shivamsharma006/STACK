import java.util.*;

public class queueUsingStack {

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    // insertion of new element in the stack
    // time complexity: O(1)
    static void enQueue(int data){
        stack1.push(data);
    }
    // to remove the element from the stack
    // time complexity: O(n)
    static int deQueue(){
        int ele;
        if(stack1.empty() && stack2.empty()){
            System.out.println("Queue is empty.");
            System.exit(0);
        }

        if(stack2.empty()){
            while(!stack1.empty()){
                ele = stack1.pop();
                stack2.push(ele);
            }
        }
        // to return the deleted element from the queue
        ele = stack2.pop();
        return ele;
    }

    public static void main(String[] args) {
        queueUsingStack q = new queueUsingStack();
        q.enQueue(4);
        q.enQueue(10);
        q.enQueue(7);
        q.enQueue(3);
        q.enQueue(8);

        
        // deletion of an element in the queue
        // FIFO - First In First Out
        System.out.println("Deleted element is: "+q.deQueue());
        System.out.println("Deleted element is: "+q.deQueue());
    }
}
