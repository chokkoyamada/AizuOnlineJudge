package com.kirishikistudios.aoj.branchoncondition.smalllargeorequal;

import java.util.Scanner;

/**
 * Created by yamadanaoyuki on 2014/03/16.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\s");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a < b){
            System.out.println("a < b");
        }else if(a > b){
            System.out.println("a > b");
        }else if(a == b){
            System.out.println("a == b");
        }
    }
}
