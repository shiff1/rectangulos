package com.krakendev;

public class Rectangulo {
  
	public int base;
	public int altura;
	
	public int calcularArea() {
		int area =base * altura;
		return area;
	}
	
	public double calcularPerimetro() {
		
		return (2*base)+(2*altura);
	}
}
