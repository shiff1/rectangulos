package com.krakendev;

public class CalculadoraTest {

	public static void main(String[] args) {
		
		Calculadora c = new Calculadora ();
		int r1;
		r1=c.sumar(4, 2);
		System.out.println("Resultado Suma: " + r1);
		
		Calculadora c2 = new Calculadora ();
		int r2;
		r2=c2.restar(4, 1);
		System.out.println("Resultado Resta: " + r2);
		
		Calculadora m = new Calculadora ();
		float m1;
	    m1 = m.multiplicar(10, 5);
	    System.out.println("Resultado Multiplicacion: " + m1);
	    
	    Calculadora d = new Calculadora ();
	    float d1;
	    d1 = d.dividir(10, 2);
	    System.out.println("Resultado divicion: " + d1);
	    
	    Calculadora p = new Calculadora ();
	    float p1;
	    p1 = p.promediar(10, 8, 9, 3);
	    System.out.println("Resultadodel promedio: " + p1);
	    
	    Calculadora calculadora = new Calculadora();
	    calculadora.mostrarResultado();

	    
	    		
	    
	
	}

}
