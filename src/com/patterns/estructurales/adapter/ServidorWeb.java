package com.patterns.estructurales.adapter;

public class ServidorWeb {

	public static void main(String[] args) {
		
		Documento documento1 = new DocumentoHtml();
		documento1.setContenido("Hello");
		documento1.dibuja();
		System.out.println();
		Documento documento2 = new DocumentoPdf();
		documento2.setContenido("Hola");
		documento2.dibuja();
		
		
	}

}
