package com.krakendev;

public class RectanguloTest {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		
		r1.altura = 5;
		r1.base = 4;
		int resultadoArea;
		resultadoArea= r1.calcularArea();
		System.out.println("resultado : " + resultadoArea);
		
		Rectangulo r2 = new Rectangulo();
        int resultadoArea2;
        r2.altura=8;
        r2.base=2;
        
        resultadoArea2= r2.calcularArea();
        
        System.out.println("Rectangulo 2: "+resultadoArea2);
        
        Rectangulo r3 = new Rectangulo();
        double resultadoPerimetro;
        r3.altura = 4;
        r3.base =2;
        resultadoPerimetro = r3.calcularPerimetro();
        System.out.println("Rectangulo 3: "+resultadoPerimetro);
	}

}
