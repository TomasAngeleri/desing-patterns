package com.patterns.estructurales.proxy;

public class Video implements Animacion {

	@Override
	public void dibuja() {
		System.out.println("Mostrar el video");
	}

	@Override
	public void click() {

	}

	public void cargar() {
		System.out.println("Cargar video");
	}

	public void reproducir() {
		System.out.println("Reproducir video");
	}

}
