package com.patterns.utils;

import java.util.Scanner;

import com.patterns.creacionales.builder.ConstructorDocumentacionHTML;
import com.patterns.creacionales.builder.ConstructorDocumentacionPDF;
import com.patterns.creacionales.builder.ConstructorDocumentacionVehiculo;
import com.patterns.creacionales.builder.Documentacion;
import com.patterns.creacionales.builder.Vendedor;

public final class ClienteVehiculo {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		ConstructorDocumentacionVehiculo constructorDocumentacionVehiculo;
		System.out.println("Desea generar la documentacion en HTML(1) o PDF(2): ");
		String seleccion = reader.next();
		
		if(seleccion.equals("1")) {
			constructorDocumentacionVehiculo = new ConstructorDocumentacionHTML();
		}else {
			constructorDocumentacionVehiculo = new ConstructorDocumentacionPDF();
		}
		
		Vendedor vendedor = new Vendedor(constructorDocumentacionVehiculo);
		Documentacion documentacion = vendedor.construye("Martin");
		documentacion.imprime();
		
	}

}
