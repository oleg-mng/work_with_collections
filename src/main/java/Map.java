import java.util.HashMap;
import java.util.logging.SocketHandler;

public class Map {
    public static void main(String[] args) {
        Integer a = 33;
        java.util.Map<Integer, String> hmp = new HashMap<>();

        hmp.putIfAbsent(1, "Map of town");
        hmp.putIfAbsent(2, "Model phone");
        hmp.putIfAbsent(3, "We are right");


        System.out.println(a.hashCode());
        System.out.println("l".hashCode());

        System.out.println(hmp);
        System.out.println(hmp.get(3));
        System.out.println(hmp.containsKey(2));
        System.out.println(hmp.containsValue("Model phone"));
        System.out.println(hmp.keySet());
        System.out.println(hmp.values());
        for (java.util.Map.Entry<Integer, String> entry : hmp.entrySet()) {
            System.out.println(entry);
        }
    }
}
