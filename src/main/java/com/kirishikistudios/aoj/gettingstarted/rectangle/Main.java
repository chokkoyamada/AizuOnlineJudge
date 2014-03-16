package com.kirishikistudios.aoj.gettingstarted.rectangle;

import java.util.Scanner;

/**
 * Created by yamadanaoyuki on 2014/03/16.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\s");
        int tate = scanner.nextInt();
        int yoko = scanner.nextInt();
        int menseki = tate * yoko;
        int gaisyu = (tate * 2) + (yoko * 2);
        System.out.println(menseki + " " + gaisyu);
    }
}
