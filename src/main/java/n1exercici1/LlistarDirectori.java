package n1exercici1;

import java.io.File;
import java.nio.file.Paths;
import java.util.Arrays;

public class LlistarDirectori {

    String rutaDirectori = Paths.get("Directoris", "Directori1").toString();
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
