package com.krakendev;

public class Calculadora {
	
	public int sumar (int a , int b) {
		int resultado;
		 resultado = a + b;
		 return resultado;
	}
	
	
	public int restar(int a, int b){
	     int resultado;
	     resultado =a - b;
	     return resultado;
	}
	
	public float multiplicar (float valor1 , float valor2) {
		float resultado;
		resultado =valor1 * valor2;
		return resultado;
	}
	
	public float dividir (float dividiendo, float divisor) {
		float resultado ;
		resultado=dividiendo / divisor;
		return resultado;
	}
	
	public float promediar ( float n1 , float n2 , float n3 , float n4) {
		float resultado;
		resultado =(n1 + n2 +n3 )/ n4;
		return resultado;
	}
	
    
	public void mostrarResultado() {
	    System.out.println("Ahorita no joven, Salí al almuerzo. Regreso en 15 minutos");
	}


	
	

}
