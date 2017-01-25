package modull_11.Homework_11.Task4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Aleksey on 25.01.2017.
 * Проверить, содержит ли файл конкретное слово. Вывести 0, если нет. Вывести номер n, который эквивалентен числу появлений этого слова в файле.
 * int checkWord(String word)
 * Написать это задание с обычным try и try-with-resources(две версии
 */
public class Task4 {
    public static void main(String[] args) throws IOException {
        File file;
        String readString = null;
        String path = "/Study/Java/JavaCource5/src/modull_11/Homework_11/Task4/Test";
        String findWord = "Aleks";


        BufferedReader br = new BufferedReader(new FileReader(new File(path)));

        try {
            readString = br.readLine();
        } catch (IOException e) {
            System.out.println("IOException catch!");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Catch some IOException");
            }
        }
        System.out.println(checkWord(readString,findWord));
    }


    public static int checkWord(String readString, String findWord) {
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        while (sb.lastIndexOf(readString) != -1) {
            int number = sb.lastIndexOf(findWord);
            sb.delete(number, number + findWord.length());
            counter++;
        } return counter;
    }
}
