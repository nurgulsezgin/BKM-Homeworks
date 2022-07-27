public class Main {
    public static void main(String[] args) {

        CalculationOperations.Calculator();
        CalculationOperations.AreaOfSquare(4);
        CalculationOperations.CircumferenceOfCircle(5);

        Play playing=new Play();
        playing.DiceGame();
        playing.GuessNumber();
        playing.GuessProvince();
    }
}