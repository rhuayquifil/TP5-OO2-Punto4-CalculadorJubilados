package ar.unrn.domain.model;

public class CalculadorJubilado extends Calculador {

	private LogTransaction log;
	private int mesEnPromocion;

	public CalculadorJubilado(int mesEnPromocion) {
		super(mesEnPromocion);
	}

	@Override
	protected double mesEnPromocion(double precioProducto) {
		return precioProducto;
	}

	@Override
	protected double mesSinPromocion(double precioProducto) {
		return (precioProducto * 0.1) + precioProducto;
	}
}
