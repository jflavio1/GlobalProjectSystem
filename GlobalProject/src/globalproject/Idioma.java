package globalproject;

import java.io.IOException;
import java.util.Properties;

public class Idioma extends Properties{

    private static final long serialVersionUID = 1L;

    public Idioma(String idioma){

        //Modificar si quieres añadir mas idiomas
        //Cambia el nombre de los ficheros o añade los necesarios
        switch(idioma){
            case "Español":
                    getProperties("strings_es.properties");
                    break;
            case "Inglés":
                    getProperties("strings_en.properties");
                    break;
            default:
                    getProperties("strings_es.properties");
        }

    }

    private void getProperties(String idioma) {
        try {
            this.load( getClass().getResourceAsStream(idioma) );
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}