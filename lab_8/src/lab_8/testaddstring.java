package lab_8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddstring {

	@Test
	void test() {
		junit jn = new junit();
		String result = jn.addStrings("naman","bansal");
		assertEquals("namanbansal",result);
		//assertEquals(3400,result);
		
	}

}
