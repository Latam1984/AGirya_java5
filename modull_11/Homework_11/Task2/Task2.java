package modull_11.Homework_11.Task2;

import static modull_11.Homework_11.Task1.Task1.read;
import static modull_11.Homework_11.Task1.Task1.replacer;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aleksey on 25.01.2017.
 * Создать метод, который заменяет слова в файле (File) и переписать его содержание с новыми значениями.
 * File fileContentReplacer(Map map)
 */

public class Task2 {
    public static void main(String[] args) throws IOException {
        String path = "/Study/Java/JavaCource5/src/modull_11/Homework_11/Task2/Test";
        Map<String, String> map = new HashMap<String, String>();
        map.put("Girya", "Aleksey");
        File file;
        file = fileContentReplacer(path, map);
    }

    public static File fileContentReplacer(String path, Map<String, String> map) throws IOException {
        BufferedWriter br = null;
        FileWriter writer = null;
        StringBuilder sb = null;
        File file;

        try {
            String replace = replacer(path,map);
            br = new BufferedWriter(new FileWriter(new File(path)));
            br.write(replace);
        } catch (IOException e) {
            System.out.println("IOE Exception catch - open file!");
        } finally {
            try {
                if (br != null)
                    br.close();
                if (writer != null)
                    writer.close();
            }catch (IOException e){
                System.out.println("Close IOException!");
            }
        }
        return null;
    }
}
