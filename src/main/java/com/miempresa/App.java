package com.miempresa;
import com.miempresa.ClienteVip;
public class App {
    public static void main(String[] args) {
        SaludoService servicio = new SaludoService();
        servicio.saludar("Luis");

        // Ejercicio 2
        // Persona p1 = new Persona();
        // p1.setNombre("Luis");
        // p1.setEdad(27);

        Persona p1 = new Persona(); // sin datos
        p1.saludar();
        Persona p2 = new Persona("Carlos"); // solo nombre
        p2.saludar();
        Persona p3 = new Persona("Ana", 30); // nombre y edad
        p3.saludar();

        // Ejercicio 3
        Cliente c1 = new Cliente("Luis", 27);

        // Ejercicio 4
        Cliente c2 = new Cliente("Luis", 27);
        c2.setDireccion(new Direccion("Calle 1", "Ciudad 1"));
        System.err.println(c2.toString());

        Empleado e1 = new Empleado("Luis", 27, 25000.0);
        e1.saludar();

        Direccion direccion = new Direccion("Siempre Viva", "Ciudad Y");
        ClienteVip cv1 = new ClienteVip("Luis", 27, direccion, 15.0);


        Autobus autobus = new Autobus("Volvo", "X123", 50);
        Tren tren = new Tren("Siemens", "TGV", 10);

        autobus.mostrarInfo();
        System.out.println();
        tren.mostrarInfo();
    }
}