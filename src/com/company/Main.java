package com.company;

import com.Cuenta.Cliente;
import com.Cuenta.Cuenta;
import com.Libro.Autor;
import com.Libro.Libro;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Autor JB= new Autor("Joshua","Bloch","joshua@email.com","M");
	    JB.verAutor();
	    Libro EfJava = new Libro("Effective Java",450,150,JB);
	    EfJava.verLibro();
	    EfJava.setPrecioLibro(500);
		EfJava.agregarStock(50);
		EfJava.verLibro();
		EfJava.getAutorLibro().verAutor();
		EfJava.publicacionVenta();

		System.out.println(" ");
		System.out.println(" -------------------------------------------------------- ");
		System.out.println(" ");


		Cliente nuevoCliente = new Cliente("Juan Perez","M");
		nuevoCliente.verCliente();
		Cuenta nuevaCuenta = new Cuenta(3,10000,nuevoCliente);
		nuevaCuenta.depositar(5000);
		nuevaCuenta.extraer(16900);
		nuevaCuenta.depositar(3000);
		nuevaCuenta.depositar(6000);
		nuevaCuenta.extraer(3000);
		nuevaCuenta.depositar(5000);
		nuevaCuenta.extraer(1900);
		nuevaCuenta.depositar(8000);
		nuevaCuenta.extraer(2500);
		nuevaCuenta.extraer(900);
		nuevaCuenta.verOperaciones();


    }
}
