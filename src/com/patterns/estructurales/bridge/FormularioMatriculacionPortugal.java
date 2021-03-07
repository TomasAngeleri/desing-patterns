package com.patterns.estructurales.bridge;

public class FormularioMatriculacionPortugal extends FormularioMatriculacion {

	public FormularioMatriculacionPortugal(FormularioImpl implementation) {
		super(implementation);
	}

	@Override
	protected boolean controlZona(String enrollments) {
		return enrollments.length() == 6;
	}

}
