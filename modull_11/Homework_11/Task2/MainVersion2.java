package modull_11.Homework_11.Task2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aleksey on 23.01.2017.
 *  * Создать метод, который заменяет слова в файле (File) и переписать его содержание с новыми значениями.
 * <p>
 * File fileContentReplacer(Map map)
 */
public class MainVersion2 {
    public static void main(String[] args) {

        Map <String, String> map = new HashMap<>();
        map.put("Aleks", "Girya");

    }
public static File fileContentReplacer (Map <String, String> map) throws IOException {
    String path = "/Study/Java/Test.rtf";
    File file = new File(path);
    String value = null;
    for (Map.Entry <String, String> someMap : map.entrySet()){
        value = someMap.getValue();
    }
    BufferedWriter bw = new BufferedWriter(new FileWriter(path));
    bw.write(value);
    return file;
}
}
