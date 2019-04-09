package exerfoflon;

public class MySpinnerProgram {
    public static void main(String[] args){
        Spinner player1 = new Spinner("ABC", 8, "Red", "Blue");
        player1.displayColours();
        player1.spin();
        Spinner player2 = new Spinner("XYZ", 8, "Grey", "Brown");
        player2.displayColours();
        player2.spin();
    }
}
