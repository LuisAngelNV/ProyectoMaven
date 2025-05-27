package com.miempresa.AbstractClass.Example;

public  class Auto extends Vehiculo{
    public Auto(String _marca){
        super(_marca);
    }

    @Override
    public void conducir() {
        System.out.println("Conduciendo la motocicleta " + marca + " con casco.");
    }
}
