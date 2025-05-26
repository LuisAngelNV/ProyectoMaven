package com.miempresa;

public class App 
{
    public static void main( String[] args )
    {
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
    }
}