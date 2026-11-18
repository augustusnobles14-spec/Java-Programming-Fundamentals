import java.util.Scanner;

public class arrayExampleIII {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        final int numElements = 6;
        int[] userVals = new int[numElements];
        int i;
        int temp;

        for (i = 0; i < userVals.length; ++i){
            userVals[i] = scnr.nextInt();

        }

        for (i = 0; i < userVals.length / 2; ++i) {
            temp = userVals[i];

            userVals[i] = userVals[userVals.length - 1 - i];

            userVals[userVals.length - 1 - i] = temp;
        }

        for (i = 0; i < userVals.length; ++i){
            System.out.print(userVals[i] + " ");

        }

        
        System.out.println();



        scnr.close();
    }
}