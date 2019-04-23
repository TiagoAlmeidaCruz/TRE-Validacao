import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class principalTest {

	@Test
	public void testValidStringCT01() {
		boolean vteste = false;
		vteste = validacao.validaString("Tiago Almeida");
		assertEquals(true, vteste);
	}
	
	@Test
	public void testValidStringCT02() {
		boolean vteste = false;
		vteste = validacao.validaString("Ti4go Almeida");
		assertEquals(true, vteste);
	}
	
	@Test
	public void testValidStringCT03() {
		boolean vteste = false;
		vteste = validacao.validaString("Tiago Almeid#");
		assertEquals(true, vteste);
	}
	
	@Test
	public void testValidStringCT04() {
		boolean vteste = false;
		vteste = validacao.validaString("Flaviane marques");
		assertEquals(true, vteste);
	}
	
	@Test
	public void testValidStringCT05() {
		boolean vteste = false;
		vteste = validacao.validaString("flaviane Marques");
		assertEquals(true, vteste);
	}
	
	@Test
	public void testValidStringCT06() {
		boolean vteste = false;
		vteste = validacao.validaString("Elyse Souzammmmmmmmmmml");
		assertEquals(true, vteste);
	}
	
	@Test
	public void testValidStringCT07() {
		boolean vteste = false;
		vteste = validacao.validaString("Elyse Sou");
		assertEquals(true, vteste);
	}
	
	@Test
	public void testValidStringCT08() {
		boolean vteste = false;
		vteste = validacao.validaString("Fatima");
		assertEquals(true, vteste);
	}
	
	@Test
	public void testValidStringCT09() {
		boolean vteste = false;
		vteste = validacao.validaString("Fatima ");
		assertEquals(true, vteste);
	}
	
}
