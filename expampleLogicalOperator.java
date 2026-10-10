import java.util.Scanner;
// This program should be fixed have logical error
public class expampleLogicalOperator {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int channelNum;
        char channelType;


        System.out.print("Enter your chanel num: ");

        channelNum = scnr.nextInt();

        if ((channelNum >= 2) && (channelNum <= 499)) {
            channelType ='s';
        }
        else if (channelNum >= 1002 && channelNum <= 1499) {
            channelType ='h';
        }
        else {
            channelType ='e';
        }
        System.out.println(channelType);

        scnr.close();
    }
}