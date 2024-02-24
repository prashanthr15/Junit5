package learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dao.Javacourse;
import service.PurchaseCourse;

class TestPurchaseCourse {

	@Test
	void test() {
		PurchaseCourse pc= new PurchaseCourse();
		assertTrue(pc.proceedWithCourse(new Javacourse()));
	}

}
