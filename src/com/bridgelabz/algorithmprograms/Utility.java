package com.bridgelabz.algorithmprograms;

import java.io.PrintWriter;
import java.util.Scanner;

public class Utility<T extends Comparable<? super T>>  {
    // resuable static object for scanner class
    public static Scanner scan = new Scanner(System.in);
    // reusable static Object for PrintWriter class
    public static PrintWriter pw = new PrintWriter(System.out);

    public static boolean isLeap(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
}
