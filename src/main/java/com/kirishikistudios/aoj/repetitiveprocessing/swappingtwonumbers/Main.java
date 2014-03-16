package com.kirishikistudios.aoj.repetitiveprocessing.swappingtwonumbers;

import java.util.Scanner;

/**
 * Created by yamadanaoyuki on 2014/03/16.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\s");
        while(scanner.hasNext()){
            int j = scanner.nextInt();
            int k = scanner.nextInt();
            if((j == 0) && (k == 0)){
                break;
            }
            if(j < k){
                System.out.println(String.format("%d %d", j, k));
            }else{
                System.out.println(String.format("%d %d", k, j));
            }
        }
    }
}
