package com.kirishikistudios.aoj.string.cardgame;

import java.util.Scanner;

/**
 * @author yamadanaoyuki
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int gameNum = scanner.nextInt();
        int taroScore = 0;
        int hanakoScore = 0;
        for(int i = 0; i < gameNum; i++){
            String taroCard = scanner.next();
            String hanakoCard = scanner.next();
            if(taroCard.compareTo(hanakoCard) > 0){
                taroScore += 3;
            }else if(taroCard.compareTo(hanakoCard) == 0){
                taroScore += 1;
                hanakoScore += 1;
            }else{
                hanakoScore += 3;
            }
        }
        System.out.println(taroScore + " " + hanakoScore);
    }
}
