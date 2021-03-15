package com.patterns.comportamiento.command;

public class Vehiculo {
		
	protected String name;
	protected long stockEntryDate;
	protected double salePrice;
	
	public Vehiculo(String name, long stockEntryDate, double salePrice) {
		this.name = name;
		this.stockEntryDate = stockEntryDate;
		this.salePrice = salePrice;
	}
	
	public long getTiempoEnStock(long today) {
		return today-stockEntryDate;
	}
	
	public void modificaPrecio(double coefficient) {
		this.salePrice = 0.01 *  Math.round(coefficient * this.salePrice * 100);
	}
	
	public void visualiza() {
		System.out.println(name + "precio: " + salePrice + "fecha entrada stock" + stockEntryDate);
	}
	
}
