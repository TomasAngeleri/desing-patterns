package com.patterns.utils;

import com.patterns.creacionales.factoryMethod.Cliente;
import com.patterns.creacionales.factoryMethod.ClienteContado;
import com.patterns.creacionales.factoryMethod.ClienteCredito;

public class Usuario {
	public static void main(String [] args) {
		Cliente cliente;
		cliente = new ClienteContado();
		cliente.nuevoPedido(2000.0);
		cliente.nuevoPedido(1000.0);
		cliente = new ClienteCredito();
		cliente.nuevoPedido(2000.0);
		cliente.nuevoPedido(10000.0);
		
	}
}
