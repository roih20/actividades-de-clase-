package com.REFA.x00157219;
import java.util.ArrayList;
public class Libros {
    //atributos

    private String ISBN ;
    private String nombre;
    private int paginas;
    private ArrayList<Libros> lista_libros;

    // metodos

    public Libros ( String Pnombre,String pISBN, int Ppaginas){

        nombre = Pnombre;
        ISBN = pISBN ;
        paginas= Ppaginas ;
        lista_libros = new ArrayList<>();
    }
    public String getISBN(){
        return ISBN;
    }

    public String getNombre(){
        return nombre;
    }

    public int getPaginas(){
        return (int) (paginas);
    }

    public void agregarLibros(Libros unLibro) {
        lista_libros.add(unLibro);
    }
    @Override
    public String toString() {
        return "Libros{" +
                "ISBN='" + ISBN + '\'' +
                ", nombre='" + nombre + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
