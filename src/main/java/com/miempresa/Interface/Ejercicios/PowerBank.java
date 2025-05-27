package com.miempresa.Interface.Ejercicios;

public  class  PowerBank implements  Cargable{
    @Override
    public void cargar() {
        System.out.println("Cargando powerbank por panel solar.");
    }
}
