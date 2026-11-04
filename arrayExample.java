import java.util.Scanner;

public class arrayExample {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        int[] userVals = new int[6];
        int i, sumVal, maxVal, minVal;
        double avg;
        
        
        maxVal = 0;
        sumVal = 0;
        minVal = 0;
        for (i=0; i < userVals.length; ++i) {
            userVals[i] = scnr.nextInt();
            minVal = userVals[1];
        }
        for (i=0; i < userVals.length; ++i) {
            sumVal = sumVal + userVals[i];
            if (userVals[i] > maxVal) {
                maxVal = userVals[i];
            }
            if (userVals[i] < minVal) {
                minVal = userVals[i];
            }
        }

        avg = (double) sumVal / userVals.length;
        System.out.println("Total Sum: " + sumVal);
        System.out.println("Average: " + avg);
        System.out.println("Maximun value: " + maxVal);
        System.out.println("Minimum value: " + minVal);

        
    }
}
