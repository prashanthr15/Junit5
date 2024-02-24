package learning1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {

	Shapes shape= new Shapes();
	
	@Test
	void testcomputeSquareArea() {
		
		
		
		assertEquals(576, shape.computeSquareArea(24));
	}
	

	@Test
	void testcomputeCircleArea() {
		
		
	//in the failure trace it gives the given message as argument area of circle calculation is wrong");
	//sttring message will be evaluated if or not the expected and actual value is same or not
		assertEquals(76.5, shape.computeCircleArea(5), "area of circle calculation is wrong");
	}
	
	
	@Test
	void testcomputeCircleArea_Supplier() {
		
		
	//in the failure trace it gives the given message as argument area of circle calculation is wrong");
	//implements the supplier interface from java, using ()-> lamda implementing 
		//it will not evaluate the implemetation function until it fails.if it fails it will evaluate and prints the msg
		assertEquals(76.5, shape.computeCircleArea(5), ()->"area of circle calculation is wrong");
	}

}
