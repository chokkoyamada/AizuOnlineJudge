package com.kirishikistudios.aoj.nestedcontrols1.printachessboard;

import java.util.Scanner;

/**
 * Created by yamadanaoyuki on 2014/03/16.
 */
public class Main {
    private static String character;
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
                if((i % 2) == 0){
                    character = "#";
                }else{
                    character = ".";
                }
                for(int j = 0; j < yoko; j++){
                    System.out.print(character);
                    charChange();
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }

    private static void charChange() {
        if(character == "#"){
            character = ".";
        }else{
            character = "#";
        }
    }
}
