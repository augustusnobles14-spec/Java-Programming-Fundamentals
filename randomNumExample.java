import java.util.Random;

public class randomNumExample {
    public static void main(String[] args){
        Random randgen = new Random();

        int num1, num2, num3;

        num1 = randgen.nextInt(6) + 10;
        num2 = randgen.nextInt(100);
        num3 = randgen.nextInt(1000);
        
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

    }
}

