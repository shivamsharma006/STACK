// Implementation of the functions available in the queue data structure in Java

import java.util.*;

class queueImplement{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        
        // to insert the data in the queue - enqueue
        for(int i = 0; i < 10; i++){
            q.add(i);
        }

        System.out.println("Queue looks like: " + q);

        // to print the topmost element in the queue
        System.out.println("The top most element in the queue before deletion is: " + q.peek());

        // to remove the element from the queue
        q.remove();

        // to print the topmost element in the queue
        System.out.println("The top most element in the queue after deletion is: " + q.peek());

        // the size of the current queue
        System.out.println("The size of the queue is: " + q.size());
    }
}
