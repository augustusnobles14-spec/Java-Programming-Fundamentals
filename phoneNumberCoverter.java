import java.util.Scanner;

public class phoneNumberCoverter {
    public static void main(String[] args){
        
    Scanner scnr = new Scanner(System.in);

    String phoneNum;
    int i;
    char individualChar;

    System.out.print("enter your phone number: ");

    phoneNum = scnr.nextLine();

    for (i = 0; i < phoneNum.length(); ++i) {
        individualChar = phoneNum.charAt(i);

        if (individualChar == '-' || individualChar >= '0' && individualChar <= '9') {
            System.out.print(individualChar);
        }
        else if (individualChar >= 'A' && individualChar <= 'C' || individualChar >= 'a' && individualChar <= 'c') {
            System.out.print("2");
        }
        else if (individualChar >= 'D' && individualChar <= 'F' || individualChar >= 'd' && individualChar <= 'f') {
            System.out.print("3");
        }
        else if (individualChar >= 'G' && individualChar <= 'I' || individualChar >= 'g' && individualChar <= 'i') {
            System.out.print("4");
        }
        else if (individualChar >= 'J' && individualChar <= 'L' || individualChar >= 'j' && individualChar <= 'l') {
            System.out.print("5");
        }
        else if (individualChar >= 'M' && individualChar <= 'O' || individualChar >= 'm' && individualChar <= 'o') {
            System.out.print("6");
        }
        else if (individualChar >= 'P' && individualChar <= 'S' || individualChar >= 'p' && individualChar <= 's') {
            System.out.print("7");
        }
        else if (individualChar >= 'T' && individualChar <= 'V' || individualChar >= 't' && individualChar <= 'v') {
            System.out.print("8");
        }
        else if (individualChar >= 'W' && individualChar <= 'Z' || individualChar >= 'w' && individualChar <= 'z') {
            System.out.print("9");
        }
        else {
            System.out.print("?");
        }
    }
    scnr.close();
        
    }
}