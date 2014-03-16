package com.kirishikistudios.aoj.nestedcontrols2.grading;

import java.util.Scanner;

/**
 * Created by yamadanaoyuki on 2014/03/16.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\s");

        int tyukan;
        int kimatsu;
        int saishiken;
        char grade;

        while(true){
            tyukan = scanner.nextInt();
            kimatsu = scanner.nextInt();
            saishiken = scanner.nextInt();

            if(tyukan == -1 && kimatsu == -1 && saishiken == -1){
                break;
            }

            if(tyukan == -1 || kimatsu == -1){
                grade = 'F';
            }else if((tyukan + kimatsu) >= 80){
                grade = 'A';
            }else if((tyukan + kimatsu) >= 65){
                grade = 'B';
            }else if((tyukan + kimatsu) >= 50){
                grade = 'C';
            }else if((tyukan + kimatsu) >= 30){
                if(saishiken >= 50){
                    grade = 'C';
                }else{
                    grade = 'D';
                }
            }else{
                grade = 'F';
            }
            System.out.println(grade);
        }

    }
}
