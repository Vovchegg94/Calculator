package Installation;

public class Main {
    public static void main(String[] args) {
        Games.createNewDirectory("C://Users/79056/Desktop/Games","src");
        Games.createNewDirectory("C://Users/79056/Desktop/Games","res");
        Games.createNewDirectory("C://Users/79056/Desktop/Games","savegames");
        Games.createNewDirectory("C://Users/79056/Desktop/Games","temp");
        Games.createNewDirectory("C://Users/79056/Desktop/Games/src","main");
        Games.createNewDirectory("C://Users/79056/Desktop/Games/src","test");
        Games.createNewFile("C://Users/79056/Desktop/Games/src","Main.java");
        Games.createNewFile("C://Users/79056/Desktop/Games/src","Utils.java");
        Games.createNewDirectory("C://Users/79056/Desktop/Games/res","drawables");
        Games.createNewDirectory("C://Users/79056/Desktop/Games/res","vectors");
        Games.createNewDirectory("C://Users/79056/Desktop/Games/res","icons");
        Games.logCreate("C://Users/79056/Desktop/Games/temp","temp.txt");

    }
}

