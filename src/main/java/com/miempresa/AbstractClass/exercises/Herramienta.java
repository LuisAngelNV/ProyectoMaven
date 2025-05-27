package com.miempresa.AbstractClass.exercises;

public abstract class Herramienta {
    // atributos
    protected String nombre;

    public  Herramienta(String _nombre){
        this.nombre = _nombre;
    }

    public void activar(){
        System.out.println("Activando herramienta: "+nombre);
    }

    public abstract  void  usar();
}

