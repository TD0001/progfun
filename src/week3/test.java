package week3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class test {
    public static double calcArea(double radius){
        double squ = Math.pow(radius,2)* Math.PI;
        return squ;
    }
    double sum(double a, double b){
        double total = a+b;
        return total;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter your string: ");
        String s = sc.next();
//        System.out.println(s);
        System.out.println();
        //round
//        if( s.equalsIgnoreCase("alo" )){
//            System.out.println("alo cai dit me may");
//        }

        double sq = calcArea(3);
        DecimalFormat twoD = new DecimalFormat("#.###");
        Double sqro = Double.valueOf(twoD.format(sq));
        System.out.println(sqro);

    }
    double interest(){
        double in = 0.5 * 3;
        return in;
    }

}
