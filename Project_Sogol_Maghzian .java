import java.util.Scanner;
import java.util.*; 
import java.io.*;


public class Project_Sogol_Maghzian 
{
    public static void main(String[]args)
    {
       Scanner keyboard = new Scanner(System.in);
       
       
       
       //Get the filename 
       System.out.print("Enter the filename= ");
       String PolicyInformation = keyboard.nextLine();
       
       //Open the file
       File file = new File("PolicyInformation.txt");
       Scanner inputFile = new Scanner(file);
       
       //declare the variables
        double policyNumber = 0.0;
        String providerName  = " ";
        String policyholderFirstName = " ";
        String policyholderLastName = " ";
        int age = 0;
        String smokingStatus = " ";
        double height = 0.0;
        double weight = 0.0;
        
        //Create an array list to store objects. The ArrayList will hold Course objects.
         ArrayList<policy> policy = new ArrayList<policy>();
         
          /* Use a while loop to read the file. Use the hasNext() method to determine whether 
            the file has more data to be read. Use an "if statement" to determine the end of the file and 
            to consume newline characters */
            
            while(inputFile.hasNext())       
         { //open loop
         
            policyNumber = inputFile.nextDouble();
            providerName = inputFile.nextLine();  
            policyholderFirstName = inputFile.nextLine();
            policyholderLastName = inputFile.nextLine();
            age = inputFile.nextInt();
            smokingStatus = inputFile.nextLine();
            height = inputFile.nextDouble();
            weight = inputFile.nextDouble();
            
            if(inputFile.hasNext())
            { 
               inputFile.nextLine();
               inputFile.nextLine();
            }
            
            /* Create Course objects using the Course class type - we are still under the while loop. Objects will be created as long as there are records
            in the file to read.*/
            policy c = new policy(policyNumber,providerName,policyholderFirstName,  policyholderLastName, age, smokingStatus,height, weight); //Passing variables as arguments to the constructor
         
            /* Add Course objects to the ArrayList (Note: courses is the reference variable for the ArrayList and c is the
            reference variable for the Course objects)*/
            policy.add(c); 
            
        } //close loop
        
        inputFile.close();//close the file

                   
       //use a for loop to display the output
         for(int i =0; i < policy.size(); i++)
         { 

           System.out.print("Policy Number: " + policy.get(i).getpolicyNumber());
           System.out.print("\nProvider Name: " + policy.get(i).getproviderName());
           System.out.print("\nPolicyholder’s First Name: " + policy.get(i).getpolicyholderFirstName());
           System.out.print("\nPolicyholder’s Last Name: " + policy.get(i).getpolicyholderLastName());
           System.out.print("\nPolicyholder’s Age: " + policy.get(i).getage());
           System.out.print("\nPolicyholder’s Smoking Status: " + policy.get(i).getsmokingStatus());
           System.out.print("\nPolicyholder’s Height: " + policy.get(i).getheight());
           System.out.print("\nPolicyholder’s Weight:" + policy.get(i).getweight());
        
        }
      
       box.setBmi(45.81);
       box.setpolicyPrice(816.24);
       
       
         System.out.print("\nPolicyholder’s BMI: " + box.getBmi());
         System.out.print("\nPolicy Price: " + box.getpolicyPrice());
      
       }//close the "try" block of code
      
           
   } //close main
   
        
       
   