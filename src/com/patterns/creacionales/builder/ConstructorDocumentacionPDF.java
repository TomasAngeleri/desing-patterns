package com.patterns.creacionales.builder;

public class ConstructorDocumentacionPDF extends ConstructorDocumentacionVehiculo {

	public ConstructorDocumentacionPDF(){
		documentacion = new DocumentacionPDF();
	}
	
	@Override
	public void construyeSolicitudPedido(String nombreCliente) {
		String documento;
		documento = "<PDF>Solicitud de pedido Cliente:" + nombreCliente + " </PDF>";
		System.out.println("");
		documentacion.agregarDocumento(documento);
		
	}

	@Override
	public void construyeSolicitudMatriculacion(String nombreSolicitante) {
		String documento;
		documento = "<PDF>Solicitud de matriculacion</PDF>";
		documentacion.agregarDocumento(documento);
	}

}
