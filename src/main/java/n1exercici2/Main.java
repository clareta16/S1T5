package n1exercici2;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File ruta = new File("/Users/clara/IdeaProjects/S1T5/Directoris");
        DirectoryTree directori = new DirectoryTree();
        directori.buscarDinsDirectori(ruta);

    }
}
