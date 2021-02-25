package com.patterns.creacionales.factoryMethod;

public class PedidoContado extends Pedido {

	public PedidoContado(double importe) {
		super(importe);
	}

	@Override
	public boolean valida() {
		return true;
	}
	
	public void paga() {
		System.out.println("El pago del pedido por importe de: " +
				importe +" se ha realizado correctamente.");
	}

}
