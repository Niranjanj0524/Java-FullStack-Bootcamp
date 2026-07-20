import java.util.ArrayList;

public class ArrayListCRUD {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Initial List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.set(2, "Grapes"); 
        System.out.println("\nAfter Update (Index 2 changed to Grapes):");
        System.out.println(fruits);

        String searchItem = "Apple";
        if (fruits.contains(searchItem)) {
            System.out.println("\nSearch: " + searchItem + " is found in the list.");
        } else {
            System.out.println("\nSearch: " + searchItem + " is not found in the list.");
        }

        fruits.remove("Orange"); 
        System.out.println("\nAfter Removing 'Orange':");
        System.out.println(fruits);
    }
}
