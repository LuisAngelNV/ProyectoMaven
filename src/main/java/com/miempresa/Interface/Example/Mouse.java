package com.miempresa.Interface.Example;

public class Mouse implements Conectable {
    @Override
    public void conectar() {
        System.out.println("Mouse conectado por USB");
    }
}
