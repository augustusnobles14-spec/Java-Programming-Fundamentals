import java.util.Scanner;

public class forExample {
   public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
      
    int numVals, currVal, sumVal, maxVal, minVal;
    double avg;
    int i;

    System.out.println("Enter your number of inputs values: ");

    numVals = scnr.nextInt();

    sumVal = 0;
    maxVal = 0;
    minVal = 0;

    for (i = 0; i < numVals; ++i) {
        currVal = scnr.nextInt();

        sumVal = sumVal + currVal;

        if (i == 0) {
            maxVal = currVal;
        }
        else if (currVal > maxVal) {
            maxVal = currVal;
        }
        if (i == 0) {
            minVal = currVal;
        }
        else if (currVal < minVal) {
            minVal = currVal;
        }

    }

    System.out.println(sumVal);

    avg = (double) sumVal / numVals;

    System.out.print(avg);

    scnr.close();
   }  
}