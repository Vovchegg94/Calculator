package Installation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Games {
    static StringBuilder log = new StringBuilder();

    public static void createNewFile(String route, String name) {
        File myFile = new File(route + "/" + name);
// создадим новый файл
        try {
            if (myFile.createNewFile())
                log.append(route).append(" Файл ").append(name).append(" был создан ").append(LocalDateTime.now()).append("\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            log.append(route).append(" Файл ").append(name).append(" не был создан ").append(LocalDateTime.now()).append("\n");
        }

    }

    public static void createNewDirectory(String route, String name) {
        File dir = new File(route + "/" + name);
        if (dir.mkdir()) {
            log.append(route).append(" Каталог ").append(name).append(" был создан ").append(LocalDateTime.now()).append("\n");
        } else {
            log.append(route).append(" Каталог ").append(name).append(" не был создан ").append(LocalDateTime.now()).append("\n");
        }
    }

    public static void logCreate(String route, String name) {
        File myFile = new File(route + "/" + name);
        try {
            if (myFile.createNewFile())
                log.append(route).append(" Файл ").append(name).append(" был создан ").append(LocalDateTime.now()).append("\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            log.append(route).append(" Файл ").append(name).append(" не был создан ").append(LocalDateTime.now()).append("\n");
        }

        try (FileWriter writer = new FileWriter(route + "/" + name, true)) {
            writer.write(log.toString());

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


