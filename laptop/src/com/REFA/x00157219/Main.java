package com.REFA.x00157219;

public class Main {
    public static void main (String [] args){
        laptop laptop = new laptop("Toshiba");
        laptop.encender();
        laptop.IniciarSesion();
        laptop.CerrarSesion();
        laptop.apagar();

        laptop.setMarca("Toshiba");

        System.out.println( "Marca: " + laptop.getMarca());
    }
}
