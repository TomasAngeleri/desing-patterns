package com.patterns.creacionales.prototype;

public class CertificadoDeCesion extends Documento{

	@Override
	public void imprime() {
		System.out.println("Imprime el certificado de cesion: "+ contenido);
	}

	@Override
	public void visualiza() {
		System.out.println("Muesta el certificado de cesion: " + contenido);
	}

}
