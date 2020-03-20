package com.REFA.x00157219;
import java.util.Scanner ;
public class laptop {

    private String marca;
    public void encender(){
        System.out.println("laptop"  + marca + " encendiendo" );
        System.out.println("El dispositivo  se ha encendido");
    }
    public void IniciarSesion(){
        System.out.println("Bienvenido: Rodrigo");
        System.out.println("Se ha iniciado sesion correctamente");
    }
    public void CerrarSesion(){
        System.out.println("Cerrando sesion");
    }
    public void apagar(){
        System.out.println("El dispositivo se esta apagando");
        System.out.println( "El dispositivo se ha apagado");
    }
    public laptop(String pMarca){
        marca = pMarca ;
    }
    public String getMarca(){
        return marca ;
    }

    public void setMarca (String pMarca){
        marca = pMarca;
    }



    }


