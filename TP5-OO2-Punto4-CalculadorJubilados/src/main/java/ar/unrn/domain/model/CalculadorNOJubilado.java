package ar.unrn.domain.model;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorNOJubilado implements Calculador {

	private LogTransaction log;
	private int mesEnPromocion;

	public CalculadorNOJubilado(int mesEnPromocion) {
		super();
		this.mesEnPromocion = mesEnPromocion;
		this.log = new LogTransaction();
	}

	public double calcularPrecio(double precioProducto) {
		double precioTotal = precioProducto;
		if (of(mesEnPromocion).equals(now().getMonth())) { // SI esta en promocion se le suma solo 3l 10% IVA
			precioTotal += precioProducto * 0.15;
		} else { // si NO tiene promocion se le suma el 21% IVA
			precioTotal += precioProducto * 0.21;
		}
		log.log(CalculadorNOJubilado.class.getName());
		return precioTotal;
	}
}
