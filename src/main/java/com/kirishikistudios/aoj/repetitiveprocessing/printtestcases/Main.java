package com.kirishikistudios.aoj.repetitiveprocessing.printtestcases;

import java.util.Scanner;

/**
 * Created by yamadanaoyuki on 2014/03/16.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while(scanner.hasNext()){
            int j = scanner.nextInt();
            if(j == 0){
                break;
            }
            System.out.println(String.format("Case %d: %d", i, j));
            i++;
        }
    }
}
