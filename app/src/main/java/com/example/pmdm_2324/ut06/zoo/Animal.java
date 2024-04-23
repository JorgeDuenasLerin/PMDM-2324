package com.example.pmdm_2324.ut06.zoo;

import java.util.ArrayList;

public class Animal {

    private String nombre;
    private String tipo;
    private String color;

    public Animal(String nombre, String tipo, String color) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /* Solo con fines didácticos. No suele haber este tipo de métodos*/
    public static ArrayList<Animal> generarDatos(){
        ArrayList<Animal> animales = new ArrayList<Animal>();
        animales.add(new Animal("Tobby", "Perro", "Marrón"));
        animales.add(new Animal("Sara", "Girafa", "Amarilla"));
        animales.add(new Animal("Paco", "Elefante", "Gris"));
        animales.add(new Animal("Pedro", "Mapache", "Balnco y negro"));
        return animales;
    }
}
