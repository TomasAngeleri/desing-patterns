package com.patterns.estructurales.bridge;

public class FormularioMatriculacionEspa�a extends FormularioMatriculacion {

	public FormularioMatriculacionEspa�a(FormularioImpl implementation) {
		super(implementation);
	}

	@Override
	protected boolean controlZona(String enrollments) {
		return enrollments.length() == 7;
	}

}
