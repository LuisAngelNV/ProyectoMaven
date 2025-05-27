package com.miempresa.AbstractClass.Example;

public abstract class Vehiculo {
    // Atributos
    protected String marca;
    public Vehiculo(String _marca){
        this.marca = _marca;
    }

    public void encender(){
        System.out.println("El vehiculo de marca "+marca+" está encendido.");
    }

    public abstract void conducir();
}


