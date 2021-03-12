package com.patterns.estructurales.proxy;

public class AnimacionProxy implements Animacion {

	protected Video video = null;
	protected String foto = "Mostrar foto";

	@Override
	public void dibuja() {
		if (video != null) {
			video.dibuja();
		} else {
			dibuja(foto);
		}
	}

	@Override
	public void click() {
		if (video == null) {
			video = new Video();
			video.cargar();
		}
		video.reproducir();
	}

	public void dibuja(String foto) {
		System.out.println(foto);
	}

}
