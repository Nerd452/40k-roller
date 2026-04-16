package test;


//Java Library Imports
import java.util.ArrayList;


//Project Imports
import rollingUtils.Rolling;


//External Library Imports
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class RollingTest
{
    
    @Test
    public void getDiceWithArgumentTest()
    {
        //Arrange
        ArrayList<Integer> answers;
        //Act
        answers = Rolling.getDice(12);
        //Assert
        assertEquals(12, answers.size());

    }
    




}
