package com.kirishikistudios.aoj.branchoncondition.sortingthreenumbers;

import java.util.Scanner;

/**
 * Created by yamadanaoyuki on 2014/03/16.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\s");
        int[] list = new int[3];
        list[0] = scanner.nextInt();
        list[1] = scanner.nextInt();
        list[2] = scanner.nextInt();
        if(list[0] > list[1]){
            int tmp = list[0];
            list[0] = list[1];
            list[1] = tmp;
        }
        if(list[1] > list[2]){
            int tmp = list[1];
            list[1] = list[2];
            list[2] = tmp;
        }
        if(list[0] > list[1]){
            int tmp = list[0];
            list[0] = list[1];
            list[1] = tmp;
        }
        System.out.println(String.format("%d %d %d", list[0], list[1], list[2]));
    }
}

