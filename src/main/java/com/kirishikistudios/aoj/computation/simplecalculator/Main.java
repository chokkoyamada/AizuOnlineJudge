package com.kirishikistudios.aoj.computation.simplecalculator;

import java.util.Scanner;

/**
 * Created by yamadanaoyuki on 2014/03/16.
 */
public class Main {
    public static enum OP{
        TASU, HIKU, KAKERU, WARU, END;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\s");
        outside: while(scanner.hasNext()){
            int a = scanner.nextInt();
            String op = scanner.next();
            int b = scanner.nextInt();
            switch(checkOp(op)){
                case TASU:
                    System.out.println(a + b);
                    break;
                case HIKU:
                    System.out.println(a - b);
                    break;
                case KAKERU:
                    System.out.println(a * b);
                    break;
                case WARU:
                    System.out.println(a / b);
                    break;
                case END:
                    break outside;
                default:
            }
        }
    }
    public static OP checkOp(String operator){
        if(operator.equals("+")){
            return OP.TASU;
        }else if(operator.equals("-")){
            return OP.HIKU;
        }else if(operator.equals("*")){
            return OP.KAKERU;
        }else if(operator.equals("/")){
            return OP.WARU;
        }
        return OP.END;
    }
}
