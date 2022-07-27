import java.util.Scanner;
import java.lang.Math;

public class CalculationOperations {

    // Calculator(Addition, Subtraction, Multiplication and Division)

    public static void Calculator(){

        Scanner input = new Scanner(System.in);

        System.out.print("Sayi1 : ");
        double number1 = input.nextDouble();

        System.out.print("Sayi2 : ");
        double number2 = input.nextDouble();

        System.out.print("İşlem : ");
        String operator = input.next();

        System.out.print(Calculate(number1, number2, operator));
    }
    public static Double Calculate(double number1, double number2, String operator) {

        double result =0;

        if (operator.equals("+")) {

            result = number1 + number2;

        } else if (operator.equals("-")) {

            result = number1 + number2;

        } else if (operator.equals("*")) {

            result = number1 + number2;

        } else if (operator.equals("/")) {

            result = number1 + number2;
        }

        return result;
    }

    //Circumference of the circle

    public static void CircumferenceOfCircle(double r){

        //final double pi = 3.14; /* User defined constant value of pi */
        //double circumference=2*pi*r;
        double circumference=2*Math.PI*r;
        System.out.println("Dairenin çevresi = "+ circumference);
    }

    //Area of the square

    public static void AreaOfSquare(double edge){

        double area=Math.pow(edge, 2);
        System.out.println("Karenin alanı = "+ area);
    }
}
