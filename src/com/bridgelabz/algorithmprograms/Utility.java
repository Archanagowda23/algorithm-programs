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

    public static int scanInt()
    {
        try {
            return scan.nextInt();
        }catch(Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public static int inputInteger()
    {
        try {
            return scan.nextInt();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public static String ScanString() {
        try {
            return scan.nextLine();
        }catch(Exception e) {
            System.out.println();
        }
        return null;
    }

}
