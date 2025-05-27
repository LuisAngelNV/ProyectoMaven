package com.miempresa;

import com.miempresa.Persona;
public class Empleado extends Persona {
    private double salario;

    public Empleado(String nombre, int edad, double _salario) {
        super(nombre, edad);
        this.salario = _salario;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, mi nombre es " + getNombre() +
                ", soy un empleado y gano $" + salario);
    }
}