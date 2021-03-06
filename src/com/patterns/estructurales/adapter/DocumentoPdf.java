package com.patterns.estructurales.adapter;

public class DocumentoPdf implements Documento {
	
	protected ComponentePDF herramientaPDF = new ComponentePDF();
	
	@Override
	public void setContenido(String contenido) {
		herramientaPDF.pdfFijaContenido(contenido);
	}

	@Override
	public void dibuja() {
		herramientaPDF.pdfPreparaVisualizacion();
		herramientaPDF.pdfRefresca();
		herramientaPDF.pdfFinalizarVisualizacion();
	}

	@Override
	public void imprime() {
		herramientaPDF.pdfEnviaImpresora();
	}

}
