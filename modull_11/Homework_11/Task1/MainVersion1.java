package modull_11.Homework_11.Task1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aleksey on 21.01.2017.
 * Создать метод, который заменяет слова в файле (File) и возвращает строку (String) с заменёнными значениями.
 * <p>
 * String replacer(Map map)
 */
public class MainVersion1 {

    public static void main(String[] args) throws IOException, NullPointerException {
        String path = "/Study/Java/Test.txt";
        Map map = new HashMap();
        map.put("Aleksey", "Girya");
        String replaceString;

    }

    public static String replacer(String path, Map<String, String> map) throws IOException, NullPointerException {
        try {
            BufferedReader buff = new BufferedReader(new FileReader(path));
            StringBuilder sb = new StringBuilder();
            String readLine = buff.readLine();

            while (readLine != null) {
                sb.append(readLine);
                sb.append(System.lineSeparator());
            }
            readLine.toString();

            for (Map.Entry<String, String> values : map.entrySet()) {
                try {
                    readLine = readLine.replaceAll(values.getKey(), values.getValue());
                } catch (NullPointerException e) {
                    System.out.println("Null pointer exception catch!");
                }
                return readLine;
            }
            buff.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found exception.");
        }
        return null;
    }
}
