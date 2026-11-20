package com.krakendev;

public class PlatosTest {

	public static void main(String[] args) {
		Platos p;
		p= new Platos();
		
		System.out.println("==========Plato A : agregado===========");
		
		System.out.println("nombre: " + p.nombre);
		System.out.println("Tipo: " + p.tipo);
		System.out.println("Precio: " + p.precio);
		System.out.println("disponible:" + p.disponible);
		
		System.out.println("========Plato A : valor agregado========");
		
		p.nombre = "Encocado de pescado";
		p.tipo ="Plato fuerte";
		p.precio = 5f;
		p.disponible = true;
		
		System.out.println("nombre: " + p.nombre);
		System.out.println("Tipo: " + p.tipo);
		System.out.println("Precio: " + p.precio);
		System.out.println("disponible:" + p.disponible);
		
		Platos p2;
		p2= new Platos();
		
		System.out.println("==========Plato B : agregado===========");
		
		System.out.println("nombre: " + p2.nombre);
		System.out.println("Tipo: " + p2.tipo);
		System.out.println("Precio: " + p2.precio);
		System.out.println("disponible:" + p2.disponible);
		
		System.out.println("========Plato B : valor agregado========");
		
		p2.nombre = "sopa de res";
		p2.tipo ="Entrada";
		p2.precio = 8.50f;
		p2.disponible = false;
		
		System.out.println("nombre: " + p2.nombre);
		System.out.println("Tipo: " + p2.tipo);
		System.out.println("Precio: " + p2.precio);
		System.out.println("disponible:" + p2.disponible);
		
		Platos p3;
		p3= new Platos();
		
		System.out.println("==========Plato C : agregado===========");
		
		System.out.println("nombre: " + p3.nombre);
		System.out.println("Tipo: " + p3.tipo);
		System.out.println("Precio: " + p3.precio);
		System.out.println("disponible:" + p3.disponible);
		
		System.out.println("========Plato C : valor agregado========");
		
		p3.nombre = "pay de banana ";
		p3.tipo ="Postre";
		p3.precio = 2.50f;
		p3.disponible = false;
		
		System.out.println("nombre: " + p3.nombre);
		System.out.println("Tipo: " + p3.tipo);
		System.out.println("Precio: " + p3.precio);
		System.out.println("disponible:" + p3.disponible);
		
		
		
	}

}
