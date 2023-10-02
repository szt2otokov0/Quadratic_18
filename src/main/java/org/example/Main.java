package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a;
        double b;
        double c;


        do {
            System.out.println("Add meg az első tényezőt (a): ");
            a = scn.nextInt();
        } while (a == 0);
        System.out.println("Add meg az második tényezőt (b): ");
        b = scn.nextInt();
        System.out.println("Add meg az harmadik tényezőt (c): ");
        c = scn.nextInt();

        System.out.println("A kész megoldóképlet: (-" + b + "+-gyök(" + b + "-4*" + a + "+" + c + "))/2*" + a);

        double d = (int) Math.pow(b, 2) - 4 * a * c;
        int sign = (int) Math.signum(d);

        System.out.println("A számolás eredménye:" + sign + "?: " + d);
        if (sign == -1) {
            System.out.println("Ezekből a számokból egy gyököt sem tudok előállítani.");
        } else if (sign == 0) {
            double x = -b / 2 * a;
            System.out.println("Egy gyököt sikerült előállítanom, az eredmény: " + x);
        } else {
            double x1 = (-b + Math.sqrt(d)) / 2 * a;
            double x2 = (-b - Math.sqrt(d)) / 2 * a;
            System.out.println("Van két gyököm: x1 = " + x1 + "; x2 = " + x2);
        }
    }
}