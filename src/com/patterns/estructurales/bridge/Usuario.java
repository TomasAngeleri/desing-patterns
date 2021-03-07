package com.patterns.estructurales.bridge;

public class Usuario {
	
	public static void main(String [] args) {
		
		FormularioMatriculacionPortugal formPortugal = new FormularioMatriculacionPortugal(new FormHtmlImpl());
		formPortugal.visualiza();
		if(formPortugal.administraZona()) {
			formPortugal.generaDocumento();
		}
		System.out.println();
		
		FormularioMatriculacionEspa�a formEspa�a = new FormularioMatriculacionEspa�a(new FormAppletImpl());
		formEspa�a.visualiza();
		if(formEspa�a.administraZona()) {
			formEspa�a.generaDocumento();
		}
		
		
	}
	
}
