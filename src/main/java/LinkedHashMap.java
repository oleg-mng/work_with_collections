public class LinkedHashMap {
    public static void main(String[] args) {
        java.util.LinkedHashMap<Integer, String> linkedHashMap = new java.util.LinkedHashMap<>();
        linkedHashMap.put(57, "Head");
        linkedHashMap.put(13, "Moon");
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.entrySet());
        System.out.println(linkedHashMap);
    }
}
