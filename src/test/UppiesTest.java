package test;


//Java Library Imports
import java.util.ArrayList;



//project imports
import static rollingUtils.Uppies.*;



//External Library imports
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;




public class UppiesTest
{

    @Test
    public void lethalHitsTest(){
        //Arrange + Act
        ArrayList<Integer> diceResults1 = new ArrayList<Integer>();
        diceResults1.add(6);
        diceResults1.add(1);
        diceResults1.add(6);
        diceResults1.add(4);
        diceResults1.add(1);
        diceResults1.add(3);
        diceResults1.add(2);
        int dice1 = 2;

        ArrayList<Integer> diceResults2 = new ArrayList<>();
        diceResults2.add(6);
        diceResults2.add(5);
        diceResults2.add(6);
        diceResults2.add(6);
        int dice2 = 3;

        //Assert
        assertEquals(dice1, lethalHits(diceResults1));

        assertEquals(dice2, lethalHits(diceResults2));

    }



}


