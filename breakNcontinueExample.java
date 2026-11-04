import java.util.Scanner;

public class breakNcontinueExample {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        char letter1, letter2;
        int i;

        for (letter1 = 'a'; letter1 <= 'z'; ++letter1) {
            for (letter2 = 'a'; letter2 <= 'z'; ++letter2){
                System.out.print("" + letter1 + letter2 + ".com");
                if (letter1 == letter2) {
                    System.out.println("Letters are the same and stop!");
                    break;
                }
            }
            if (letter1 == 'e') {
                System.out.println("Last iteration of letter1!");
                break;
            }
        }

        for (i = 1; i <= 30; ++i) {
            if (i % 2 == 0){
                continue;
            }
            System.out.print(i + " ");
        }
        scnr.close();
        
    }
}
