import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class GBPPenceTest {
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
