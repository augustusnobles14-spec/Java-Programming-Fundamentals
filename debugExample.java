import java.util.Scanner;

public class debugExample {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        double circleCircum, circleRadius, circleArea;

        System.out.print("Enter circle circumference: ");
        circleCircum = scnr.nextDouble();

        circleRadius = circleCircum / (2 * Math.PI);
        circleArea = Math.PI * circleRadius * circleRadius;

        System.out.print("The circle area is " + circleArea);

        scnr.close();

    }
}