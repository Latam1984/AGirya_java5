package JavaCore.modul_8.Maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aleksey on 23.12.2016.
 */
public class CreateMapForTest {
    public static void main(String[] args) {

//question1
       Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("key", "value");
        String res = map.get("key");
        System.out.println(res);
//question2 - ошибка
        Map map1 = new HashMap<>();
        map1.put("key", "value");
        String res1 = map.get("key");
        System.out.println(res1);
//question3 ???
        Map<String, String> map2 = new HashMap<>();
        map2.put("key", "value");
        map2.put("key", "value");
        map2.put("key1", "value");

        System.out.println(map2.size());
    }


}
