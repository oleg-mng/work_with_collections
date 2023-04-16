import java.util.HashMap;
import java.util.logging.SocketHandler;

public class Map {
    public static void main(String[] args) {
        Integer a = 33;
        java.util.Map<Integer, String> hmp = new HashMap<>();

        hmp.putIfAbsent(1, "Карта города");


        System.out.println(a.hashCode());
        System.out.println("z".hashCode());

        System.out.println(hmp);
    }
}
