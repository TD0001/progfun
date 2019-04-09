package week2;

public class MyCalculatorProgram {
    public static void main(String[] args){
        Calculator calc1 = new Calculator(5,8);
        Calculator calc2 = new Calculator();

       calc1.add();
//        calc2.add();
        calc2.displayNumbers();
        calc1.squareNumber(69);
//        System.out.println(Math.pow(2,4));
    }
}
