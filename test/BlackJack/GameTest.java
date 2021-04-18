package BlackJack;

import ca.sheridancollege.project.Game;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;


/**
 * This class +++ Deliverable 3 BlackJack Test Class+++
 *
 * @author Usama Yasin
 */
public class GameTest {

    public GameTest(){
    
    }
    
    /**
     * Test of isBust method, of class Game if good.
     */
    @Test
    public void isBustTestGood(){
        
        boolean isBust = Game.isBust(20);
        assertFalse(isBust);
        isBust = Game.isBust(22);
        assertTrue(isBust);
        System.out.println("isBustTestGood");
    }
    
    /**
     * Test of isBust method, of class Game if bad.
     */
    
    @Test
    public void isBustTestBad(){
        
        boolean isBust = Game.isBust(22);
        assertTrue(isBust);
        System.out.println("isBustTestBad");
    }
    
    /**
     * Test of isDealerWin method, of class Game if good.
     */
    @Test
    public void isDealerWinTestGood(){
        
        boolean isDealerWin = Game.isDealerWin(20,18);
        assertTrue(isDealerWin);       
        System.out.println("isDealerWinTestGood");
    }
    
    /**
     * Test of isDealerWin method, of class Game if bad.
     */
    @Test
    public void isDealerWinTestBad(){
        
        boolean isDealerWin = Game.isDealerWin(15,20);
        assertTrue(isDealerWin);       
        System.out.println("isDealerWinTestBad");
    }
    
    /**
     * Test of isPlayerWin method, of class Game if good.
     */
    @Test
    public void isPlayerWinTestGood(){
        
        boolean isPlayerWin = Game.isPlayerWin(20,18);
        assertTrue(isPlayerWin);       
        System.out.println("isPlayerWinTestGood");
    }
    
    /**
     * Test of isPlayerWin method, of class Game if bad.
     */
    @Test
    public void isPlayerWinTestBad(){
        
        boolean isPlayerWin = Game.isPlayerWin(20,18);
        assertTrue(isPlayerWin);       
        System.out.println("isPlayerWinTestBad");
    }
}
