package com.miempresa.SobrecargaMetodos.exercises;

public class Conversor {
    public String convertir(double metros){
        return (metros * 0.001) + "km";
    }

    public double convertir(double grados, String tipo){
        double r = 0;
        if (tipo.equalsIgnoreCase("radianes")) {
            r = Math.toRadians(grados);
        } else if (tipo.equalsIgnoreCase("fahrenheit")) {
            r = grados * 1.8 + 32;
        } else {
            throw new IllegalArgumentException("Tipo de conversión no soportado: " + tipo);
        }

        return r;
    }

    public String convertir(String tipo){
        return  tipo.toUpperCase();
    }
}
