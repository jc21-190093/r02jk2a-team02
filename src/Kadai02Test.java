import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai02Test {

	/*@Test
	void testReverseString() {
		Kadai01 k = new Kadai01();
		assertNull(k.ReverseString(null));
		assertEquals(4321,k.ReverseString("1234"));
	}*/
	@Test
	void testcountString() {
		Kadai02 k2 = new Kadai02();
		assertEquals(-1,k2.countString(null, 'a'));
		assertEquals(1,k2.countString("1234a", 'a'));
		assertEquals(0,k2.countString(" ", 'a'));
		assertEquals(2,k2.countString("Aa", 'a'));
		assertEquals(4,k2.countString("1a2a3a4a", 'a'));
		assertEquals(1,k2.countString("abcd", 'b'));

	}

}
