package com.kirishikistudios.aoj.nestedcontrols2.spreadsheet;

import java.util.Scanner;

/**
 * Created by yamadanaoyuki on 2014/03/16.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\s");
        int r = scanner.nextInt();
        int c = scanner.nextInt();

        int[][] sheet = new int[r+1][c+1];
        for(int i = 0; i < r; i++){
            int rSum= 0;
            for(int j = 0; j < c; j++){
                sheet[i][j] = scanner.nextInt();
                rSum += sheet[i][j];
            }
            sheet[i][c] = rSum;
        }
        for(int j = 0; j < c+1; j++){
            int cSum = 0;
            for(int i =0; i < r; i++){
                cSum += sheet[i][j];
            }
            sheet[r][j] = cSum;
        }
        for(int i = 0; i < r+1; i++){
            for(int j = 0; j < c+1; j++){
                System.out.print(sheet[i][j]);
                if(j != c){
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
