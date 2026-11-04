import java.util.Scanner;
public class arrayExampleII {
  public static void main(String args[]) {
    Scanner scnr = new Scanner(System.in);
    int[] userVals = new int[6];
    int i;
    
    for (i = 0; i < userVals.length; ++i) {
        userVals[i] = scnr.nextInt();
    }
    
    //original array
    for (i = 0; i < userVals.length; ++i) {
        System.out.print(userVals[i] + " ");
    }
    System.out.println();
    
    //1st half
    for (i = 0; i < userVals.length / 2; ++i) {
        System.out.print(userVals[i] + " ");
    }
    System.out.println();
    
    //2nd half
    for (i = userVals.length / 2; i < userVals.length; ++i) {
        System.out.print(userVals[i] + " ");
    }
    System.out.println();

    //Array in reverso order

    for (i = userVals.length - 1;i >= 0; --i) {
        System.out.print(userVals[i] + " ");
    }
    System.out.println();

    //Second half in reverse order

    for (i = userVals.length - 1; i >= userVals.length / 2; --i) {
        System.out.print(userVals[i] + " ");
    }
    System.out.println();

    //First half in reverse order

    for (i = (userVals.length / 2) - 1; i >= 0; --i) {
        System.out.print(userVals[i] + " ");
    }
    System.out.println();
    
    scnr.close();
  }
}