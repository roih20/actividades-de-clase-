package com.REFA.x00157219;

import java.util.Random;

public class GeneradorISBN {
    private static int contador;

    public static int nuevoISBN(int n){
        return contador= (int) (Math.random()* 1000000000) + 1;

    }
}