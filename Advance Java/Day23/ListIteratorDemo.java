import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        ListIterator<String> itrList = list.listIterator();

        System.out.println("Forward Traversal : ");
        while(itrList.hasNext()){
            System.out.println(itrList.next());
        }

        System.out.println("\nBackward Traversal : ");
        while(itrList.hasPrevious()){
            System.out.println(itrList.previous());
        }
    }
}
