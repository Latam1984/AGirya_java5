package modul_6.Off;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by Aleksey on 05.12.2016.
 */
public class Task1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 20;
        System.out.println(Arrays.toString(generateRandom1(a,b)));

    }

    static public int[] generateRandom1 (int a, int b) {
        int array [] = new int[b];
        for (int i = 0; i < b ; i++) {
            array[i] = (int) (Math.random() * (b - a) + a);
        }
        return array;
}
}
