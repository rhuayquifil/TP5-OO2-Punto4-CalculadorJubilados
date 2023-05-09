package ar.unrn.test;

import static java.time.LocalDate.now;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.unrn.domain.model.Calculador;
import ar.unrn.domain.model.CalculadorJubilado;
import ar.unrn.domain.model.CalculadorNOJubilado;

class PruebasUnitarias {

	@Test
	void calculadorJubiladoSinPromocion() {
		Calculador calculadorJubiladoSinPromocion = new CalculadorJubilado(now().getMonth().getValue() - 1);

		double resultado = calculadorJubiladoSinPromocion.calcularPrecio(100);

		assertEquals(110.0, resultado);
	}

	@Test
	void calculadorJubiladoConPromocion() {
		Calculador calculadorJubiladoConPromocion = new CalculadorJubilado(now().getMonth().getValue());

		double resultado = calculadorJubiladoConPromocion.calcularPrecio(100);

		assertEquals(100.0, resultado);
	}

	@Test
	void calculadorNOJubiladoSinPromocion() {
		Calculador calculadorNOJubiladoSinPromocion = new CalculadorNOJubilado(now().getMonth().getValue() - 1);

		double resultado = calculadorNOJubiladoSinPromocion.calcularPrecio(100);

		assertEquals(121.0, resultado);
	}

	@Test
	void calculadorNOJubiladoConPromocion() {
		Calculador calculadorNOJubiladoConPromocion = new CalculadorNOJubilado(now().getMonth().getValue());

		double resultado = calculadorNOJubiladoConPromocion.calcularPrecio(100);

		assertEquals(115.0, resultado);
	}
}
