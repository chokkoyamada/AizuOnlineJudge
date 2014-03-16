package com.kirishikistudios.aoj.nestedcontrols2.howmanyways;

import java.util.Scanner;

/**
 * Created by yamadanaoyuki on 2014/03/16.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\s");
        while(true){
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            if(n == 0 && x == 0){break;}
            int patternNum = 0;
            for(int i = 1; i <= n; i++){
                for(int j = i+1; j <= n; j++){
                    for(int k = j+1; k <= n; k++){
                        if((i + j + k) == x){
                            patternNum++;
                        }
                    }
                }
            }
            System.out.println(patternNum);
        }
    }
}

