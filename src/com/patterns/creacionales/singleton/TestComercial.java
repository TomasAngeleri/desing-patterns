package com.patterns.creacionales.singleton;

public class TestComercial {

	public static void main(String[] args) {
		
		//Inicializar el comercial en el sistema
		Comercial vendedor = Comercial.Instance();
		vendedor.setNombre("tomi");
		vendedor.setDireccion("avellaneda");
		vendedor.setEmail("tomi@safdasdas.com");
		visualiza();
	}
	
	public static void visualiza() {
		Comercial comercial = Comercial.Instance();
		comercial.visualiza();
	}

}
