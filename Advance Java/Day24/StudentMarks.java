import java.util.ArrayList;
import java.util.Collections;

public class StudentMarks {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(99);
        marks.add(55);
        marks.add(77);
        marks.add(43);
        marks.add(67);

        System.out.println("---All Marks in ArrayList---");
        System.out.println(marks);

        System.out.println("---Max Marks---");
        int max = Collections.max(marks);
        System.out.println(max);

        System.out.println("---Min Marks---");
        int min = Collections.min(marks);
        System.out.println(min);
    }
}
