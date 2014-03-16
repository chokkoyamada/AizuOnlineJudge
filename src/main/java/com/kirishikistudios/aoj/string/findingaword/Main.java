package com.kirishikistudios.aoj.string.findingaword;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author yamadanaoyuki
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        ArrayList<String> arrayList= new ArrayList<String>();
        while(scanner.hasNext()){
            String candidate = scanner.next();
            if(candidate.equals("END_OF_TEXT")){
                break;
            }
            arrayList.add(candidate);
        }
        int count = 0;
        for(String s: arrayList){
            if(word.equals(s.toLowerCase())){
                count++;
            }
        }
        System.out.println(count);
    }
}
