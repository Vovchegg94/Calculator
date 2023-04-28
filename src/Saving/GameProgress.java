package Saving;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class GameProgress implements Serializable {
    private static final long serialVersionUID = 1L;

    private int health;
    private int weapons;
    private int lvl;
    private double distance;

    public GameProgress(int health, int weapons, int lvl, double distance) {
        this.health = health;
        this.weapons = weapons;
        this.lvl = lvl;
        this.distance = distance;
    }

    public static void saveGame(String fullRoute, GameProgress gameProgress) {


        try (FileOutputStream fos = new FileOutputStream(fullRoute);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(gameProgress);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void zipFiles(String fullRoute, String[] gameProgress) {
        try {
            ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(fullRoute));
            for (String fileRoute :
                    gameProgress) {
                FileInputStream fis = new FileInputStream(fileRoute);
                ZipEntry entry = new ZipEntry(fileRoute.substring(fileRoute.lastIndexOf('/') + 1, fileRoute.length()));
                zout.putNextEntry(entry);
                byte[] buffer = new byte[fis.available()];
                fis.read(buffer);
                zout.write(buffer);
                zout.closeEntry();
                fis.close();
            }
            zout.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void deleteFile(String route){
        File file = new File(route);
        if(file.delete()){
            System.out.println("Файл "+route+" удален");
        }else System.out.println("Файла "+route+" не обнаружено");
    }

    @Override
    public String toString() {
        return "GameProgress{" +
                "health=" + health +
                ", weapons=" + weapons +
                ", lvl=" + lvl +
                ", distance=" + distance +
                '}';
    }
}

