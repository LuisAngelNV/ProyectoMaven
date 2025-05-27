package com.miempresa.Interface.Example;

public class Teclado implements Conectable {
    @Override
    public void conectar() {
        System.out.println("Teclado conectado por Bluetooth");
    }
}
