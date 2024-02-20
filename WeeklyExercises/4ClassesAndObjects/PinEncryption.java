import java.util.Random;
import java.util.Scanner;
public class PinEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 4 digit pin number to encrypt: ");
        int pin = scanner.nextInt();
        if (pin < 1000 || pin > 9999) {
            System.out.println("Invalid pin number. Please enter a 4 digit number.");
        } else {
            String encryptedPin = String.format("%04x", new Random().nextInt(65536 - 1000) + 1000) + String.format("%04x", pin) + String.format("%04x", new Random().nextInt(65536 - 1000) + 1000);
            System.out.println("Your encrypted pin number is " + encryptedPin + ".");
        }
    }
}