import java.util.LinkedList;
import java.util.Queue;

public class Program {
    public static void main(String[] args) {
        LinkedList<Integer> lList= new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();

        lList.add(123);
        lList.add(456);
        lList.add(789);

        queue.add(7);
        queue.add(99);
        queue.remove();
        queue.add(107);

        System.out.println(lList);
        System.out.println(queue);
    }
}
