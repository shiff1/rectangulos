package com.krakendev;

public class VehiculoTest {

	public static void main(String[] args) {
		
		Vehiculo V;
		V = new Vehiculo ();
		
		System.out.println("Vheiculo 1:Creado ");
		
		System.out.println("Año: " + V.año);
		System.out.println("Marca: " + V.marca);
		System.out.println("Modelo: " + V.modelo);
		
		System.out.println("Vehiculo 1 : valores asignados");
		
		V.año ="2012";
		V.marca ="chevrolet";
		V.modelo ="Nuevo";
		
		System.out.println("Año: " + V.año);
		System.out.println("Marca: " + V.marca);
		System.out.println("Modelo: " + V.modelo);
		
	
		

	}

}
