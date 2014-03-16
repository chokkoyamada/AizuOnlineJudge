package com.kirishikistudios.aoj.array.findingmissingcards;

import java.util.Scanner;

/**
 * Created by yamadanaoyuki on 2014/03/16.
 */
public class Main {
    public static void main(String[] args){
        int[][][] array = new int[4][3][10];
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.useDelimiter("\\s");
        for(int i = 0; i < n; i++){
            int tou = scanner.nextInt();
            int kai = scanner.nextInt();
            int ban = scanner.nextInt();
            int kazu = scanner.nextInt();
            array[tou-1][kai-1][ban-1] = array[tou-1][kai-1][ban-1] + kazu;
        }
        for(int a = 0; a < 4; a++){
            for(int b = 0; b < 3; b ++){
                for(int c = 0; c < 10; c++){
                    System.out.print(" " + array[a][b][c]);
                }
                System.out.println("");
            }
            if(a != 3){
                System.out.println("####################");
            }
        }
    }
}
