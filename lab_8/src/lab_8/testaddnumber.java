package lab_8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddnumber {

	@Test
	void test() {
		junit jn = new junit();
		int result = jn.addNumbers(100,200);
		assertEquals(300,result);
		//assertEquals(3400,result);
		
	}
}
