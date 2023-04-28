package Saving;

public class Main {
    public static void main(String[] args) {

        GameProgress gameProgress1 = new GameProgress(100, 10, 15, 20.4);
        GameProgress gameProgress2 = new GameProgress(200, 20, 30, 40.8);
        GameProgress gameProgress3 = new GameProgress(300, 30, 45, 61.2);
        GameProgress.saveGame("C://Users/79056/Desktop/Games/savegames/save1.dat", gameProgress1);
        GameProgress.saveGame("C://Users/79056/Desktop/Games/savegames/save2.dat", gameProgress2);
        GameProgress.saveGame("C://Users/79056/Desktop/Games/savegames/save3.dat", gameProgress3);
        String[] saves = {"C://Users/79056/Desktop/Games/savegames/save1.dat",
                "C://Users/79056/Desktop/Games/savegames/save2.dat",
                "C://Users/79056/Desktop/Games/savegames/save3.dat"};
        GameProgress.zipFiles("C://Users/79056/Desktop/Games/savegames/zip.zip", saves);
        GameProgress.deleteFile("C://Users/79056/Desktop/Games/savegames/save1.dat");
        GameProgress.deleteFile("C://Users/79056/Desktop/Games/savegames/save2.dat");
        GameProgress.deleteFile("C://Users/79056/Desktop/Games/savegames/save3.dat");
    }
}