package com.miempresa.AbstractClass.exercises;

public class Destornillador extends Herramienta{
    public Destornillador(String _nombre){
        super(_nombre);
    }

    @Override
    public void usar() {
        System.out.println("Atornillando tornillos");
    }
}
