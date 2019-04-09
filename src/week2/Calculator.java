package week2;
public class Calculator {
    int numberOne, numberTwo;
    double result;

    Calculator(){
        numberOne = 5;
        numberTwo = 7;
        int answer = 0;
        double rate = 3.3355;
    }

    Calculator(int theNumberOne, int theNumberTwo){
        System.out.println("Loading");
        numberOne = theNumberOne;
        numberTwo = theNumberTwo;

    }
    void add(){
        System.out.println("Addition result is:  " +  (numberOne + numberTwo));
    }
    void squareNumber(int num){
        System.out.print("Square result is: ");
        System.out.println(num * num);

    }
    void displayNumbers(){
        System.out.println("numberOne is "+ numberOne + ", numberTwo is " + numberTwo);
    }
}
