package src.ar.com.ada.oop.dominio.diccionario;

import java.util.HashSet;
import java.util.List;

public class Diccionario {
     private List<Palabra> palabras;
     private String idioma;

    public Diccionario(List<Palabra> palabras, String idioma) {
        this.palabras = palabras;
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void registrarPalabra(Palabra palabra){
        palabras.add(new Palabra());
    }
    public void buscarPalabra(String palabra){

    }
    public void removerPalabra(String palabra){

    }
    public void imprimirPalabra(String palabra){

    }


}
