import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;


public class IncomeStatement {
    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        Map<String, Double> Revenues = new HashMap<>();
        Map<String, Double> Expenses = new HashMap<>();
        
        while (true) {
            System.out.println("\n -----Menu-----");
            System.out.println("1: | Record Revenue"); 
            System.out.println("2. | Record expense");
            System.out.println("3. | Calculate Income Statement");
            System.out.println("4. | Print All records");
            System.out.println("5. | Delete Last Record");
            System.out.println("6. | Exit menu/Finish program");
            System.out.print("Select an option: ");
            String flag;

            flag = scnr.nextLine();

            if (flag.equals("1")) {
                System.out.print("Insert type of Revenue: "); 
                String typeRevenue = scnr.nextLine();

                System.out.print("Insert value of the record: ");
                Double revenueRecordValue = scnr.nextDouble();
                scnr.nextLine();

                Revenues.put(typeRevenue, revenueRecordValue);
                System.out.println("\nRevenue recorded sucessfully!");
            }
            else if (flag.equals("2")) {
                System.out.print("Insert type of Expense: "); 
                String typeExpense = scnr.nextLine();

                System.out.print("Insert value of the record: ");
                Double expenseRecordValue = scnr.nextDouble();
                scnr.nextLine();

                Expenses.put(typeExpense, expenseRecordValue);
                System.out.println("\nExpense recorded sucessfully!");
            }
            
            else if (flag.equals("3")) {
                System.out.println("\n---Income Statement---\n");

                double totalRevenues = 0.0;
                double totalExpenses = 0.0;
                double netIncome;

                totalRevenues = Revenues.values().stream().mapToDouble(Double :: doubleValue).sum();
                totalExpenses = Expenses.values().stream().mapToDouble(Double :: doubleValue).sum();
                
                netIncome = totalRevenues - totalExpenses;

        
               /*  Revenues.forEach((typeRevenue, revenueRecordValue) -> {
                    System.out.println(typeRevenue + ": " + revenueRecordValue); //ForEach syntax solution for printing all values
                }); */

                System.out.println("Your net Income/Loss is: " + netIncome + "\n");



            }

            else if (flag.equals("4")) {
                Revenues.forEach((typeRevenue, revenueRecordValue) -> {
                    System.out.println(typeRevenue + ": " + revenueRecordValue); //ForEach syntax solution for printing all values
                });
            }

            
            else {
                System.out.println("\nIn construction");
                System.out.println(Revenues);
                System.out.println(Expenses);

                break;
            }    
            
        
        }

        

    }

}
