import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class GBPTwoPenceTest {
    @Test
    public void testConstructor() {
	try {
	    Coin testGBPTwoPence = new GBPTwoPence(0.02,"GBP",new CompPT());
	    assertNotNull(testGBPTwoPence);
	}
	catch (Exception e) {
	    fail("Constructor threw exception: " + e.getMessage());
	}
    }

    @Test
    public void testSmelt() {
	Coin testGBPTwoPence = new GBPTwoPence(0.02,"GBP",new CompPT());
	PrintStream origOut = System.out;
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream newOut = new PrintStream(baos);
	System.setOut(newOut);
	String expectedResult = "Beginning smelting:\nCu Plated Steel\n"; 
	String testOutput = null;
	testGBPTwoPence.smelt();
	System.out.flush();
	testOutput = baos.toString();
	System.setOut(origOut);
	assertTrue(expectedResult.equals(testOutput),
		"Expected:'" + expectedResult 
		+ "' but got '" + testOutput + "'.");
    }
    @Test
    public void display() {
	Coin testGBPTwoPence = new GBPTwoPence(0.02,"GBP",new CompPT());
	PrintStream origOut = System.out;
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream newOut = new PrintStream(baos);
	System.setOut(newOut);
	String expectedResult = "Minting a GBP TwoPence!\n"; 
	String testOutput = null;
	testGBPTwoPence.display();
	System.out.flush();
	testOutput = baos.toString();
	System.setOut(origOut);
	assertTrue(expectedResult.equals(testOutput),
		"Expected:'" + expectedResult 
		+ "' but got '" + testOutput + "'.");
    }
    @Test
    public void testgetDenomination() {
	Coin testGBPTwoPence = new GBPTwoPence(0.02,"GBP",new CompPT());
	Double expectedResult = 0.02;
	Double testOutput = testGBPTwoPence.getDenomination();
	assertEquals(expectedResult, testOutput,
		"Expected:'" + expectedResult 
		+ "' but got '" + testOutput + "'.");
    }
}
