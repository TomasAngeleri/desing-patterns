package com.patterns.estructurales.adapter;

public class DocumentoHtml implements Documento {
	
	protected String contenido;
	
	@Override
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public void dibuja() {
		System.out.println("Dibuja el contenido HTML:" + contenido);
	}

	@Override
	public void imprime() {
		System.out.println("Imprime el contenido HTML: " + contenido);
	}

}
