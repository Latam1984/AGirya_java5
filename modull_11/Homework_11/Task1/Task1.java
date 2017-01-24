package modull_11.Homework_11.Task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aleksey on 24.01.2017.
 * Создать метод, который заменяет слова в файле (File) и возвращает строку (String) с заменёнными значениями.
 * String replacer(Map map)
 */
public class Task1 {
    public static void main(String[] args) throws IOException {
        String path = "/Study/Java/JavaCource5/src/modull_11/Homework_11/Task1/Test";
        Map<String, String> map = new HashMap<>();
        map.put("Alex", "Girya");
        System.out.println(read(path));
        String replaceString;
        replaceString = replacer(path, map);
        System.out.println("Replace string " + replaceString);
    }

    public static String read(String path) throws IOException {
        FileReader reader;
        BufferedReader br;
        StringBuilder sb;

        try {
            reader = new FileReader(path);
            br = new BufferedReader(reader);
        } catch (IOException e) {
            System.out.println("File not found exception!");
            return null;
        }

        try {
            sb = new StringBuilder();
            String readFileLine = br.readLine();
            while (readFileLine != null) {
                sb.append(readFileLine);
                sb.append(System.lineSeparator());
                readFileLine = br.readLine();
            }
        } catch (IOException e) {
            System.err.format("IOException read file", e);
            return null;
        } finally {
            try {
                if (br != null)
                    br.close();

                if (reader != null)
                    reader.close();

            } catch (IOException e) {
                System.out.println("IOExceptiom close");
            }
        }
        return sb.toString();
    }

    public static String replacer(String path, Map<String, String> map) throws IOException {
        String readFileString;
        readFileString = read(path);
        if (readFileString != null) {
            System.out.println("Read file " + path);
        }
        for (Map.Entry<String, String> someMap : map.entrySet()) {
            try {
                readFileString = readFileString.replaceAll(someMap.getKey(), someMap.getValue());
            } catch (NullPointerException e) {
                System.out.println("Null pointer Exception catch!");
            }
        }
        return readFileString;
    }
}

