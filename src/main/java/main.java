/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Judah Libera
 */
import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter the price of item 1: ");
        String as = sc.nextLine();
        double a = Double.parseDouble(as);
        System.out.printf("Enter the quantity of item 1: ");
        String bs = sc.nextLine();
        double b = Double.parseDouble(bs);
        System.out.printf("Enter the price of item 2: ");
        String cs = sc.nextLine();
        double c = Double.parseDouble(cs);
        System.out.printf("Enter the quantity of item 2: ");
        String ds = sc.nextLine();
        double d = Double.parseDouble(ds);
        System.out.printf("Enter the price of item 3: ");
        String es = sc.nextLine();
        double e = Double.parseDouble(es);
        System.out.printf("Enter the quantity of item 3: ");
        String fs = sc.nextLine();
        double f = Double.parseDouble(fs);
        double s = a*b + c*d + e*f;
        double t = s*.055;
        double to = t + s;
        System.out.printf("Subtotal: $%.2f\n" +
                "Tax: $%.2f\n" +
                "Total: $%.2f", s, t, to);
    }
}