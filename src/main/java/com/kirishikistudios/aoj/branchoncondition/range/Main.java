package com.kirishikistudios.aoj.branchoncondition.range;

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
        int c = scanner.nextInt();
        if((a < b) && (b < c)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
