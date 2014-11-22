package co.edu.udea.codebreaker.test;

import static org.junit.Assert.*;
import org.junit.Test;
import co.edu.udea.codebreaker.code.CodeBreaker;

public class CodeBreakerTest {
	CodeBreaker codeBreaker = new CodeBreaker("1234");

	@Test
	public void TestEmptyCorrectAnswer() {
		String result = codeBreaker.validarPosicion("0000");
		assertEquals("", result);
	}

	@Test
	public void TestOneCorrectAnswer() {
		String result = codeBreaker.validarPosicion("1567");
		assertEquals("X", result);
	}

	@Test
	public void TestTwoCorrectAnswer() {
		String result = codeBreaker.validarPosicion("1267");
		assertEquals("XX", result);
	}
	
	@Test
	public void TestThreeCorrectAnswer() {
		String result = codeBreaker.validarPosicion("1237");
		assertEquals("XXX", result);
	}
	
	@Test
	public void TestCorrectAnswer() {
		String result = codeBreaker.validarPosicion("1234");
		assertEquals("XXXX", result);
	}
	
	@Test
	public void TestOneExist() {
		String result = codeBreaker.validarPosicion("4000");
		assertEquals("-", result);
	}
	
	@Test
	public void TestTwoExist() {
		String result = codeBreaker.validarPosicion("4100");
		assertEquals("--", result);
	}
	
	@Test
	public void TestThreeExist() {
		String result = codeBreaker.validarPosicion("4120");
		assertEquals("---", result);
	}
	@Test
	public void TestFourExist() {
		String result = codeBreaker.validarPosicion("4123");
		assertEquals("----", result);
	}
	
	@Test
	public void TestOneCorrectAnswerAndOneExist() {
		String result = codeBreaker.validarPosicion("1400");
		assertEquals("X-", result);
	}
	
	@Test
	public void TestTwoCorrectAnswerAndOneExist() {
		String result = codeBreaker.validarPosicion("1240");
		assertEquals("XX-", result);
	}
	@Test
	public void TestOneCorrectAnswerAndTwoExist() {
		String result = codeBreaker.validarPosicion("1042");
		assertEquals("X--", result);
	}
	
	@Test
	public void TestOneCorrectAnswerAndThreeExist() {
		String result = codeBreaker.validarPosicion("1342");
		assertEquals("X---", result);
	}
	
	
	@Test
	public void TestOffsets() {
		String result = codeBreaker.validarPosicion("134254564");
		assertEquals("error", result);
	}
	
	@Test
	public void TestLetters() {
		String result = codeBreaker.validarPosicion("[k'(");
		assertEquals("error", result);
	}
}
