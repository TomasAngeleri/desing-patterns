package com.patterns.estructurales.bridge;

public class Usuario {
	
	public static void main(String [] args) {
		
		FormularioMatriculacionPortugal formPortugal = new FormularioMatriculacionPortugal(new FormHtmlImpl());
		formPortugal.visualiza();
		if(formPortugal.administraZona()) {
			formPortugal.generaDocumento();
		}
		System.out.println();
		
		FormularioMatriculacionEspaña formEspaña = new FormularioMatriculacionEspaña(new FormAppletImpl());
		formEspaña.visualiza();
		if(formEspaña.administraZona()) {
			formEspaña.generaDocumento();
		}
		
		
	}
	
}
