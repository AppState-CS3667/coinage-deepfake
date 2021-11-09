import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GBPMintTest {

    @Test
    public void testGetInstance() {
	GBPMint testA = GBPMint.getInstance(0.1,"GBP");
	GBPMint testB = GBPMint.getInstance(0.1,"GBP");
	assertTrue(testA == testB, "Expected testB to point to testA but a new GBPMint was created!");
    }

    @Test
    public void testManafacture() {	
	GBPMint testMint = GBPMint.getInstance(0.01,"GBP");
	testMint.makeCoin();
	PrintStream origOut = System.out;
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream newOut = new PrintStream(baos);
	System.setOut(newOut);
	String expectedResult = "Beginning smelting:\nCu Plated Steel\n"; 
	String testOutput = null;
	testMint.manafacture();
	System.out.flush();
	testOutput = baos.toString();
	System.setOut(origOut);
	assertTrue(expectedResult.equals(testOutput),
		"Expected:'" + expectedResult 
		+ "' but got '" + testOutput + "'.");
    }

    @Test
    public void testMakeCoin() {
	Coin testCoin = null;
	GBPMint testMint = GBPMint.getInstance(0.01,"GBP");
	for (int i = 0; i < 48; ++i) {
	    testCoin = testMint.makeCoin();
	    if (testCoin != null) break;
	}
	assertNotNull(testCoin, "Expected makeCoin to return a non-null coin after 48 iterations!");
	assertTrue(testCoin instanceof GBPPence, "Expected makeCoin to return instance of GBPPenny but was " + testCoin.getClass().getName());
    }

    @Test
    public void testInspection() {
	GBPMint testMint = GBPMint.getInstance(0.01,"GBP");
	boolean inspect = true;
	for (int i = 0; i < 48; ++i) {
	    inspect = testMint.inspection();
	    if (!inspect) break;
	}
	assertTrue(!inspect, "Inspection was expected to fail 1/12 with certainty in 48 iterations but passed every time!");
    }

    @Test
    public void testSmoothing() {
	GBPMint testMint = GBPMint.getInstance(0.01,"GBP");
	boolean smoothing = true;
	for (int i = 0; i < 400000; ++i) {
	    smoothing = testMint.smoothing();
	    if (!smoothing) break;
	}
	assertTrue(!smoothing, "Smoothing was expected to fail 1/1000 times with certainty in 400000 iterations but passed every time!");
    }
    
    @Test
    public void testBuffing() {
	GBPMint testMint = GBPMint.getInstance(0.01,"GBP");
	boolean buffing = true;
	for (int i = 0; i < 400000; ++i) {
	    buffing = testMint.buffing();
	    if (!buffing) break;
	}
	assertTrue(!buffing, "Buffing was expected to fail 1/1000 times with certainty in 400000 iterations but passed every time!");
    }
}
