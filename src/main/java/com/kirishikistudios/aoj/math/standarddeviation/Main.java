package com.kirishikistudios.aoj.math.standarddeviation;

import java.util.Scanner;

/**
 * @author yamadanaoyuki
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            if(n == 0){
                break;
            }
            double[] score = new double[n];
            double sum = 0;
            for(int i = 0; i < n; i++){
                int scan = scanner.nextInt();
                score[i] = scan;
                sum += scan;
            }
            double average = sum / n;
            double sum2 = 0;
            for(int i = 0; i < n; i++){
                sum2 += Math.pow(score[i] - average, 2);
            }
            double bunsan = sum2 / n;
            double hensa = Math.sqrt(bunsan);
            System.out.println(hensa);
        }

    }
}
