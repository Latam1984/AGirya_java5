package modull_11.Homework_11.Task2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by Aleksey on 22.01.2017.
 * <p>
 * Создать метод, который заменяет слова в файле (File) и переписать его содержание с новыми значениями.
 * <p>
 * File fileContentReplacer(Map map)
 */
public class MainVersion1 {
    public static void main(String[] args) throws IOException{
        String path = "/Study/Java/Test.rtf";
        Map<String, String> map = new HashMap<>();
        map.put("Alex", "Girya");

        File file;
        file = fileContentReplacer(path, map);
    }

    public static File fileContentReplacer(String path, Map<String, String> map) throws IOException {
        File file = null;

        try {
            Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
            writer.write(String.valueOf(map));
            writer.write("something");
           file = new File(path);
        } catch (IOException e) {
            System.out.println("Some exception write file!");
        }

        return file;
    }
}
