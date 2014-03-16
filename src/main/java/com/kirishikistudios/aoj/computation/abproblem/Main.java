package com.kirishikistudios.aoj.computation.abproblem;

import java.util.Scanner;

/**
 * Created by yamadanaoyuki on 2014/03/16.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\s");
        int j = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(String.format("%d %d %f", j / k, j % k, (double)j / (double)k));
    }
}
