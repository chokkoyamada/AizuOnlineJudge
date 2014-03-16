package com.kirishikistudios.aoj.computation.circle;

import java.util.Scanner;

/**
 * Created by yamadanaoyuki on 2014/03/16.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        System.out.println(String.format("%f %f", r * r * Math.PI, r * 2 * Math.PI));
    }
}
