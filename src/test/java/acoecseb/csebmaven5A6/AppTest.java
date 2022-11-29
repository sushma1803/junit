package acoecseb.csebmaven5A6;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
   @Test
    public void test() {
    	App a=new App();
    	int actual=a.add(15,15);
    	int expected=35;
    	assertEquals(expected,actual);
    }
}
