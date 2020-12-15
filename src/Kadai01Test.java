
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai01Test {

	@Test
	void testtestReverseString() {
		Kadai01 k = new Kadai01();
		assertNull(null,k.reverse(null));
		assertEquals("4321",k.reverse("1234"));
		assertEquals("",k.reverse(""));
		assertEquals("おえういあ",k.reverse("あいうえお"));
		assertEquals("321\n",k.reverse("\n123"));
}
}


