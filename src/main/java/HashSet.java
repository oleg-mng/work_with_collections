import java.util.Arrays;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<Integer> hashSet = new java.util.HashSet<>();
        hashSet.add(1);
        hashSet.add(345);
        hashSet.add(77);
        hashSet.add(null);
        System.out.println(hashSet);
        System.out.println(hashSet.size());
        hashSet.remove(345);
        System.out.println(hashSet);
        for (Integer integer : hashSet) {
            System.out.printf("%d ", integer);
        }
        hashSet.clear();
        System.out.println();
        System.out.println(hashSet);

        var a = new java.util.HashSet<>(Arrays.asList(1, 3, 4, 5, 6, 7, 8, 9));
        var b = new java.util.HashSet<>(Arrays.asList(7, 8, 9, 11, 12, 14));
        var u = new java.util.HashSet<>(a);
        u.addAll(b);
        var v = new java.util.HashSet<>(a);
        v.retainAll(b);
        var s = new java.util.HashSet<>(a);
        s.removeAll(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(u);
        System.out.println(v);
        System.out.println(s);

    }
}
