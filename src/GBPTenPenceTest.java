import java.lang.IllegalArgumentException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class GBPTenPenceTest {
    @Test
    public void testConstructor() {
	try {
	    Coin testGBPTenPence = new GBPTenPence(0.1,"GBP",new CompNFFTF());
	    assertNotNull(testGBPTenPence);
	}
	catch (Exception e) {
	    fail("Constructor threw exception: " + e.getMessage());
	}
    }

    @Test
    public void testSmelt() {
	Coin testGBPTenPence = new GBPTenPence(0.1,"GBP",new CompNFFTF());
	PrintStream origOut = System.out;
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream newOut = new PrintStream(baos);
	System.setOut(newOut);
	String expectedResult = "Beginning smelting:\n75% Cu\n25% Ni\n"; 
	String testOutput = null;
	testGBPTenPence.smelt();
	System.out.flush();
	testOutput = baos.toString();
	System.setOut(origOut);
	assertTrue(expectedResult.equals(testOutput),
		"Expected:'" + expectedResult 
		+ "' but got '" + testOutput + "'.");
    }
    @Test
    public void display() {
	Coin testGBPTenPence = new GBPTenPence(0.1,"GBP",new CompNFFTF());
	PrintStream origOut = System.out;
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream newOut = new PrintStream(baos);
	System.setOut(newOut);
	String expectedResult = "Minting a GBP TenPence!\n"; 
	String testOutput = null;
	testGBPTenPence.display();
	System.out.flush();
	testOutput = baos.toString();
	System.setOut(origOut);
	assertTrue(expectedResult.equals(testOutput),
		"Expected:'" + expectedResult 
		+ "' but got '" + testOutput + "'.");
    }
    @Test
    public void testgetDenomination() {
	Coin testGBPTenPence = new GBPTenPence(0.1,"GBP",new CompNFFTF());
	double expectedResult = 0.1;
	double testOutput = testGBPTenPence.getDenomination();
	assertEquals(expectedResult, testOutput,
		"Expected:'" + expectedResult 
		+ "' but got '" + testOutput + "'.");
    }
}
