package modul_2;

import java.nio.channels.Pipe;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Aleksey on 01.11.2016.
 *
 *Домашнее задание №2.1
 Grade: Rubric icon. Opens a dialog.25/100Click to launch rubrics popup.
 View Grade Information. Opens a dialogue
 Input: array with size = 10 can be of one of two data types: int and double. Calculate:

 sum
 min/max
 max positive
 multiplication
 modulus of first and last element
 second largest element

 As a result you should have methods with following names :

 sum(int array[]), sum(double[])
 min(int array[]), min(double[])
 max(int array[]), max(double[])
 maxPositive(int array[]), maxPositive(double array[]),
 multiplication  (int array[]), multiplication (double[])
 modulus(int array[]), modulus(double[])
 secondLargest(int array[]), secondLargest(double[])
 *
 *
*
*/
        public class Homework_2_1 {
    public static void main(String[] args) {
        int[] array1 = new int[]{10, 15, 17, -7, 1, 25, 19, -14, 11, -37};
        double[] array2 = new double[]{0.5, 1.3, 7, -0.5, 20.5, 13, -11.5, 17, -9, 8};
        System.out.println("the sum of an array of numbers int = " + sum(array1));
        System.out.println("the sum of an array of numbers double = " + sum(array2));
        System.out.println("the minimum number of array int = " + min(array1));
        System.out.println("the maximum number of array int = " + max(array1));
        System.out.println("the minimum number of array double = " + min(array2));
        System.out.println("the maximum number of array double = " + max(array2));
        System.out.println("the multiplication number of array int = " + multiplication(array1));
        System.out.println("the multiplication number of array double = " + multiplication(array2));
        System.out.println("the modulus number of array int = " + modulus(array1));
        System.out.println("the modulus number of array double = " + modulus(array2));
        System.out.println("the secondLargest number of array int = " + secondLargest(array1));
        System.out.println("the secondLargest number of array double = " + secondLargest(array2));
        System.out.println("the max positive number of array int = " + maxPositive(array1));
        System.out.println("the max positive number of array double = " + maxPositive(array2));
    }


    static int sum(int array1[]) {
        int sum1 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
        }
        return sum1;
    }

    static double sum(double array2[]) {
        double sum2 = 0;
        for (int i = 0; i < array2.length; i++)
            sum2 += array2[i];
        return sum2;
    }

    static int min(int array1[]) {
        int min1 = array1[0];
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] < min1)
                min1 = array1[i];
        }
        return (min1);
    }

    static int max(int array1[]) {
        int max1 = array1[0];
        for (int j = 1; j < array1.length; j++) {
            if (array1[j] > max1) max1 = array1[j];
        }
        return (max1);
    }

    static double min(double array2[]) {
        double min2 = array2[0];
        for (int i = 1; i < array2.length; i++) {
            if (array2[i] < min2)
                min2 = array2[i];
        }
        return (min2);
    }

    static double max(double array2[]) {
        double max2 = array2[0];
        for (int i = 1; i < array2.length; i++) {
            if (array2[i] > max2)
                max2 = array2[i];
        }
        return (max2);
    }

    static int multiplication(int array1[]) {
        int mult = array1[0];
        for (int i = 1; i < array1.length; i++) {
            mult = mult * i;
        }
        return mult;
    }

    static double multiplication(double array2[]) {
        double mult2 = array2[0];
        for (double i = 1; i < array2.length; i++) {
            mult2 = mult2 * i;
        }
        return mult2;
    }

    static int modulus(int array1[]) {
        int modul1 = array1[0];
        modul1 = modul1 % array1[9];
        return modul1;
    }

    static double modulus(double array2[]) {
        double modul2 = array2[0];
        modul2 = modul2 % array2[9];
        return modul2;
    }

    static int secondLargest(int array1[]) {

        for(int i = array1.length-1 ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (array1[j] > array1[j + 1]) {
                    int temp = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = temp;}
            }
        }
        return array1[8];
    }

    static double secondLargest(double array2[]) {
       for (int i = array2.length - 1; i > 0; i--){
           for (int j = 0; j < i; j++){
               if (array2[j] > array2[j + 1]){
                   double temp = array2[j];
                   array2[j] = array2[j + 1];
                   array2[j + 1] = temp;
               }
           }
       }
        return array2[8];
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

        static double maxPositive (double array2[]){
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
