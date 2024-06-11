package n1exercici1;

import java.io.File;
import java.util.Arrays;

public class LlistarDirectori {

    String rutaDirectori = "/Users/clara/IdeaProjects/S1T5/Directoris/Directori1";
    File carpeta = new File(rutaDirectori);

    public void accedirDirectori(File carpeta) {
    if (!carpeta.isDirectory()) {
        System.out.println("Aquest directori no existeix.");
    } else {
        ordenarDirectori(carpeta);
    }
    }

    public void ordenarDirectori(File carpeta) {
        String [] llista = carpeta.list();

        if (llista != null) {
            Arrays.sort(llista);
            for (String element : llista) {
                System.out.println(element);

            }
        }  else {
            System.out.println("No hi ha res dins la carpeta.");
        }


    }
}
