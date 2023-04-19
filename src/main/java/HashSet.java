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
    }
}
