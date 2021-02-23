package com.patterns.creacionales.builder;

public class ConstructorDocumentacionHTML extends ConstructorDocumentacionVehiculo {

	public ConstructorDocumentacionHTML(){
		documentacion = new DocumentacionHtml();
	}
	
	@Override
	public void construyeSolicitudPedido(String nombreCliente) {
		String documento;
		documento = "<HTML>Solicitud de pedido Cliente:" + nombreCliente + " </HTML>";
		documentacion.agregarDocumento(documento);
	}

	@Override
	public void construyeSolicitudMatriculacion(String nombreSolicitante) {
		String documento;
		documento = "<HTML>Solicitud de matriculacion</HTML>";
		documentacion.agregarDocumento(documento);
	}

}
