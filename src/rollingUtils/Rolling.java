package rollingUtils;

import java.util.Random;
import java.util.ArrayList;


/**
 * The Rolling class is used for generating and manipulating a large amount of randomly generated numbers from 1-6 or 1-3
 */
public class Rolling
{
    private Random random; // generates random numbers



    


    /**
     * @param diceAmount the amount of dice to be rolled
     * @return an ArrayList of integers generated from the rolled dice
     *
     *
     */
    public static ArrayList<Integer> getDice(final int diceAmount){
        ArrayList<Integer> returnable = new ArrayList<Integer>();
        int temp;
        Random random = new Random();
        for(int i = 0; i < diceAmount; i++)
        {
            temp = random.nextInt(6) + 1;
            returnable.add(temp);
        }

        return returnable;

    }
}
