import java.util.Scanner;
import java.util.Random;

public class Rock {
    public static void main(String[] args) {
        String personPlay;
        String computerPlay;
        int computerInt;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        System.out.print("Enter your play: R for Rock, P for Paper, or S for Scissors: ");
        personPlay = scan.next().toUpperCase();

        computerInt = generator.nextInt(3);

        switch (computerInt) {
            case 0:
                computerPlay = "R";
                break;
            case 1:
                computerPlay = "P";
                break;
            case 2:
                computerPlay = "S";
                break;
            default:
                computerPlay = "Invalid";
        }
        System.out.println("Computer's play: " + computerPlay);

        if (personPlay.equals(computerPlay))
            System.out.println("It's a tie!");
        else if (personPlay.equals("R"))
            if (computerPlay.equals("S"))
                System.out.println("Rock crushes scissors.  You win!!");
            else
                System.out.println("Paper covers rock.  Computer wins!!");
        else if (personPlay.equals("P"))
            if (computerPlay.equals("R"))
                System.out.println("Paper covers rock.  You win!!");
            else
                System.out.println("Scissors cuts paper.  Computer wins!!");
        else if (personPlay.equals("S"))
            if (computerPlay.equals("P"))
                System.out.println("Scissors cuts paper.  You win!!");
            else
                System.out.println("Rock crushes scissors.  Computer wins!!");
        else
            System.out.println("Invalid input.  Please enter R, P, or S.");
    }
}