import java.util.ArrayList;
import java.util.LinkedList;

public class ListComparison {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");

        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C++");

        System.out.println("ArrayList Initial: " + arrayList);
        System.out.println("LinkedList Initial: " + linkedList);

        arrayList.add(1, "JavaScript");
        linkedList.add(1, "JavaScript");
        System.out.println("\nAfter Add at index 1:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        String arrayElement = arrayList.get(2);
        String linkedElement = linkedList.get(2);
        System.out.println("\nGet element at index 2:");
        System.out.println("ArrayList: " + arrayElement);
        System.out.println("LinkedList: " + linkedElement);

        arrayList.remove(1);
        linkedList.remove(1);
        System.out.println("\nAfter Remove at index 1:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
    }
}
