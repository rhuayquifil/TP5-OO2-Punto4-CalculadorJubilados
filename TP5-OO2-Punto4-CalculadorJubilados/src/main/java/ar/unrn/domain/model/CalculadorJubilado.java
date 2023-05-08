package ar.unrn.domain.model;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorJubilado implements Calculador {

	private LogTransaction log;
	private int mesEnPromocion;

	public CalculadorJubilado(int mesEnPromocion) {
		super();
		this.mesEnPromocion = mesEnPromocion;
		this.log = new LogTransaction();
	}

	public double calcularPrecio(double precioProducto) {
		double precioTotal = precioProducto;
		// si NO esta en promocion se le suma el 10% de IVA
		if (!of(mesEnPromocion).equals(now().getMonth())) {
			precioTotal += precioProducto * 0.1;
		}

		// SI esta en promocion no se le suma el IVA
		log.log(CalculadorJubilado.class.getName());
		return precioTotal;
	}
}
