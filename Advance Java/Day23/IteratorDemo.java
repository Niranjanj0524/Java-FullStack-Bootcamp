import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();

        name.add("Niranjan");
        name.add("Yash");
        name.add("Nandini");
        name.add("Ira");
        name.add("Varad");

        Iterator<String> itr = name.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}