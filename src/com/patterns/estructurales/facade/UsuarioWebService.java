package com.patterns.estructurales.facade;

import java.util.List;

public class UsuarioWebService {

	public static void main(String[] args) {

		WebServiceAuto webServiceAuto = new WebServiceImpl();
		System.out.println(webServiceAuto.documento(0));
		System.out.println(webServiceAuto.documento(1));
		List<String> resultados = webServiceAuto.buscaVehiculo(6000, 1000);
		if (resultados.size() > 0) {
			System.out.println("Vehiculo(s) cuyo precio esta comprendido entre 5000 y 7000");
			for (String vehicle : resultados) {
				System.out.println("" + vehicle);
			}
		}

	}

}
