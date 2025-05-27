package com.miempresa.AbstractClass.Example;

public  class  Motocicleta extends  Vehiculo{
    public Motocicleta(String _marca){
        super(_marca);
    }

    @Override
    public void conducir() {
        System.out.println("Conduciendo la motocicleta " + marca + " con casco.");

    }
}
