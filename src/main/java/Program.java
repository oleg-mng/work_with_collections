import java.util.*;

public class Program {
    public static void main(String[] args) {
        LinkedList<Integer> lList= new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Deque<Integer> deque = new ArrayDeque<>();

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

        deque.addFirst(5);
        deque.addLast(7);
        deque.removeLast();
        deque.offerFirst(777);
        deque.offerLast(555);
        deque.offer(0);
//        deque.pollLast();
//        deque.getLast();


        System.out.println(lList);
        System.out.println(queue);
        System.out.println(priorityQueue);
        System.out.println(deque);
        System.out.println(deque.peekLast());
    }
}
