package com.patterns.creacionales.factoryMethod;

public class ClienteContado extends Cliente {

	@Override
	protected Pedido creaPedido(double importe) {
		// TODO Auto-generated method stub
		return new PedidoContado(importe);
	}

	
}
