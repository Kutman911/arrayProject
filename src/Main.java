import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> locations = new ArrayList<>();


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