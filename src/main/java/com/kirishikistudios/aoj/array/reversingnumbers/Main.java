package com.kirishikistudios.aoj.array.reversingnumbers;

import java.util.Scanner;

/**
 * Created by yamadanaoyuki on 2014/03/16.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.useDelimiter("\\s");
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }
        for(int j = (n - 1); j >= 0; j--){
            System.out.print(a[j]);
            if(j != 0){
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}
