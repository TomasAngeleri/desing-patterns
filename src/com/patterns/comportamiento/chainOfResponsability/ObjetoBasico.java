package com.patterns.comportamiento.chainOfResponsability;

public abstract class ObjetoBasico {

	protected ObjetoBasico siguiente;

	private String descripcionPorDefecto() {
		return "Descripcion por defecto";
	}

	protected abstract String getDescripcion();

	public String devuelveDescripcion() {
		String resultado;
		resultado = this.getDescripcion(); // Bandera para las subclases

		if (resultado != null)
			return resultado;
		if (siguiente != null)
			return siguiente.devuelveDescripcion();
		else
			return this.descripcionPorDefecto();
	}
	
	public void setSiguiente(ObjetoBasico siguiente) {
		this.siguiente = siguiente;
	}
}
