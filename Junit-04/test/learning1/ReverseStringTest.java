package learning1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void testReverseString_OneWord() {
		ReverseString rs= new ReverseString();
		
		assertEquals("avaj", rs.reverseString("java"));
	}
	
	
	
	//if u want to run one mehtod to run then select that method rt click => runas=> Junit test
 
	
	@Test
	void testReverseString_MultipleWord() {
		ReverseString rs= new ReverseString();
		
		assertEquals("ysae si avaj", rs.reverseString("java is easy"));
	}

}
