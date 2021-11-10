import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
 * class GBPPoundTest
 * @author group deepFake (Baylor Matney, Isaac Allen, Logan Richardson, Ty Brucker)
 * @version 1.0
 */
public class GBPPoundTest {
	/*
	 * Constructor for test class
	 * @return void
	 */
    @Test
        public void testConstructor() {
            try {
                Coin testGBPPound = new GBPPound(1, "GBP", new CompPo());
                assertNotNull(testGBPPound);
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
            Coin testGBPPound = new GBPPound(1, "GBP", new CompPo());
            PrintStream origOut = System.out;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream newOut = new PrintStream(baos);
            System.setOut(newOut);
            String expectedResult = "Beginning smelting:\n70% Cu\n24.5% Zi\n5.5% Ni\n"; 
            String testOutput = null;
            testGBPPound.smelt();
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
            Coin testGBPPound = new GBPPound(1, "GBP", new CompPo());
            PrintStream origOut = System.out;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream newOut = new PrintStream(baos);
            System.setOut(newOut);
            String expectedResult = "Minting a GBP Pound!\n"; 
            String testOutput = null;
            testGBPPound.display();
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
            Coin testGBPPound = new GBPPound(1, "GBP", new CompPo());
            Double expectedResult = 1.0;
            Double testOutput = testGBPPound.getDenomination();
            assertEquals(expectedResult, testOutput,
                    "Expected:'" + expectedResult 
                    + "' but got '" + testOutput + "'.");
        }
}
