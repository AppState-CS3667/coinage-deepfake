import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class GBPTwentyPenceTest {
    @Test
    public void testConstructor() {
	try {
	    Coin testGBPTwentyPence = new GBPTwentyPence(0.20, "GBP", new CompTp());
	    assertNotNull(testGBPTwentyPence);
	}
	catch (Exception e) {
	    fail("Constructor threw exception: " + e.getMessage());
	}
    }

    @Test
    public void testSmelt() {
    Coin testGBPTwentyPence = new GBPTwentyPence(0.20, "GBP", new CompTp());
	PrintStream origOut = System.out;
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream newOut = new PrintStream(baos);
	System.setOut(newOut);
	String expectedResult = "Beginning smelting:\n84% Cu\n16% Ni\n"; 
	String testOutput = null;
	testGBPTwentyPence.smelt();
	System.out.flush();
	testOutput = baos.toString();
	System.setOut(origOut);
	assertTrue(expectedResult.equals(testOutput),
		"Expected:'" + expectedResult 
		+ "' but got '" + testOutput + "'.");
    }
    @Test
    public void display() {
    Coin testGBPTwentyPence = new GBPTwentyPence(0.20, "GBP", new CompTp());
	PrintStream origOut = System.out;
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream newOut = new PrintStream(baos);
	System.setOut(newOut);
	String expectedResult = "Minting a GBP TwentyPence!\n"; 
	String testOutput = null;
	testGBPTwentyPence.display();
	System.out.flush();
	testOutput = baos.toString();
	System.setOut(origOut);
	assertTrue(expectedResult.equals(testOutput),
		"Expected:'" + expectedResult 
		+ "' but got '" + testOutput + "'.");
    }
    @Test
    public void testgetDenomination() {
    Coin testGBPTwentyPence = new GBPTwentyPence(0.20, "GBP", new CompTp());
	Double expectedResult = 0.20;
	Double testOutput = testGBPTwentyPence.getDenomination();
	assertEquals(expectedResult, testOutput,
		"Expected:'" + expectedResult 
		+ "' but got '" + testOutput + "'.");
    }
}
