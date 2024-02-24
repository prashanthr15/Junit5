package junittry;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test() {
		//assertion means trying to verify thr result
		
		Calc c = new Calc();
		int result=c.divide(10, 5);
		
		int expectedResult=2;
		//assertEquals this is api method
		assertEquals(expectedResult,result );
	}

}
