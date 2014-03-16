package com.kirishikistudios.aoj.string.shuffle;

import java.util.Scanner;

/**
 * @author yamadanaoyuki
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            String words = scanner.next();
            if(words.equals("-")){
                break;
            }
            int shuffleNum = scanner.nextInt();
            String output = words;
            for(int i = 0; i < shuffleNum; i++){
                int h = scanner.nextInt();
                String subStr = output.substring(0, h);
                String remained = output.substring(h, words.length());
                output = remained + subStr;
            }
            System.out.println(output);
        }
    }
}

