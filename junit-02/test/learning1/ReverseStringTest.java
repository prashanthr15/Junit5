package learning1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test() {
		ReverseString rs= new ReverseString();
		
		//actual rt click =>refactor=> inline
	//String actual=	rs.reverseString("java");
		
		//String expected= "avaj";
		//expected rt click =>refactor=> inline
		assertEquals("avaj", rs.reverseString("java"));
		assertEquals("aavaj", rs.reverseString("javaa"));

		//assertEquals(expected, actual);
		
		
	}

}
