package modul_7.Homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by Aleksey on 17.12.2016.
 */
public class OperationTime {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new LinkedList<>();

        Long startOperation;
        Long endOperation;


//=============ADD 1000/10000 OPERATIONS===================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i <= 1000; i++) {
            list1.add(i);
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation add 1000 ArrayList Integer " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i <= 1000; i++) {
            list2.add(i);
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation add 1000 LinkedList Integer " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i <= 1000; i++) {
            list3.add("Some string");
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation add 1000 ArrayList String  " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i <= 1000; i++) {
            list4.add("Some string");
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation add 1000 LinkedList String " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i <= 10000; i++) {
            list1.add(i);
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation add 10000 ArrayList Integer " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i <= 10000; i++) {
            list2.add(i);
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation add 10000 LinkedList Integer " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i <= 10000; i++) {
            list3.add("Some string");
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation add 10000 ArrayList String  " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i <= 10000; i++) {
            list4.add("Some string");
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation add 10000 LinkedList String " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));


//============SET OPERATION 1000/10000=====================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i <= 1000; i++) {
            list1.set(i,i);
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation set 1000 ArrayList Integer " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i <= 1000; i++) {
            list2.set(i,i);
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation set 1000 LinkedList Integer " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i <= 1000; i++) {
            list3.set(i, "Some string");
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation set 1000 ArrayList String  " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i <= 1000; i++) {
            list4.set(i, "Some string");
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation set 1000 LinkedList String " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i <= 10000; i++) {
            list1.set(i,i);
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation set 10000 ArrayList Integer " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i <= 10000; i++) {
            list2.set(i,i);
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation set 10000 LinkedList Integer " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i <= 10000; i++) {
            list3.set(i, "Some string");
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation set 10000 ArrayList String  " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i <= 10000; i++) {
            list4.set(i, "Some string");
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation set 10000 LinkedList String " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));


//==============GET OPERATIONS 1000/10000===============================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i <= 1000; i++) {
            list1.get(i);
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation get 1000 ArrayList Integer " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i <= 1000; i++) {
            list2.get(i);
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation get 1000 LinkedList Integer " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i <= 1000; i++) {
            list3.get(i);
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation get 1000 ArrayList String  " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i <= 1000; i++) {
            list4.get(i);
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation set 1000 LinkedList String " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i <= 10000; i++) {
            list1.get(i);
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation get 10000 ArrayList Integer " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i <= 10000; i++) {
            list2.get(i);
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation get 10000 LinkedList Integer " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i <= 10000; i++) {
            list3.get(i);
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation get 10000 ArrayList String  " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i <= 10000; i++) {
            list4.get(i);
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation set 10000 LinkedList String " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));


//==========REMOVE OPERATIONS 1000/10000===================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list1.remove(i);
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation remove 1000 ArrayList Integer " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list2.remove(i);
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation remove 1000 LinkedList Integer " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list3.remove(i);
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation remove 1000 ArrayList String  " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list4.remove(i);
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation remove 1000 LinkedList String " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i < list1.size(); i++) {
            list1.remove(i);
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation remove 10000 ArrayList Integer " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i < list2.size(); i++) {
            list2.remove(i);
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation remove 10000 LinkedList Integer " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i < list2.size(); i++) {
            list3.remove(i);
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation remove 10000 ArrayList String  " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================
        startOperation = System.currentTimeMillis();
        for (int i = 0; i < list4.size(); i++) {
            list4.remove(i);
        }
        endOperation = System.currentTimeMillis();
        System.out.println("Operation remove 10000 LinkedList String " + "start: " + startOperation + " end: " + endOperation + " elapsed time: " + (endOperation - startOperation));
//=========================================================


    }
}
