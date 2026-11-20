package com.krakendev;

public class RestauranteTest {

	public static void main(String[] args) {
		Restaurante r;
		r = new Restaurante();
		
		System.out.println("=============Restaurante 1:agregado============ ");
		
		System.out.println("nombre: " + r.nombre);
		System.out.println("direccion: " + r.direccion);
		System.out.println("calificacion: " + r.calificacion);
		
		System.out.println("=======Restaurante 1:valor asignado======== ");
		
		r.nombre ="Delicias ";
		r.direccion ="Quito";
		r.calificacion =9.5f;
		
		System.out.println("nombre: " + r.nombre);
		System.out.println("direccion: " + r.direccion);
		System.out.println("calificacion: " + r.calificacion);
		
		Restaurante r2;
		r2 = new Restaurante();
		
		
System.out.println("=============Restaurante 2 :agregado============ ");
		
		System.out.println("nombre: " + r2.nombre);
		System.out.println("direccion: " + r2.direccion);
		System.out.println("calificacion: " + r2.calificacion);
		
		System.out.println("========Restaurante 2:valor asignado======= ");
		
		r2.nombre ="Comida Manaba ";
		r2.direccion ="cuenca ";
		r2.calificacion =8.3f;
		
		System.out.println("nombre: " + r2.nombre);
		System.out.println("direccion: " + r2.direccion);
		System.out.println("calificacion: " + r2.calificacion);
		
		
	}

}
