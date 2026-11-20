package com.krakendev;

public class CuadradoTest {

	public static void main(String[] args) {
		Cuadrado c1 =new Cuadrado();
		c1.lado=4;
		double areacuadrado=c1.calcularArea();
		double areaPerimetro=c1.calcularPerimetro();
		
		Cuadrado c2 =new Cuadrado();
		c2.lado=3;
		double areaCuadrado2=c2.calcularAre();
		double areaperimetro2=c2.calcularPerimetr();
		
		Cuadrado c3 =new Cuadrado();
		c3.lado=5;
		double areaCuadrado3=c3.calcularAre();
		double areaperimetro3=c3.calcularPerimetr();
		
		
		
		System.out.println("resultado"+areacuadrado);
		System.out.println("rsultado:"+areaPerimetro);
		
		System.out.println("resultado"+areaCuadrado2);
		System.out.println("rsultado:"+areaperimetro2);
		
		System.out.println("resultado"+areaCuadrado3);
		System.out.println("rsultado:"+areaperimetro3);
	}

}
