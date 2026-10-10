import java.util.Scanner;

public class MyClassIII {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        char letter;
       //int num; //this is for the cases and num if statements
        letter = scnr.next().charAt(0);
        //num = scnr.nextInt(); // for reading the num case 


        switch (letter) {
            case 'a':
            case 'A':
                System.out.println("Alpha");
                break;

            case 'b':
            case 'B':
                System.out.println("Beta");
                break;
            

            default:
                System.out.println("Unknown");
                break;

        }
         /*switch (num) {  //num cases
            case 0:
                System.out.println("Zero");
                break;

            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            default:
                System.out.println("Unknown");
                break;


        } */


       /*  if (num == 0){ //num if statement
            System.out.println("Zero");
        }
        else if (num == 1){
            System.out.println("One");
        }
        else if (num == 2){
            System.out.println("Two");
        }
        else {
            System.out.println("unknown");
        }
        */
       
        scnr.close();
        
    }
}
