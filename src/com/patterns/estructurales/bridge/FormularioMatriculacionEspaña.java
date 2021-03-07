package com.patterns.estructurales.bridge;

public class FormularioMatriculacionEspaña extends FormularioMatriculacion {

	public FormularioMatriculacionEspaña(FormularioImpl implementation) {
		super(implementation);
	}

	@Override
	protected boolean controlZona(String enrollments) {
		return enrollments.length() == 7;
	}

}
