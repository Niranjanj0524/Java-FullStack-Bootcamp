import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> Lset = new LinkedHashSet<>();

        HashSet<String> set = new HashSet<>();

        Lset.add("Niranjan");
        Lset.add("Nandini");
        Lset.add("Yash");
        Lset.add("Ira");
        System.out.println("LinkedHashSet : " + Lset);

        set.add("Niranjan");
        set.add("Nandini");
        set.add("Yash");
        set.add("Ira");
        System.out.println("HashSet : " + set);
    }
}
