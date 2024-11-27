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


    }

    static int checkGuesses(ArrayList<Integer> boxesLocations, ArrayList<Integer> guesses)
    {
        int correct = 0;
        for(int i = 0; i < 3; i++)
        {
            if(boxesLocations.get(i) == guesses.get(i))
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
            System.out.print("Enter your" + i + "guess: ");
            int guess = sc.nextInt();
            while(guess < 0 || guess > 7)
            {
                System.out.println("Incorrect input. choose an integer between 0 and 7");
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