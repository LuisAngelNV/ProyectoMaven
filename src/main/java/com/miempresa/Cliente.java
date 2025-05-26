package com.miempresa;

public class Cliente {

    private String nombre;
    private int edad;
    private Direccion direccion;

    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    // Getters y setters
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
    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", direccion=" + direccion +
                '}';
    }
    

}
