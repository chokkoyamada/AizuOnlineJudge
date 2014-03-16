package com.kirishikistudios.aoj.character.sumofnumbers;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author yamadanaoyuki
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        while(scanner.hasNext()){
            stringBuilder.append(scanner.next());
        }
        String s = stringBuilder.toString();
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        for(char c: s.toCharArray()){
            char d = c;
            if(Character.isUpperCase(c)){
                d = Character.toLowerCase(c);
            }
            if(hashMap.containsKey("" + d)){
                hashMap.put(String.valueOf(d), hashMap.get("" + d) + 1);
            }else{
                hashMap.put(String.valueOf(d), 1);
            }
        }
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(char c: alphabet.toCharArray()){
            if(hashMap.containsKey("" + c)){
                System.out.println(c + " : " + hashMap.get("" + c));
            }else{
                System.out.println(c + " : 0");
            }
        }
    }
}
