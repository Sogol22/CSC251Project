import java.util.Scanner;

public class project_Sogol_Maghzian 
{
    public static void main(String[]args)
    {
       Scanner keyboard = new Scanner(System.in);
       
       policy box = new policy();
       
       
       System.out.println("Please enter the Policy Number: ");
       box.setpolicyNumber(1234);
       policyNumber = keyboard.nextDouble();
       
       System.out.println("Please enter the Provider Name: ");
       box.setproviderName(State Farm);
       providerName = keyboard.nextLine();
       
       System.out.println("Please enter the Policyholder’s First Name: ");
       box.setpolicyholderFirstName(John);
       policyholderFirstName = keyboard.nextLine();
       
       System.out.println("Please enter the Policyholder’s Last Name: ");
       box.setpolicyholderLastName(Doe);
       policyholderLastName = keyboard.nextLine();
       
       System.out.println("Please enter the Policyholder’s Age: ");
       box.setage(24);
       age = keyboard.nextInt();
       
       System.out.println("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
       box.setsmokingStatus(non-smoker);
       smokingStatus = keyboard.nextLine();
       
       System.out.println("Please enter the Policyholder’s Height (in inches): ");
       box.setheight(62.0);
       height = keyboard.nextDouble();
       
       System.out.println("Please enter the Policyholder’s Weight (in pounds): ");
       box.setweight(250.5);
       weight = keyboard.nextDouble();
       
       box.setBmi(45.81);
       box.setpolicyPrice(816.24);
       
       
       System.out.print("Policy Number: " + box.getpolicyNumber());
       System.out.print("\nProvider Name: " + box.getproviderName());
       System.out.print("\nPolicyholder’s First Name: " + box.getpolicyholderFirstName());
       System.out.print("\nPolicyholder’s Last Name: " + box.getpolicyholderLastName());
       System.out.print("\nPolicyholder’s Age: " + box.getage());
       System.out.print("\nPolicyholder’s Smoking Status: " + box.getsmokingStatus());
       System.out.print("\nPolicyholder’s Height: " + box.getheight());
       System.out.print("\nPolicyholder’s Weight:" + box.getweight());
       
       
        System.out.print("\nPolicyholder’s BMI: " + box.getBmi());
         System.out.print("\nPolicy Price: " + box.getpolicyPrice());
      }
 }
        
       
   