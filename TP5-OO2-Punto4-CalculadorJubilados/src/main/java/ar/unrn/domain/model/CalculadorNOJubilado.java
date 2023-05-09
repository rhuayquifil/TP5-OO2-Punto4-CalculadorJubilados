package ar.unrn.domain.model;

public class CalculadorNOJubilado extends Calculador {

	private LogTransaction log;
	private int mesEnPromocion;

	public CalculadorNOJubilado(int mesEnPromocion) {
		super(mesEnPromocion);
	}

	@Override
	protected double mesEnPromocion(double precioProducto) {
		return (precioProducto * 0.15) + precioProducto;
	}

	@Override
	protected double mesSinPromocion(double precioProducto) {
		return (precioProducto * 0.21) + precioProducto;
	}
}
