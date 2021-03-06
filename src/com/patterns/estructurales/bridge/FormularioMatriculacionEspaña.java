package com.patterns.estructurales.bridge;

public class FormularioMatriculacionEspaņa extends FormularioMatriculacion {

	public FormularioMatriculacionEspaņa(FormularioImpl implementation) {
		super(implementation);
	}

	@Override
	protected boolean controlZona(String enrollments) {
		return enrollments.length() == 7;
	}

}
