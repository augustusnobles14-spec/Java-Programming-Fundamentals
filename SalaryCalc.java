/* Program to calculate annual salary
   Author: Cesar Mahecha
   Date: 08/24/2026 */

import java.util.Scanner;

public class SalaryCalc {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int wage, salary;
        
        System.out.print("Enter your wage: ");
        wage = scnr.nextInt(); // Read input value to wage
        salary = wage * 40 * 52; // Salary computation

        System.out.println("Salary is " + salary);

        scnr.close();
    }
}