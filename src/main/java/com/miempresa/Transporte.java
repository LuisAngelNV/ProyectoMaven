package com.miempresa;

public class Transporte {
    // Atributos
    private String marca;
    private String modelo;

    public Transporte(String marca, String modelo) {
        this.marca = (marca != null && !marca.isEmpty()) ? marca : "Desconocido";
        this.modelo = (modelo != null && !modelo.isEmpty()) ? modelo : "Desconocido";
    }

    public void mostrarInfo() {
        System.out.println("Transporte de marca: " + marca + ", modelo: " + modelo);
    }

    // Getters por si los necesitas
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}

