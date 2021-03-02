package com.patterns.creacionales.prototype;

import java.util.ArrayList;

public class DocumentacionEnBlanco extends Documentacion {
	
	private static DocumentacionEnBlanco _intance = null;
	
	private DocumentacionEnBlanco() {
		documentos = new ArrayList<Documento>();
	}
	
	public static DocumentacionEnBlanco Instance() {
		if(_intance == null) { 
			_intance = new DocumentacionEnBlanco();
		}
		return _intance;					
	}
	
	public void incluye(Documento doc) {
		documentos.add(doc);
	}
	
	public void excluye(Documento doc) {
		documentos.remove(doc);
	}
	
}
