package modull_11.Homework_11.Task3;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import static modull_11.Homework_11.Task1.Task1.read;
import static modull_11.Homework_11.Task1.Task1.replacer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aleksey on 24.01.2017.
 * Создать метод, который заменяет слова в файле (File), и вывести результат в существующий контент файла.
 * <p>
 * <p>
 * File fileContentMerger(Map<String, String> map)
 */
public class Task3 {
    public static void main(String[] args) {
        String path = "/Study/Java/JavaCource5/src/modull_11/Homework_11/Task3/Test";
        Map<String, String> map = new HashMap<>();
        map.put("Hello", "Aleksey");
        File file = new File(path);
    }

    public static File fileContentNerger(String path, Map<String, String> map) throws IOException {
        File file = null;
        FileWriter writer = null;
        BufferedWriter br = null;
        String replace = replacer(path, map);

        try {
            br = new BufferedWriter(new FileWriter(path, true));
            br.append(replace);
            file = new File(path);
        } catch (IOException e) {
            System.out.println("IOException catch ");
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Catch some IOException");
            }
        }
        return file;
    }
}
