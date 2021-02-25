package com.patterns.creacionales.factoryMethod;

public class ClienteCredito extends Cliente {

	@Override
	protected Pedido creaPedido(double importe) {
		// TODO Auto-generated method stub
		return new PedidoCredito(importe);
	}

	
}
