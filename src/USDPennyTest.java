import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
 * class USDPennyTest
 * @author group deepFake (Baylor Matney, Isaac Allen, Logan Richardson, Ty Brucker)
 * @version 1.0
 */
public class USDPennyTest {
    /*
	 * Constructor for test class
	 * @return void
	 */
    @Test
        public void testConstructor() {
            try {
                Coin testUSDPenny = new USDPenny(0.01,"USD",new CompP());
                assertNotNull(testUSDPenny);
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
            Coin testUSDPenny = new USDPenny(0.01,"USD",new CompP());
            PrintStream origOut = System.out;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream newOut = new PrintStream(baos);
            System.setOut(newOut);
            String expectedResult = "Beginning smelting:\n2.5% Cu\n97.5% Zi\n";; 
            String testOutput = null;
            testUSDPenny.smelt();
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
            Coin testUSDPenny = new USDPenny(0.01,"USD",new CompP());
            PrintStream origOut = System.out;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream newOut = new PrintStream(baos);
            System.setOut(newOut);
            String expectedResult = "Minting a USD Penny!\n"; 
            String testOutput = null;
            testUSDPenny.display();
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
            Coin testUSDPenny = new USDPenny(0.01,"USD",new CompP());
            Double expectedResult = 0.01;
            Double testOutput = testUSDPenny.getDenomination();
            assertEquals(expectedResult, testOutput,
                    "Expected:'" + expectedResult 
                    + "' but got '" + testOutput + "'.");
        }
}
