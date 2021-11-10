import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/*
 * class USDMintTest
 * @author group deepFake (Baylor Matney, Isaac Allen, Logan Richardson, Ty Brucker)
 * @version 1.0
 */
public class USDMintTest {
	/*
	 * Method for get instance test
	 * @return void
	 */
    @Test
        public void testGetInstance() {
            USDMint testA = USDMint.getInstance(0.1,"USD");
            USDMint testB = USDMint.getInstance(0.1,"USD");
            assertTrue(testA == testB, "Expected testB to point to testA but a new USDMint was created!");
        }
	/*
	 * Method for get manufacture test
	 * @return void
	 */
    @Test
        public void testManafacture() {	
            USDMint testMint = USDMint.getInstance(0.01,"USD");
            testMint.makeCoin();
            PrintStream origOut = System.out;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream newOut = new PrintStream(baos);
            System.setOut(newOut);
            String expectedResult = "Beginning smelting:\n2.5% Cu\n97.5% Zi\n";; 
            String testOutput = null;
            testMint.manafacture();
            System.out.flush();
            testOutput = baos.toString();
            System.setOut(origOut);
            assertTrue(expectedResult.equals(testOutput),
                    "Expected:'" + expectedResult 
                    + "' but got '" + testOutput + "'.");
        }
	/*
	 * Test method for making a coin
	 * @return void
	 */
    @Test
        public void testMakeCoin() {
            Coin testCoin = null;
            USDMint testMint = USDMint.getInstance(0.01,"USD");
            for (int i = 0; i < 48; ++i) {
                testCoin = testMint.makeCoin();
                if (testCoin != null) break;
            }
            assertNotNull(testCoin, "Expected makeCoin to return a non-null coin after 48 iterations!");
            assertTrue(testCoin instanceof USDPenny, "Expected makeCoin to return instance of USDPenny but was " + testCoin.getClass().getName());
        }
	/*
	 * Method for testing inspection test
	 * @return void
	 */
    @Test
        public void testInspection() {
            USDMint testMint = USDMint.getInstance(0.01,"USD");
            boolean inspect = true;
            for (int i = 0; i < 48; ++i) {
                inspect = testMint.inspection();
                if (!inspect) break;
            }
            assertTrue(!inspect, "Inspection was expected to fail 1/12 with certainty in 48 iterations but passed every time!");
        }
	/*
	 * Method for testing smoothing test
	 * @return void
	 */
    @Test
        public void testSmoothing() {
            USDMint testMint = USDMint.getInstance(0.01,"USD");
            boolean smoothing = true;
            for (int i = 0; i < 400000; ++i) {
                smoothing = testMint.smoothing();
                if (!smoothing) break;
            }
            assertTrue(!smoothing, "Smoothing was expected to fail 1/1000 times with certainty in 400000 iterations but passed every time!");
        }
	/*
	 * Method for testing buffing test
	 * @return void
	 */
    @Test
        public void testBuffing() {
            USDMint testMint = USDMint.getInstance(0.01,"USD");
            boolean buffing = true;
            for (int i = 0; i < 400000; ++i) {
                buffing = testMint.buffing();
                if (!buffing) break;
            }
            assertTrue(!buffing, "Buffing was expected to fail 1/1000 times with certainty in 400000 iterations but passed every time!");
        }
}
