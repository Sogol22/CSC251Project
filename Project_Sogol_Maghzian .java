import java.util.Scanner;
import java.util.*; 
import java.io.*;


public class Project_Sogol_Maghzian 
{
    public static void main(String[]args) throws IOException

    {
       Scanner keyboard = new Scanner(System.in);
       
              
       //declare the variables
        double policyNumber = 0.0;
        String providerName  = " ";
        String policyholderFirstName = " ";
        String policyholderLastName = " ";
        int age = 0;
        String smokingStatus = " ";
        double height = 0.0;
        double weight = 0.0;
        
           //ArrayList to store Policy objects
           ArrayList<policy> policy = new ArrayList<policy>();
           
            //Get the filename 
            System.out.print("Enter the filename= ");
            String PolicyInformation = keyboard.nextLine();
       
            //Open the file
            File file = new File("PolicyInformation.txt");
            Scanner inputFile = new Scanner(file);

         
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
            
            //make sure we haven't hit the end of the file before trying to skip the blank line
         if(inputFile.hasNext())
            inputFile.nextLine();
         if(inputFile.hasNext())
            inputFile.nextLine();
            
             //create a Policy object and add it to our ArrayList
            policy.add(new policy(policyNumber,providerName,policyholderFirstName,  policyholderLastName, age, smokingStatus,height, weight)); //Passing variables as arguments to the constructor
         
                       
        } //close loop
        
        inputFile.close();//close the file

                   
       //use a for loop to display the output
          for(Policy policy : policy)
         { 

           System.out.print("Policy Number: " + policy.getpolicyNumber());
           System.out.print("\nProvider Name: " + policy.getproviderName());
           System.out.print("\nPolicyholder’s First Name: " + policy.getpolicyholderFirstName());
           System.out.print("\nPolicyholder’s Last Name: " + policy.getpolicyholderLastName());
           System.out.print("\nPolicyholder’s Age: " + policy.getage());
           System.out.print("\nPolicyholder’s Smoking Status: " + policy.getsmokingStatus());
           System.out.print("\nPolicyholder’s Height: " + policy.getheight());
           System.out.print("\nPolicyholder’s Weight:" + policy.getweight());
           System.out.println();
           
           if(policy.getsmokingStatus().equalsIgnoreCase("smoker"))//keep track of the number of smokers
            numSmokers++;

        }
      
     //print out the number of smokers and non-smokers
      System.out.println("The number of policies with a smoker is: " + numSmokers);
      System.out.println("The number of policies with a non-smoker is: " + (policy.size() - numSmokers) );
      
       }//close the "try" block of code
      
           
   } //close main
   
        
       
   