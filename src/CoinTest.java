import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
 * class CoinTest
 * @author group deepFake (Baylor Matney, Isaac Allen, Logan Richardson, Ty Brucker)
 * @version 1.0
 */
public class CoinTest extends Coin {
	/*
	 * Constructor for test class
	 * @return void
	 */
    public CoinTest() {
        super(0.05, "USD", new CompNFFTF());
    }
	/*
	 * Function to run constructor test
	 * @return void
	 */
    @Test
        public void testConstructor() {
            try {
                Coin testCoin = new CoinTest();
                assertNotNull(testCoin);
            }
            catch (Exception e) {
                fail("Constructor threw exception: " + e.getMessage());
            }
        }
	/*
	 * Function to run smelting test
	 * @return void
	 */
    @Test
        public void testSmelt() {
            Coin testCoin = new CoinTest();
            PrintStream origOut = System.out;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream newOut = new PrintStream(baos);
            System.setOut(newOut);
            String expectedResult = "Beginning smelting:\n75% Cu\n25% Ni\n";
            String testOutput = null;
            testCoin.smelt();
            System.out.flush();
            testOutput = baos.toString();
            System.setOut(origOut);
            assertTrue(expectedResult.equals(testOutput),
                    "Expected:'" + expectedResult 
                    + "' but got '" + testOutput + "'.");
        }
	/*
	 * Function to run test on coin denomination
	 * @return void
	 */
    @Test
        public void testgetDenomination() {
            Coin testCoin = new CoinTest();
            PrintStream origOut = System.out;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream newOut = new PrintStream(baos);
            System.setOut(newOut);
            Double expectedResult = 0.05;
            Double testOutput = testCoin.getDenomination();
            assertEquals(expectedResult, testOutput,
                    "Expected:'" + expectedResult 
                    + "' but got '" + testOutput + "'.");
        }
	/*
	 * display method
	 * @return void
	 */
    public void display() {
        return;
    }
}
