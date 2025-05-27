package com.miempresa.polimorfismo.Ejemplo;

public class Auto extends Transporte {
    @Override
    public void mover() {
        System.out.println("El auto avanza con motor.");
    }
}
