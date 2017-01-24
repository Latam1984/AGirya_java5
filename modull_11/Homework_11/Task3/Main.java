package modull_11.Homework_11.Task3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aleksey on 24.01.2017.
 * Создать метод, который заменяет слова в файле (File), и вывести результат в существующий контент файла.


 File fileContentMerger(Map<String, String> map)
 */
public class Main {
    public static void main(String[] args) {
        String path = "";
        Map<String, String> map = new HashMap<>();
        map.put("Hello", "Aleksey");
        File file = new File(path);
    }

    public static File fileContentNerger (String path, Map<String, String> map) throws IOException{
        FileWriter writer = new FileWriter(path);
        BufferedWriter br = new BufferedWriter(writer);
        StringBuilder sb = new StringBuilder();



return null;
    }
}
