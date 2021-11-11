import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
 * class NullCoinTest
 * @author group deepFake (Baylor Matney, Isaac Allen, Logan Richardson, Ty Brucker)
 * @version 1.0
 */
public class NullCoinTest {
    /*
     * Method for testing smelting
     * @return void
     */
    @Test
        public void testSmelt() {
            Coin testNullCoin = Coin.NULL;
            PrintStream origOut = System.out;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream newOut = new PrintStream(baos);
            System.setOut(newOut);
            String expectedResult = "A Null coin can't be smelted\n";
            String testOutput = null;
            testNullCoin.smelt();
            System.out.flush();
            testOutput = baos.toString();
            System.setOut(origOut);
            assertTrue(expectedResult.equals(testOutput),
                    "Expected:'" + expectedResult 
                    + "' but got '" + testOutput + "'.");
        }
    /*
     * Method for testing denomination
     * @return void
     */
    @Test
        public void testgetDenomination() {
            Coin testNullCoin = Coin.NULL;
            PrintStream origOut = System.out;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream newOut = new PrintStream(baos);
            System.setOut(newOut);
            Double expectedResult = 0.0;
            Double testOutput = testNullCoin.getDenomination();
            assertEquals(expectedResult, testOutput,
                    "Expected:'" + expectedResult 
                    + "' but got '" + testOutput + "'.");
        }
    /*
     * Method for testing case for creation of null coin
     * @return void
     */
    @Test
        public void display() {
            Coin testNullCoin = Coin.NULL; 
            PrintStream origOut = System.out;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream newOut = new PrintStream(baos);
            System.setOut(newOut);
            String expectedResult = "Incompatable denomination Null coin created\n"; 
            String testOutput = null;
            testNullCoin.display();
            System.out.flush();
            testOutput = baos.toString();
            System.setOut(origOut);
            assertTrue(expectedResult.equals(testOutput),
                    "Expected:'" + expectedResult 
                    + "' but got '" + testOutput + "'.");
        }
}
