package com.patterns.creacionales.utils;

import java.util.Scanner;

import com.patterns.creacionales.abstractFactory.Automovil;
import com.patterns.creacionales.abstractFactory.FabricaVehiculo;
import com.patterns.creacionales.abstractFactory.FabricaVehiculoElectrico;
import com.patterns.creacionales.abstractFactory.FabricaVehiculoGasolina;
import com.patterns.creacionales.abstractFactory.Scooter;

public class Catalogo {
	public static void main(String [] args ) {
		
		int nAutos = 3;
		int nScooter = 2;
		
		Scanner reader = new Scanner(System.in);
		FabricaVehiculo fabrica;
		
		Automovil[] autos = new Automovil[nAutos];
		Scooter[] scooters = new Scooter[nScooter];
		
		System.out.print("Desea utilizar vehiculos electrico (1) o a gasolina (2):");
		String eleccion = reader.next();
		
		if(eleccion.equals("1")) {
			fabrica = new FabricaVehiculoElectrico();
		}else {
			fabrica = new FabricaVehiculoGasolina();
		}
		
		for (int i = 0; i < nAutos; i++) {
			autos[i] = fabrica.crearAutomovil("estandar", "blanco", (1+i), 5.0);
		}
		
		for (int i = 0; i < nScooter; i++) {
			scooters[i] = fabrica.crearScooter("clasico", "rojo", (1+i));
		}
		
		for (Automovil auto : autos) {
			auto.mostrarCaracteristicas();
		}
		
		for (Scooter scooter : scooters) {
			scooter.mostrarCaracteristicas();
		}
		
	}
	
	
}
