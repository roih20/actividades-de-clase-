package com.REFA.x00157219;
import java.util.ArrayList;
import java.util.Scanner;

public class autores {
//atributos
    private String nombre;
    private String email;
    private String genero;
    private ArrayList<autores> lista_autores;
    static Scanner in = new Scanner(System.in);
//metodos
    public autores (String pNombre, String pEmail, String pGenero){
        nombre = pNombre;
        email = pEmail;
        genero = pGenero;
        lista_autores = new ArrayList<autores>();
    }
    public String getNombre(){
        return  nombre;
    }
  public void setEmail (String email){
        this.email = email;
  }

  public String getGenero(){
        return genero;
  }

    @Override
    public String toString() {
        return "autores{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", genero=" + genero +
                '}';
    }
    public void agregarAutores(autores unAutor){
        lista_autores.add(unAutor);
    }

}
