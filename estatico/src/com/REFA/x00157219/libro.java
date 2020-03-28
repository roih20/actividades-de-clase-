package com.REFA.x00157219;

import java.lang.String;

public class libro {

    private static int ISBN;
    private static String nombre;
    private static int paginas;

    public libro(String pNombre, int pPaginas ){
        nombre = pNombre;
        paginas= pPaginas;

    }

    public static int getISBN() {
        return GeneradorISBN.nuevoISBN(1);
    }

    public static String getNombre() {
        return nombre = "POO";
    }

    public static int getPaginas() {
        return paginas = (int) (Math.random()* 300) +1 ;
    }



}


