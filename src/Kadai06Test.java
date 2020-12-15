import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai06Test {



	@Test
	void testget2ndMax() {
		int[] a= {123,1,2,23,44,555,666};
		int[] b= {0,0,0};
		int[] c= { , };
		int[] d= {12345};
		Kadai06 k6 = new Kadai06();
		assertEquals(-1,k6.get2ndMax(null));
		assertEquals(555,k6.get2ndMax(a));
		assertEquals(0,k6.get2ndMax(b));
		assertEquals(-2,k6.get2ndMax(c));
		assertEquals(12345,k6.get2ndMax(d));

	}

}
