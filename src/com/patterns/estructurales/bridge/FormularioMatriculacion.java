package com.patterns.estructurales.bridge;

public abstract class FormularioMatriculacion {
	
	protected String contents;
	protected FormularioImpl implementation;
	
	public FormularioMatriculacion(FormularioImpl implementation) {
		this.implementation = implementation;
	}
	
	public void visualiza() {
		implementation.dibujaTexto("Numero de matricula existente");
	}
	
	public void generaDocumento() {
		implementation.dibujaTexto("Solicitud de matriculacion");
		implementation.dibujaTexto("Numero de matricula " + contents);
	}
	
	public boolean administraZona() {
		
		contents = implementation.administraZonaIndicada();
		return this.controlZona(contents);
	}
	
	protected abstract boolean controlZona(String enrollments);
	
}
