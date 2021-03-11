package com.patterns.estructurales.facade;

public class ComponenteGestionDocumento implements GestionDocumento	 {

	@Override
	public String documento(int indice) {
		return "Documento numero: " + indice;
	}

}
