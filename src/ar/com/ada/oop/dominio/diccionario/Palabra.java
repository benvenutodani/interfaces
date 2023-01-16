package src.ar.com.ada.oop.dominio.diccionario;

import java.util.Objects;

public class Palabra {
    private String palabra;
    private String significado;
    private String idioma;

    public Palabra(String palabra, String significado, String idioma) {
        this.palabra = palabra;
        this.significado = significado;
        this.idioma= idioma;
    }



    public String getPalabra() {
        return palabra;
    }


    public String getSignificado() {
        return significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }

    @Override
    public String toString() {
        return palabra;
    }
    }


