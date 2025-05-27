package com.miempresa.Interface.Ejercicios;

public class Celular implements Cargable{
    @Override
    public void cargar(){
        System.out.println("Cargando celular por cable.");
    }
}
