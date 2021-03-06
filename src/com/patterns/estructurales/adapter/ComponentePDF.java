package com.patterns.estructurales.adapter;

public class ComponentePDF {
	
	protected String contenido;
	
	public void pdfFijaContenido(String contenido) {
		this.contenido = contenido;
	}
	
	public void pdfPreparaVisualizacion() {
		System.out.println("Visualza PDF: Comienzo");
	}
	
	public void pdfRefresca() {
		System.out.println("Visualiza contenido PDF: " + contenido);
	}
	
	public void pdfFinalizarVisualizacion() {
		System.out.println("Visualiza PDF: Fin");
	}
	
	public void pdfEnviaImpresora() {
		System.out.println("Impresion PDF: " + contenido);
	}
}
