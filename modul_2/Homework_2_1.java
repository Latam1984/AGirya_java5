package modul_2;

import java.nio.channels.Pipe;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Aleksey on 01.11.2016.
 */
        public class Homework_2_1 {
    public static void main(String[] args) {
        int[] array1 = new int[]{10, 15, 17, -7, 1, 25, 19, -14, 11, -37};
        double[] array2 = new double[]{0.5, 1.3, 7, -0.5, 20.5, 13, -11.5, 17, -9, 8};
        System.out.println("the sum of an array of numbers int = " + sum_array1(array1));
        System.out.println("the sum of an array of numbers double = " + sum_array2(array2));
        System.out.println("the minimum number of array int = " + min1(array1));
        System.out.println("the maximum number of array int = " + max1(array1));
        System.out.println("the minimum number of array double = " + min2(array2));
        System.out.println("the maximum number of array double = " + max2(array2));
        System.out.println("the multiplication number of array int = " + mult(array1));
        System.out.println("the multiplication number of array double = " + mult2(array2));
        System.out.println("the modulus number of array int = " + modul(array1));
        System.out.println("the modulus number of array double = " + modul2(array2));
        System.out.println("the secondLargest number of array int = " + sLarg(array1));
        System.out.println("the secondLargest number of array double = " + sLarg2(array2));
        System.out.println("the max positive number of array int = " + maxPositive(array1));
        System.out.println("the max positive number of array int = " + maxPositive2(array2));
    }


    static int sum_array1(int array1[]) {
        int sum1 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
        }
        return sum1;
    }

    static double sum_array2(double array2[]) {
        double sum2 = 0;
        for (int i = 0; i < array2.length; i++)
            sum2 += array2[i];
        return sum2;
    }

    static int min1(int array1[]) {
        int min1 = array1[0];
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] < min1)
                min1 = array1[i];
        }
        return (min1);
    }

    static int max1(int array1[]) {
        int max1 = array1[0];
        for (int j = 1; j < array1.length; j++) {
            if (array1[j] > max1) max1 = array1[j];
        }
        return (max1);
    }

    static double min2(double array2[]) {
        double min2 = array2[0];
        for (int i = 1; i < array2.length; i++) {
            if (array2[i] < min2)
                min2 = array2[i];
        }
        return (min2);
    }

    static double max2(double array2[]) {
        double max2 = array2[0];
        for (int i = 1; i < array2.length; i++) {
            if (array2[i] > max2)
                max2 = array2[i];
        }
        return (max2);
    }

    static int mult(int array1[]) {
        int mult = array1[0];
        for (int i = 1; i < array1.length; i++) {
            mult = mult * i;
        }
        return mult;
    }

    static double mult2(double array2[]) {
        double mult2 = array2[0];
        for (double i = 1; i < array2.length; i++) {
            mult2 = mult2 * i;
        }
        return mult2;
    }

    static int modul(int array1[]) {
        int modul1 = array1[0];
        for (int i = 1; i < array1.length; i++) {
            modul1 = modul1 % i;
        }
        return modul1;
    }

    static double modul2(double array2[]) {
        double modul2 = array2[0];
        for (double i = 1; i < array2.length; i++) {
            modul2 = modul2 % i;
        }
        return modul2;
    }

    static int sLarg(int array1[]) {
        Arrays.sort(array1);
        int slarg1 = array1[9];
        int slarg2 = array1[8];
        return slarg2;
    }

    static double sLarg2(double array2[]) {
        Arrays.sort(array2);
        double slarg1 = array2[9];
        double slarg2 = array2[8];
        return slarg2;
    }

    static int maxPositive(int array1[]) {
        Arrays.sort(array1);
        int max = array1[9];
        for (int i = 0; i < array1.length; i++) {
            if (i < 0) {
                System.out.println("array don't have positive numbers");
            }
        }
            return max;
        }

        static double maxPositive2 (double array2[]){
            Arrays.sort(array2);
            double max2 = array2[9];
            for(double i = 0; i < array2.length; i++){
                if (i < 0){
                    System.out.println("array don't have positive numbers");
                }
            }
            return max2;
        }

    }
