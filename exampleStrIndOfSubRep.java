import java.util.Scanner;

public class exampleStrIndOfSubRep {
    public static void main(String[] args){
        
     Scanner scnr = new Scanner(System.in);

     String userEmail, userName, domainName;
     int domainIndex, atSymbolIndex;
    
     
     System.out.print("Enter your email: ");
     userEmail = scnr.nextLine();

     atSymbolIndex = userEmail.indexOf("@");
     domainIndex = userEmail.indexOf(".com", atSymbolIndex);
     System.out.println(domainIndex);

     userName = userEmail.substring(0, atSymbolIndex);
     domainName = userEmail.substring(atSymbolIndex + 1);
     System.out.println("Your user name is: " + userName);
     System.out.println("Your domain is: " + domainName);

     if (domainIndex != -1) {
        System.out.print(".com is present.");
     }
     else {
        System.out.print(".com is not present.");
     }


    
      scnr.close();
        
    }
}