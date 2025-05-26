package com.miempresa;

public class Persona {
    // Atributos de la clase
    private String nombre;
    private int edad;

    // Constructor por defecto
    public Persona() {
    }

    // Constructor solo con nombre
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Metodos
    void saludar() {
        String nombreMostrar = (nombre != null) ? nombre : "desconocido";
        String edadMostrar = (edad > 0) ? String.valueOf(edad) : "una edad desconocida";
        System.out.println("Hola, mi nombre es " + nombreMostrar + " y tengo " + edadMostrar + " años.");
    }

}
