package com.REFA.x00157219;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    static Scanner in = new Scanner(System.in);
    private ArrayList<autores> lista_autores;
    private ArrayList<Libros> lista_libros;
    public static void main(String[] args) {

        Main registro = new Main();



        boolean continuar = true ;
        while (continuar){
            System.out.println( "MENU: ");
            System.out.println( "\n\t1: Agregar autores: ");
            System.out.println("\n\t2: Agregar Libros: ");
            System.out.println("\n\t3: Mostrar datos: ");
            System.out.println("\n\t4: Salir: ");
            int opcion = in.nextInt(); in.nextLine();

            switch (opcion){
                case 1: agregarAutores(registro);
                break;
                case 2: agregarLibros(registro);
                    break;

                case 3:
                    System.out.println(registro);

                    break;

                case 4: continuar = false;
                break;
            }
        }


    }

    private static void agregarAutores(Main registro) {
        System.out.println("Nombre del autor: ");
        String nombre = in.nextLine();

        System.out.println("Email: ");
        String email = in.nextLine();

        System.out.println("Genero: ");
        String genero = in.nextLine();


    }

    private static void agregarLibros(Main registro){
        System.out.println("Titulo: ");
        String nombre = in.nextLine();

        System.out.println("ISBN: ");
        String ISBN = in.nextLine();

        System.out.println(" paginas: ");
        int paginas = in.nextInt(); in.nextLine();



    }



}