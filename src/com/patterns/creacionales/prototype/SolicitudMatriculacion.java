package com.patterns.creacionales.prototype;

public class SolicitudMatriculacion extends Documento{

	@Override
	public void imprime() {
		System.out.println("Imprime la solicitud de matriculacio: "+ contenido);
	}

	@Override
	public void visualiza() {
		System.out.println("Muesta la solicitud de matriculacio: " + contenido);
	}

}
