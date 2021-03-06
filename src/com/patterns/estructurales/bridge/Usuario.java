package com.patterns.estructurales.bridge;

public class Usuario {
	
	public static void main(String [] args) {
		
		FormularioMatriculacionPortugal formPortugal = new FormularioMatriculacionPortugal(new FormHtmlImpl());
		formPortugal.visualiza();
		if(formPortugal.administraZona()) {
			formPortugal.generaDocumento();
		}
		System.out.println();
		
		FormularioMatriculacionEspaņa formEspaņa = new FormularioMatriculacionEspaņa(new FormAppletImpl());
		formEspaņa.visualiza();
		if(formEspaņa.administraZona()) {
			formEspaņa.generaDocumento();
		}
		
		
	}
	
}
