package modull_11.Homework_11.Task1;

import java.io.*;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aleksey on 23.01.2017.
 */
public class MainVersion3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Aleksey", "Girya");
        //    String path = "/Study/Java/Test.rtf";

    }

    public static String replacer(Map<String, String> map) throws IOException {
        String key = null;
        String value = null;
        for (Map.Entry<String, String> someMap : map.entrySet()) {
            key = someMap.getKey();
            value = someMap.getValue();
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Study/Java/Test.txt"));
        bw.write(value);
        bw.close();

        BufferedReader br;
        FileReader fr = new FileReader("/Study/Java/Test.txt");
        br = new BufferedReader(fr);
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        br.close();
        return line;
    }

}
