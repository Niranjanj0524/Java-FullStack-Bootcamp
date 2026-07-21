import java.util.HashSet;
import java.util.Scanner;

public class UniqueWordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter a sentence:");
        String sentence = sc.nextLine();
        
        String cleanSentence = sentence.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "");
        
        String[] words = cleanSentence.split("\\s+");
        
        HashSet<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            if (!word.isEmpty()) { 
                uniqueWords.add(word);
            }
        }
        
        System.out.println("\n--- Result ---");
        System.out.println("Unique words: " + uniqueWords);
        System.out.println("Total unique words count: " + uniqueWords.size());
        
        sc.close();
    }
}
