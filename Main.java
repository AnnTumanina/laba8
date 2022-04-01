package com.company;
import java.util.Scanner;

class ExceptionInCalculation extends Exception{
    public double y;
    public ExceptionInCalculation(String message, double y){
        super(message);
        this.y = y;
    }
}

class calculation{
    public static double getC(double x, double y) throws ExceptionInCalculation{
        double result;
        if(y == -1) throw new  ExceptionInCalculation("Число в знаменателе меньше 0, невозможно вычислить", y);
        result = (x + y)/(y + 1);
        return result;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите значение x");
        Scanner xD = new Scanner(System.in);
        int x = xD.nextInt();

        System.out.println("Введите значение y, не = -1");
        Scanner yD = new Scanner(System.in);
        int y = yD.nextInt();

        try{
            double result = calculation.getC(x, y);
            System.out.printf("x+y/y+1 = %f",result);
        }
        catch (ExceptionInCalculation e){
            System.out.println(e.getMessage());
        }
    }
}