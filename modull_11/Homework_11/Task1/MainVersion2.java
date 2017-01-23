package modull_11.Homework_11.Task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aleksey on 23.01.2017.
 * * Создать метод, который заменяет слова в файле (File) и возвращает строку (String) с заменёнными значениями.
 * <p>
 * String replacer(Map map)
 */
public class MainVersion2 {
    public static void main(String[] args) throws IOException {

        String path = "/Study/Java/Test.rtf";
        Map<String, String> map = new HashMap<>();
        map.put("Aleksey", "Girya");

        replacer(path, map);
    }

    public static String replacer(String path, Map<String, String> map) throws IOException {
        FileReader reader = new FileReader(path);

        BufferedReader buff = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        String line = buff.readLine();
        while (line != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
        }
        line = sb.toString();

        for (Map.Entry<String, String> someMap : map.entrySet()) {
            line = line.replaceAll(someMap.getKey(), someMap.getValue());
        }
        return line;

    }
}
