package com.miempresa;

public class Tren extends Transporte {
    private int numeroVagones;

    public Tren(String marca, String modelo, int numeroVagones) {
        super(marca, modelo);
        this.numeroVagones = numeroVagones;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("[Tren]");
        super.mostrarInfo();
        System.out.println("Número de vagones: " + numeroVagones);
    }
}
