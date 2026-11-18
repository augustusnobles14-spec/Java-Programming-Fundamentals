import java.util.Scanner;

public class array2Dexample {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        //int[][] drivingDist = {{0 , 960, 2960}, {960, 0, 2011}, {2960, 2011, 0}};
        int[][] drivingDist = new int[3][3];
        int cityA, cityB;

        drivingDist[0][0] = 0;
        drivingDist[0][1] = 960;
        drivingDist[0][2] = 2960;
        drivingDist[1][0] = 960;
        drivingDist[1][1] = 0;
        drivingDist[1][2] = 2011;
        drivingDist[2][0] = 2960;
        drivingDist[2][1] = 2011;
        drivingDist[2][2] = 0;

        cityA = scnr.nextInt();
        cityB = scnr.nextInt();

        if ((cityA >= 0 && cityA <= 2) && (cityB >= 0 && cityB <= 2)){
            System.out.println("Distance is " + drivingDist[cityA][cityB] + " miles. ");
        }

        scnr.close();
    }
}