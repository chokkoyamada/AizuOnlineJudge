package com.kirishikistudios.aoj.nestedcontrols1.printarectangle;

import java.util.Scanner;

/**
 * Created by yamadanaoyuki on 2014/03/16.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\s");
        while(scanner.hasNext()){
            int tate = scanner.nextInt();
            int yoko = scanner.nextInt();
            if((tate == 0) && (yoko == 0)){
                break;
            }
            for(int i = 0; i < tate; i++){
                for(int j = 0; j < yoko; j++){
                    System.out.print("#");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
