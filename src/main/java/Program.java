import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Program {
    public static void main(String[] args) {
        LinkedList<Integer> lList= new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        lList.add(123);
        lList.add(456);
        lList.add(789);

        queue.add(7);
        queue.add(99);
        queue.remove();
        queue.add(107);

        priorityQueue.add(45);
        priorityQueue.add(2);
        priorityQueue.add(88);
        priorityQueue.poll();

        System.out.println(lList);
        System.out.println(queue);
        System.out.println(priorityQueue);
    }
}
