package com.patterns.estructurales.proxy;

public class VistaVehiculo {

	public static void main(String[] args) {
		Animacion animacion  = new AnimacionProxy();
		animacion.dibuja(); 
		animacion.click();
		animacion.dibuja();
		
		//Mostrar foto
		//Cargar video
		//Reproducir video
		//Mostrar el video

	}

}
