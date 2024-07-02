import java.util.LinkedList;
import java.util.Queue;

public class stackUsingQueue {

    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();


    static void add(int data){
        //1. Push into queue2 from queue1
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.poll(); //poll is similar to remove function
        }

        //2. Add elementi in q1
        q1.add(data);

        //3.Move back all the data elements from q2 to q1
        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.poll();
        }
    }


    static int remove(){
        if(q1.isEmpty()){
            System.out.println("Stack underflow");
            System.exit(0);
        }
        int ele = q1.peek();
        q1.poll();
        return ele;
    }

    public static void main(String[] args) {
        stackUsingQueue s = new stackUsingQueue();
        //push the operation in the stack
        s.add(4);
        s.add(7);
        s.add(10);
        s.add(78);
        s.add(2);
          // pop the element from the stack
        System.out.println("Deleted element is:" + s.remove());
        System.out.println("Deleted element is:" + s.remove());
    }
}
