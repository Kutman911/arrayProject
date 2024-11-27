import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> boxesLocations = new ArrayList<>();
        ArrayList<Integer> guesses = new ArrayList<>();

        System.out.println("Hello, Martians. Let's find your hidden cargo!");
        int attempts = 0;
        int maxAttempts = 5;

        generateNumbers(boxesLocations);

        while(true)
        {
            guesses.clear();

            takeGuesses(guesses);

            int correctGuesses = checkGuesses(boxesLocations, guesses);
            System.out.println("You guessed " + correctGuesses + " locations of boxes correctly.");

            if(correctGuesses == 3)
            {
                System.out.println("Congratulations! You found the hidden cargo!");
                break;
            }

            attempts++;

            if(attempts == maxAttempts)
            {
                boxesLocations.clear();
                generateNumbers(boxesLocations);
                System.out.println("The boxes have moved  to new locations.");
                attempts = 0;
            }
        }

    }

    static int checkGuesses(ArrayList<Integer> boxesLocations, ArrayList<Integer> guesses)
    {
        int correct = 0;
        for(int i = 0; i < 3; i++)
        {
            if(boxesLocations.contains(guesses.get(i)))
            {
                correct++;
            }
        }
        return correct;
    }

    static void takeGuesses(ArrayList<Integer> guesses)
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i < 4; i++)
        {
            System.out.print("Enter your " + i + " guess: ");
            int guess = sc.nextInt();

            while(guess < 0 || guess > 7)
            {
                System.out.println("Incorrect input. Choose an integer between 0 and 7. Enter a new guess: ");
                guess = sc.nextInt();
            }

            while(guesses.contains(guess))
            {
                System.out.println("Incorrect input. The locations are not repeated. Enter a new guess: ");
                guess = sc.nextInt();
            }
            guesses.add(guess);
        }
    }

    static void generateNumbers(ArrayList<Integer> boxesLocations)
    {
        Random rand = new Random();
        while (boxesLocations.size() < 3)
        {
            int randomNum = rand.nextInt(8);
            if(!boxesLocations.contains(randomNum))
            {
                boxesLocations.add(randomNum);
            }
        }

    }
}