package BroCodeCourse;
import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueuee {
    public static void main(String[] args) {
        Queue<Double> gpa = new PriorityQueue<Double>();

        gpa.offer(4.5);
        gpa.offer(2.5);
        gpa.offer(2.0);
        gpa.offer(3.5);
        gpa.offer(3.0);

        System.out.println(gpa + "\n");

        

        while(!gpa.isEmpty()) {
            System.out.println(gpa.poll());
        }

        System.out.println();

        System.out.println(gpa);



    }
}
