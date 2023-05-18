package ar.unrn.domain.model;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public abstract class Calculador {

	private LogTransaction log;
	private int mesEnPromocion;

	public Calculador(int mesEnPromocion) {
		this.mesEnPromocion = mesEnPromocion;
		this.log = new LogTransaction();
	}

	public double calcularPrecio(double precioProducto) {
		log.log(this.getClass().getName());
		if (of(mesEnPromocion).equals(now().getMonth())) { // SI esta en promocion
			return this.mesEnPromocion(precioProducto);
		}
		// si NO esta en mes de promocion
		return this.mesSinPromocion(precioProducto);

	}

	protected abstract double mesEnPromocion(double precioProducto);

	protected abstract double mesSinPromocion(double precioProducto);
}
