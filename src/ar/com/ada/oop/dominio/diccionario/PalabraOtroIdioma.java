package src.ar.com.ada.oop.dominio.diccionario;

public class PalabraOtroIdioma extends Palabra{
    private String pronunciacion;

    public PalabraOtroIdioma(String palabra, String significado, String idioma, String pronunciacion) {
        super(palabra, significado, idioma);
        this.pronunciacion = pronunciacion;
    }

    public String getPronunciacion() {
        return pronunciacion;
    }

    }

