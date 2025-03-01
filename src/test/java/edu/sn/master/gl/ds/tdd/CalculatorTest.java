package edu.sn.master.gl.ds.tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import edu.sn.master.gl.ds.bambey.tdd.Calculator;
import edu.sn.master.gl.ds.bambey.tdd.ICalculator;
import edu.sn.master.gl.ds.bambey.tdd.MessageInteger;

public class CalculatorTest {
	String functionOne = """
			Besoin fonctionnel original
				En tant qu'utilisateur
				Si je divise un nombre par un autre
				Alors je dois avoir le resultat

					""";
	
	String functionTwo = """
			Besoin fonctionnel splitté
				En tant qu'utilisateur
				Si je divise un nombre par un autre qui n'est ni nul ou ni égal à zéro
				Alors je dois un résultat

					""";
	String functionFinal = """
			Besoin fonctionnel splitté
				En tant qu'utilisateur
				Si je divise un nombre par un autre qui null ou égal à zéro
				Alors je dois avoir un message d'erreur

					""";

	@Test
	void test_division_ok() {
		int b = 1 + 1;
		assertEquals(2, b);
	}

	@Test
	void test_division_ko() {
		int b = 1 + 1 + 1;
		assertEquals(3, b);
	}
	
	
	@Test
	void test_by_div_with_functionOne_functionTwo() {
		Integer a=10;
		Integer b=10;
		
		ICalculator calc = new Calculator();
		MessageInteger result = calc.division(a, b);
		
		assertEquals(1, result.getResult());
	}
	
	
	@Test
	void test_by_div_with_functionFinal_with_null_or_zero() {
		Integer a=0;
		Integer b=10;
		
		ICalculator calc = new Calculator();
		MessageInteger result = calc.division(a, b);
		
		assertEquals(0, result.getResult());
	}
	
	@Test
	void test_by_div_with_functionFinal_with_b_zero() {
		Integer a=10;
		Integer b=0;
		
		ICalculator calc = new Calculator();
		MessageInteger result = calc.division(a, b);
		
		assertEquals(0, result.getResult());
		assertEquals("Impossible la division", result.getMessage());
	}
}