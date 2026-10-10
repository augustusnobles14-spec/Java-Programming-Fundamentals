import java.util.Scanner;

public class charExample{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        char arrowHead, arrowBody;

        arrowHead = scnr.next().charAt(0);
        arrowBody = scnr.next().charAt(0);

        System.out.print("" + arrowBody + arrowBody + arrowBody + arrowHead); 
       
        scnr.close();
    }
}