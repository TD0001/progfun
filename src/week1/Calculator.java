package week1;

import java.awt.desktop.SystemSleepEvent;

public class Calculator {
    int numberOne, numberTwo;
    Calculator()
    {
        numberOne = 5;
        numberTwo = 7;


        System.out.println("loading calculator program");
        System.out.println("--------------------------");

    }
    void add(int x, int y){
        System.out.println(x + y);
    }
    void substract(int x, int y){
        System.out.println(x - y);
    }
    void multiply (int x, int y){
        System.out.println(x * y);
    }
}
