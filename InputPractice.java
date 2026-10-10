import java.util.Scanner;

public class InputPractice{
    public static void main(String[] args) {
        int gold;

        Scanner scnr = new Scanner(System.in);
        System.out.println("escriba peso de oro: ");
        gold = scnr.nextInt();

        System.out.print("peso de oro: ");
        System.out.println(gold * 10);

        scnr.close();
    }

}