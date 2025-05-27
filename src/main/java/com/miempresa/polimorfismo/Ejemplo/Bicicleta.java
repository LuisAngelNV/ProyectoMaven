package com.miempresa.polimorfismo.Ejemplo;

public class Bicicleta extends Transporte {
    @Override
    public void mover() {
        System.out.println("La bicicleta avanza pedaleando.");
    }
}
