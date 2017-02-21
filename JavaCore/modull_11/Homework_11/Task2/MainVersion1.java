package JavaCore.modull_11.Homework_11.Task2;

import JavaCore.modull_11.Homework_11.Task1.Task1;

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
    public static void main(String[] args) throws IOException {
        String path = "/Study/Java/JavaCource5/src/JavaCore.modull_11/Homework_11/Task2/JavaCore.Test";
        Map<String, String> map = new HashMap<>();
        map.put("Alex", "Girya");

        File file;
        file = fileContentReplacer(path, map);
        Task1.read(file.getPath());
    }

    public static File fileContentReplacer(String path, Map<String, String> map) throws IOException {
        File file = null;

        try {
            file = new File(path);
            String readFileString;
            readFileString = Task1.read(path);
            Task1.replacer(path, map);
            System.out.println("Read from file " + readFileString);

            Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
            writer.write(Task1.replacer(path, map));

        } catch (IOException e) {
            System.out.println("Some exception write file!");
        }

        return file;
    }
}
