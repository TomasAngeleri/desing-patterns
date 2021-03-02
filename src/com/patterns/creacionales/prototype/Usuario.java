package com.patterns.creacionales.prototype;

public class Usuario {

	public static void main(String[] args) {
		
		DocumentacionEnBlanco documentacionEnBlanco = DocumentacionEnBlanco.Instance();
		
		documentacionEnBlanco.incluye(new OrdenDePedido());
		documentacionEnBlanco.incluye(new CertificadoDeCesion());
		documentacionEnBlanco.incluye(new SolicitudMatriculacion());
		
		DocumentacionCliente documentacionCliente1 = new DocumentacionCliente("Martin");
		DocumentacionCliente documentacionCliente2 = new DocumentacionCliente("Lola");
		
		documentacionCliente1.visualiza();
		documentacionCliente1.imprime();
		System.out.println("");
		documentacionCliente2.visualiza();
		documentacionCliente2.imprime();
		
	}

}
