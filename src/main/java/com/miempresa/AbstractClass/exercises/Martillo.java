package com.miempresa.AbstractClass.exercises;

public class Martillo extends Herramienta {
    public Martillo(String _nombre) {
        super(_nombre);
    }

    @Override
    public void usar() {
        System.out.println("Golpeando clavos con el martillo");
    }
}

