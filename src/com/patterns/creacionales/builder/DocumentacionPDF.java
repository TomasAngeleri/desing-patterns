package com.patterns.creacionales.builder;

public class DocumentacionPDF extends Documentacion{

	@Override
	public void agregarDocumento(String documento) {
		if(documento.startsWith("<PDF>")) {
			contenido.add(documento);
		}
	}

	@Override
	public void imprime() {
		System.out.println("Documentacion PDF");
		for (String s : contenido) {
			System.out.print(s);
		}
	}

}
