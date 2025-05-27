package com.miempresa.AbstractClass.exercises;

public class Taladro extends Herramienta {
    public Taladro(String _nombre) {
        super(_nombre);
    }

    @Override
    public void usar() {
        System.out.println("Perforando con el taladro");
    }
}
