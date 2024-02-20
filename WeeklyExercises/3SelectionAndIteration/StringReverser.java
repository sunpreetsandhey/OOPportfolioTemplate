import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String[] words = scanner.nextLine().split("\\s+");
        for (String word : words) {
            System.out.print(new StringBuilder(word).reverse() + " ");
        }
        scanner.close();
    }
}
