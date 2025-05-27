package com.miempresa;

public  class  Autobus extends Transporte
{
    // Atributos
    private  int capacidadPasajeros;

    // Constructor
    public Autobus(String marca, String modelo, int _capacidadPasajeros){
        super(marca, modelo);
        this.capacidadPasajeros = _capacidadPasajeros;
    }

    // SobreEscribir metodo

    @Override
    public void mostrarInfo() {
        System.out.println("Autobus");
        super.mostrarInfo();
        System.out.println("Capacidad: " + capacidadPasajeros + " pasajeros.");
    }
}


