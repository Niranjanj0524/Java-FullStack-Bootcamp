import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class RankListManager {
    private Map<Integer, String> rankMap;

    public RankListManager() {
        rankMap = new TreeMap<>();
    }

    public void addStudent(int rank, String name) {
        if (rankMap.containsKey(rank)) {
            System.out.println("Rank " + rank + " is already assigned to " + rankMap.get(rank));
        } else {
            rankMap.put(rank, name);
            System.out.println("Student added to rank list.");
        }
    }

    public void searchByRank(int rank) {
        if (rankMap.containsKey(rank)) {
            System.out.println("Rank " + rank + ": " + rankMap.get(rank));
        } else {
            System.out.println("No student found at Rank " + rank);
        }
    }

    public void removeRank(int rank) {
        if (rankMap.containsKey(rank)) {
            String removedStudent = rankMap.remove(rank);
            System.out.println("Removed " + removedStudent + " from Rank " + rank);
        } else {
            System.out.println("Rank " + rank + " not found.");
        }
    }

    public void displayRankList() {
        if (rankMap.isEmpty()) {
            System.out.println("Rank list is empty.");
            return;
        }
        System.out.println("--- Sorted Rank List ---");
        for (Map.Entry<Integer, String> entry : rankMap.entrySet()) {
            System.out.println("Rank: " + entry.getKey() + ", Student Name: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        RankListManager manager = new RankListManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n*** Rank List Menu ***");
            System.out.println("1. Add Student Rank");
            System.out.println("2. Search by Rank");
            System.out.println("3. Remove Rank");
            System.out.println("4. Display Rank List (Sorted)");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Rank: ");
                    int rank = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    manager.addStudent(rank, name);
                    break;
                case 2:
                    System.out.print("Enter Rank to Search: ");
                    int searchRank = scanner.nextInt();
                    manager.searchByRank(searchRank);
                    break;
                case 3:
                    System.out.print("Enter Rank to Remove: ");
                    int removeRank = scanner.nextInt();
                    manager.removeRank(removeRank);
                    break;
                case 4:
                    manager.displayRankList();
                    break;
                case 5:
                    System.out.println("Exiting Rank List Manager.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
