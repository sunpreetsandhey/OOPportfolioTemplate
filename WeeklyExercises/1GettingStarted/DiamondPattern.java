public class DiamondPattern { public static void main(String[] args) {

    int numRows = 7;

    for (int i = 1; i <= numRows; i += 2) {
        printSpaces((numRows - i) / 2);
        printStars(i);
    }
    for (int i = numRows - 2; i >= 1; i -= 2) {
        printSpaces((numRows - i) / 2);
        printStars(i);
    }
}
    private static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }
    private static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
