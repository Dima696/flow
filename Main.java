import java.io.*;



public class Main {

    public static void main ( String[] args ) {

        StringBuilder str = new StringBuilder("Создана ");


        File file = new File("C:\\Games");
        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("Каталог создан");

            } else {
                System.out.println("Каталог существует");
            }
        }
        str.append(file).append(" -> директория создана \n");

        File d = new File(file, "srs");
        File d1 = new File(file, "res");
        File d2 = new File(file, "savegames");
        File d3 = new File(file, "temp");
        if (d.mkdir() && d1.mkdir() && d2.mkdir() && d3.mkdir()) {
            System.out.println("Создан");
            str.append("успешно создано  ");

        }

        str.append(d).append(" -> директория создана \n");
        str.append(d1).append(" -> директория создана \n");
        str.append(d2).append(" -> директория создана \n");
        str.append(d3).append(" -> директория создана \n");


        File d4 = new File(d, "main");
        if (d4.mkdir()) {
            System.out.println("main директория создана");
        }
        str.append(d4).append(" -> директория создана \n");
        File d5 = new File(d, "test");
        if (d5.mkdir()) {
            System.out.println("test директория создана");
        }
        str.append(d5).append(" -> директория создана \n");

        try {
            File files = new File(d4, "Main.java");
            File files1 = new File(d4, "Utils.java");
            if (files.createNewFile() && files1.createNewFile()) {
                System.out.println("Файл Main.java и Utils.java созданы");
            }

            str.append(files).append(" ->  Файл Main.java создан \n");
            str.append(files1).append(" -> Файл Utils.java создан \n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }



        File d6 = new File(d1, "drawables");
        File d7 = new File(d1, "vectors");
        File d8 = new File(d1, "icons");
        if (d6.mkdir() && d7.mkdir() && d8.mkdir()) {
            System.out.println("Создано директории drawables, vectors ,icons");

        }
        str.append(d6).append(" -> директория создана \n");
        str.append(d7).append(" -> директория создана \n");
        str.append(d8).append(" -> директория создана \n");

        try {
            File files2 = new File(d3, "temp.txt");
            files2.createNewFile();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }




       String text = str.toString();
        try (FileWriter writer = new FileWriter("temp.txt")) {
            writer.write(text);
            writer.append('\n');
            writer.append('!');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
    }
}
