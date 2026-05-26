import java.util.Random;
import java.util.Scanner;

public class SureToPlayThis {

    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        char guess;
        int attempts = 0;
        char randomLetter = (char) ('A' + random.nextInt(26));

        System.out.println("***ALPHABET GUESSING GAME***");
        System.out.println("GUESS A LETTER FROM A-Z!, LET'S BEGIN!");
        System.out.println();

        do{
            System.out.println("Are you ready!");
            Thread.sleep(3000);
            System.out.print("Enter your guess: ");
            guess = scanner.next().charAt(0);
            attempts++;

            if(guess < randomLetter) {
                System.out.println("Oops! Way too low! Try again");
                System.out.println();
            }

            else if(guess > randomLetter){
                System.out.println("High! Drop down! Try again");
                System.out.println();
            }
            else{
                System.out.println();
                System.out.println("You won!");
                System.out.println("The right answer was: " + randomLetter);
                System.out.println("Total attempts is: " + attempts);
            }
        } while ( guess != randomLetter);
        scanner.close();
    }
}
