package com.miempresa;

import com.miempresa.AbstractClass.Example.Motocicleta;
import com.miempresa.AbstractClass.Example.Vehiculo;
import com.miempresa.Interface.Ejercicios.Cargable;
import com.miempresa.Interface.Ejercicios.Celular;
import com.miempresa.Interface.Ejercicios.Laptop;
import com.miempresa.Interface.Ejercicios.PowerBank;
import com.miempresa.Interface.Example.Conectable;
import com.miempresa.Interface.Example.Mouse;
import com.miempresa.Interface.Example.Teclado;
import com.miempresa.polimorfismo.Ejemplo.Auto;
import com.miempresa.polimorfismo.Ejemplo.Bicicleta;
import com.miempresa.polimorfismo.Ejemplo.Transporte;
import com.miempresa.polimorfismo.Ejercicio.Animal;
import com.miempresa.polimorfismo.Ejercicio.gato;
import com.miempresa.polimorfismo.Ejercicio.perro;

import java.util.ArrayList;
import java.util.List;


//import com.miempresa.ClienteVip;
public class App {
    public static void main(String[] args) {
        SaludoService servicio = new SaludoService();
        servicio.saludar("Luis");

        // Ejercicio 2
        // Persona p1 = new Persona();
        // p1.setNombre("Luis");
        // p1.setEdad(27);

        Persona p1 = new Persona(); // sin datos
        p1.saludar();
        Persona p2 = new Persona("Carlos"); // solo nombre
        p2.saludar();
        Persona p3 = new Persona("Ana", 30); // nombre y edad
        p3.saludar();

        // Ejercicio 3
        Cliente c1 = new Cliente("Luis", 27);

        // Ejercicio 4
//        Cliente c2 = new Cliente("Luis", 27);
//        c2.setDireccion(new Direccion("Calle 1", "Ciudad 1"));
//        System.err.println(c2.toString());
//
//        Empleado e1 = new Empleado("Luis", 27, 25000.0);
//        e1.saludar();
//
//        Direccion direccion = new Direccion("Siempre Viva", "Ciudad Y");
////        ClienteVip cv1 = new ClienteVip("Luis", 27, direccion, 15.0);


        Autobus autobus = new Autobus("Volvo", "X123", 50);
        Tren tren = new Tren("Siemens", "TGV", 10);

        autobus.mostrarInfo();
        System.out.println();
        tren.mostrarInfo();

        // Polimorfismo
        Transporte t1 = new Bicicleta();
        Transporte t2 = new Auto();

        t1.mover(); // La bicicleta avanza pedaleando.
        t2.mover(); // El auto avanza con motor.

        System.out.println("____________Polymorphism");
        Animal a1 = new perro();
        Animal a2 = new gato();
        a1.hacerSonido();
        a2.hacerSonido();

        System.out.println("__________Interface-Example");
        Conectable mouse = new Mouse();
        Conectable teclado = new Teclado();

        System.out.println("__________Interface-exercises");
        List<Cargable> cargableList = new ArrayList<Cargable>(){{
            add(new Celular());
            add(new Laptop());
            add(new PowerBank());
        }};

        for(Cargable CL : cargableList){
            CL.cargar();
        }

        System.out.println("__________AbtrsactClass");
        List<Vehiculo> vehiculoList = new ArrayList<Vehiculo>(){{
          add(new com.miempresa.AbstractClass.Example.Auto("Toyota"));
          add(new Motocicleta("Yamaha"));
        }};


        for (Vehiculo vl : vehiculoList) {
            vl.encender();
            vl.conducir();

            if (vl instanceof com.miempresa.AbstractClass.Example.Auto) {
                System.out.println("Este es un automóvil.");
            } else if (vl instanceof Motocicleta) {
                System.out.println("Esta es una motocicleta.");
            }
        }
    }
}