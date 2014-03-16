package com.kirishikistudios.aoj.character.togglingcases;

import java.util.Scanner;

/**
 * @author yamadanaoyuki
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");
        String string = scanner.next();
        for(char c : string.toCharArray()){
            if(Character.isLowerCase(c)){
                System.out.print(Character.toUpperCase(c));
            }else if(Character.isUpperCase(c)){
                System.out.print(Character.toLowerCase(c));
            }else{
                System.out.print(c);
            }
        }
        System.out.println("");
    }
}
