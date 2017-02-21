package JavaCore.modul_6.Homework_6;

import java.util.Arrays;

/**
 * Created by Aleksey on 02.12.2016.
 */
public final class ArraysUtils {

    static public int sum(int array1[]) {
        int sum1 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
        }
        return sum1;
    }


    static public int min(int array1[]) {
        int min1 = array1[0];
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] < min1)
                min1 = array1[i];
        }
        return (min1);
    }

    static public int max(int array1[]) {
        int max1 = array1[0];
        for (int j = 1; j < array1.length; j++) {
            if (array1[j] > max1) max1 = array1[j];
        }
        return (max1);
    }


    static public int multiplication(int array1[]) {
        int mult = array1[0];
        for (int i = 1; i < array1.length; i++) {
            mult = mult * i;
        }
        return mult;
    }


    public static int modulus(int array1[]) {
        int modul1 = array1[0];
        modul1 = modul1 % array1[array1.length - 1];
        return modul1;
    }


    public static int secondLargest(int array1[]) {

        for (int i = array1.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array1[j] > array1[j + 1]) {
                    int temp = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = temp;
                }
            }
        }
        return array1[7];
    }


    public static int maxPositive(int array1[]) {
        Arrays.sort(array1);
        int max = array1[array1.length - 1];
        for (int i = 0; i < array1.length; i++) {
            if (i < 0) {
                System.out.println("array don't have positive numbers");
            }
        }
        return max;
    }

    //реверс массива
    public static int[] reverse(int[] array1) {
        int tempArray[] = new int[array1.length];
        int temp = 0;
        for (int i = array1.length - 1; i > 0; i--) {
            tempArray[temp] = array1[i];
            temp++;
        }
        return tempArray;
    }

    // массив четных чисел HW2
    public static int[] findEvenElements(int[] array1) {
        int count = 0;
        for (int i = 0; i <array1.length ; i++) {
            if (array1[i] % 2 == 0){
                count++;
            }
        }

        int tempArray[] = new int[count];
        int temp = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0){
              tempArray[temp] = array1[i];
                temp++;}

        }
        return tempArray;
    }
}
