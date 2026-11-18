import java.util.Scanner;

public class exampleUsrDefinedMethodLoop {
        
    public static double computeAverage(Scanner scnr, int numVals) {
        int i;
        int sumVal, currVal;
        sumVal = 0;
        for (i = 0; i < numVals; ++i) {
            currVal = scnr.nextInt();
            sumVal += currVal;

        }
        return (double)sumVal / numVals;
    }
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        int numVals;
        double averageVal;

        numVals = scnr.nextInt();
        averageVal = computeAverage(scnr, numVals);
        
        System.out.printf("Average: %.3f\n", averageVal);

        scnr.close();
    }
}
