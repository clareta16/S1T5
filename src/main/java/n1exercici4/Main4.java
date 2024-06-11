package n1exercici4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import static n1exercici4.DirectoryTreeModified.buscarDinsDirectori;
import static n1exercici4.DirectoryTreeModified.llegirFitxerTxt;


public class Main4 {

    public static void main(String[] args) {
        File ruta = new File("/Users/clara/IdeaProjects/S1T5/Directoris");
        File rutaFinal= new File("/Users/clara/IdeaProjects/S1T5/Directoris/resultats.txt");

        try (PrintWriter writer = new PrintWriter(new FileWriter(rutaFinal))) {
          //  PrintWriter per escriure text en un fitxer
            // FileWriter per crear un printwriter que escrigui el fitxer concret

            buscarDinsDirectori(ruta, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        File fitxerTxt = new File("/Users/clara/IdeaProjects/S1T5/Directoris/resultats.txt");
        llegirFitxerTxt(fitxerTxt);
    }
}
