package n1exercici2;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DirectoryTree {

    public static void buscarDinsDirectori(File ruta) {
        if (ruta.isDirectory()) {
            File [] documents = ruta.listFiles();
            if (documents != null) {
                Arrays.sort(documents);
                for (File document : documents) {
                    dataModificacio(document);
                    esDirectoriOArxiu(document);
                    System.out.println(document + " és un " + esDirectoriOArxiu(document)
                            + " modificat per última vegada el " +  dataModificacio(document));

                    buscarDinsDirectori(document);
                }
            } else {
                System.out.println("No hi ha directoris ni fitxers dins la carpeta");
            }
        }
    }

    public static String dataModificacio(File document) {
        long ultimaModificacio = document.lastModified();
        Date dia = new Date(ultimaModificacio);
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dataModificacio = data.format(dia);
        return dataModificacio;
    }

    public static char esDirectoriOArxiu(File document) {
        if(document.isFile()) {
            char arxiu = 'F';
            return arxiu;
        } else {
            char directori = 'D';
            return directori;
        }
    }
}
