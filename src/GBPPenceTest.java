import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
 * class GBPPenceTest
 * @author group deepFake (Baylor Matney, Isaac Allen, Logan Richardson, Ty Brucker)
 * @version 1.0
 */
public class GBPPenceTest {
	/*
	 * Constructor for test class
	 * @return void
	 */
    @Test
        public void testConstructor() {
            try {
                Coin testGBPPence = new GBPPence(0.01,"GBP",new CompPT());
                assertNotNull(testGBPPence);
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
            Coin testGBPPence = new GBPPence(0.01,"GBP",new CompPT());
            PrintStream origOut = System.out;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream newOut = new PrintStream(baos);
            System.setOut(newOut);
            String expectedResult = "Beginning smelting:\nCu Plated Steel\n"; 
            String testOutput = null;
            testGBPPence.smelt();
            System.out.flush();
            testOutput = baos.toString();
            System.setOut(origOut);
            assertTrue(expectedResult.equals(testOutput),
                    "Expected:'" + expectedResult 
                    + "' but got '" + testOutput + "'.");
        }
	/*
	 * Function to run minting test
	 * @return void
	 */
    @Test
        public void display() {
            Coin testGBPPence = new GBPPence(0.01,"GBP",new CompPT());
            PrintStream origOut = System.out;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream newOut = new PrintStream(baos);
            System.setOut(newOut);
            String expectedResult = "Minting a GBP Pence!\n"; 
            String testOutput = null;
            testGBPPence.display();
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
            Coin testGBPPence = new GBPPence(0.01,"GBP",new CompPT());
            Double expectedResult = 0.01;
            Double testOutput = testGBPPence.getDenomination();
            assertEquals(expectedResult, testOutput,
                    "Expected:'" + expectedResult 
                    + "' but got '" + testOutput + "'.");
        }
}
