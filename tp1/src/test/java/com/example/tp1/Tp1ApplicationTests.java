package com.example.tp1;

import com.example.tp1.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class Tp1ApplicationTests {

	private final CalculatorService service = new CalculatorService();

	@Test
	public void testAdd() {
		assertEquals(15, service.add(10, 5));
	}

	@Test
	public void testSubtract() {
		assertEquals(5, service.subtract(10, 5));
	}

	@Test
	public void testMultiply() {
		assertEquals(50, service.multiply(10, 5));
	}

	@Test
	public void testDivide() {
		assertEquals(2, service.divide(10, 5));
	}

	@Test
	public void testDivideByZero() {
		assertThrows(IllegalArgumentException.class, () -> service.divide(10, 0));
	}

	@Test
	public void testSquare() {
		assertEquals(4, service.square(16));
		assertEquals(3, service.square(9));
		assertEquals(0, service.square(0));
		assertEquals(5, service.square(25));
	}

	@Test
	public void testSquareWithNegativeNumber() {
		assertThrows(IllegalArgumentException.class, () -> service.square(-16));
	}

}
