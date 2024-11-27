import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> locations = new ArrayList<>();
        ArrayList<Integer> guesses = new ArrayList<>();


    }
    static void takeGuess(ArrayList<Integer> guesses)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("")
    }
    static void generateNumbers(ArrayList<Integer> locations)
    {
        Random rand = new Random();
        while (locations.size() < 3)
        {
            int randomNum = rand.nextInt(8);
            if(!locations.contains(randomNum))
            {
                locations.add(randomNum);
            }
        }

    }
}