package exerfoflon;

public class Spinner {
    String playerName, colourA, colourB;
    int maxScore;
    Spinner(String nameOfPlayer, int maximumScore, String theColourA, String theColourB)
    {
        playerName = nameOfPlayer;
        maxScore = maximumScore;
        colourA = theColourA;
        colourB = theColourB;
        System.out.println("Hi, player " + playerName);

    }
    void displayColours(){
        System.out.println("Colour A is: " + colourA + ", Colour B is: " + colourB);
    }
    void spin(){
        System.out.println("Congratulations! you have spun a " + Math.random()*maxScore);
    }
}
