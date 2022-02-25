package week8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class weekEightTest {

	@Test
	void test1() {
		weekEight obj= new weekEight();
		String res = obj.getFormula("Mg3(OH2)2");
		assertEquals(res,"H4Mg3O2");
	}

	@Test
	void test2() {
		weekEight obj= new weekEight();
		String res = obj.getFormula("Mg(OH)2");
		assertEquals(res,"H2MgO2");
	}

	@Test
	void test3() {
		weekEight obj= new weekEight();
		String res = obj.getFormula("H2O");
		assertEquals(res,"H2O");
	}


}