import java.util.HashSet;
import java.util.ArrayList;

public class HashSetDemo {
    public static void main(String[] args) {
        ArrayList<String> studName = new ArrayList<>();
        studName.add("Niranjan");
        studName.add("Yash");
        studName.add("Nandini");
        studName.add("Ira");
        studName.add("Niranjan");
        studName.add("Yash");

        System.out.println("Name in LinkedList : " + studName);
        

        HashSet<String> uniqeSet = new HashSet<>(studName);

        System.out.println("Name is HashSet : " + uniqeSet);

    }
}