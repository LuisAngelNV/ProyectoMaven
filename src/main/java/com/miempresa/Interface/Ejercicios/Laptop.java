package com.miempresa.Interface.Ejercicios;

public class  Laptop implements Cargable{
    @Override
    public void cargar() {
        System.out.println("Cargando laptop por enchufe.");
    }
}
