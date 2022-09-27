package BroCodeCourse;
import java.util.LinkedList;
import java.util.Queue;

public class Queuee{
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Louis");
        queue.offer("Patricia");
        queue.offer("Damien");
        queue.offer("Dominic");
        queue.offer("Devan");

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Damien"));
        System.out.println(queue);
        System.out.println(queue.peek());

        queue.poll();
        queue.poll();
        queue.poll();

        System.out.println(queue);
        System.out.println(queue.peek());



        
    }
}