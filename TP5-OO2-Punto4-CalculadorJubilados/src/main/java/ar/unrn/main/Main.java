package ar.unrn.main;

import static java.time.LocalDate.now;

import ar.unrn.domain.model.Calculador;
import ar.unrn.domain.model.CalculadorJubilado;
import ar.unrn.domain.model.CalculadorNOJubilado;

public class Main {

	public static void main(String[] args) {
		Calculador calculadorJubiladoSinPromocion = new CalculadorJubilado(now().getMonth().getValue() - 1);

		Calculador calculadorJubiladoConPromocion = new CalculadorJubilado(now().getMonth().getValue());

		Calculador calculadorNOJubiladoSinPromocion = new CalculadorNOJubilado(now().getMonth().getValue() - 1);

		Calculador calculadorNOJubiladoConPromocion = new CalculadorJubilado(now().getMonth().getValue());

		System.out.println(calculadorJubiladoSinPromocion.calcularPrecio(100));
		System.out.println(calculadorJubiladoConPromocion.calcularPrecio(100));
		System.out.println(calculadorNOJubiladoSinPromocion.calcularPrecio(100));
		System.out.println(calculadorNOJubiladoConPromocion.calcularPrecio(100));
	}

}
