import java.util.Scanner;

public class LabMathMethods {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double x;
      double y;
      double z;
      double xPwZ , yABS, sqrtXYPwZ;
      double xPwyPwz;
      
      x = scnr.nextDouble();  
      y = scnr.nextDouble();
      z = scnr.nextDouble();

      xPwZ = Math.pow(x,z);
      xPwyPwz = Math.pow(x,Math.pow(y,z));
      yABS = Math.abs(y);
      sqrtXYPwZ = Math.sqrt(Math.pow((x * y), z));

      System.out.println(xPwZ + " " + xPwyPwz + " " + yABS + " " + sqrtXYPwZ);

      scnr.close();
   }  
}
