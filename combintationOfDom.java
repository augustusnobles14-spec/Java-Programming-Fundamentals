import java.util.Scanner;

public class combintationOfDom {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        char letter1, letter2;
        int num;

        letter1 = 'a';

        for (letter1 = 'a'; letter1 <= 'z'; ++letter1) {

            for (letter2 = 'a'; letter2 <= 'z'; ++letter2 ) {
                System.out.println("" + letter1 + letter2 + ".com");
            }
            for (num = 0; num <= 9; ++num ) {
                System.out.println("" + letter1 + num + ".com");
            }
        }

    /*  while (letter1 <= 'z') {
            letter2 = 'a';

            while (letter2 <= 'z') {
                System.out.println("" + letter1 + letter2 + ".com");
                ++letter2;
            }
            ++letter1;
        }
*/
        scnr.close();
      
        
    }
}