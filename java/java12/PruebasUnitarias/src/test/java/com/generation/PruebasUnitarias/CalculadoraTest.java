package com.generation.PruebasUnitarias;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class CalculadoraTest {
@Test
@DisplayName("metodo de prueba si la suma es correcta")
	void pruebaSuma() {
		calculadora c=new calculadora(true);
		assertEquals(4,c.suma(2, 2),"deberian ser 4");
	}

@Test
@DisplayName("probar si la calculadora esta prendida")
void pruebaIson() {
	calculadora c=new calculadora(true);
	assertTrue(c.isOn());
}
@Test
@DisplayName("prueba division")
void pruebaDiv() {
	calculadora c=new calculadora(true);
	assertEquals(2.5,c.division(2, 5),"deberian ser 4");
}

}
