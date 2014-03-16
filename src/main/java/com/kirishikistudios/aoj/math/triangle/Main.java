package com.kirishikistudios.aoj.math.triangle;

import java.util.Scanner;

/**
 * @author yamadanaoyuki
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double s;
        double l;
        double h;
        s = 0.5 * a * b * Math.sin(Math.toRadians(c));
        l = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(c)));
        h = b * Math.sin(Math.toRadians(c));
        System.out.println(s);
        System.out.println(l);
        System.out.println(h);
    }
}
