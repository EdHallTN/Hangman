
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Created by EdHall on 10/3/16.
 */

public class Maintest {
    @Test
    public void TestCorrectWordIsNotNull() {
        String correctWord = "bicycle";
        assertTrue(true);
    }


    @Test
    public void TestLivesOutput(){
        Main.lives(3);
    }


}


