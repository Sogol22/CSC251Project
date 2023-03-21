public class policy
{
  private double policyNumber;
  private String providerName;
  private String policyholderFirstName;
  private String policyholderLastName;
  private int age;
  private String smokingStatus;
  private double height;
  private double weight;
  
  public policy()
  {
    policyNumber = 0.0;
    providerName = " ";
    policyholderFirstName = " ";
    policyholderLastName = " ";
    age = 0;
    smokingStatus = " ";
    height = 0.0;
    weight = 0.0;
  }
  
  /**
   Constructor that accepts arguments for each field
   @param pNumber The Policy number
   @param pName The Policy Provider's Name
   @param fName The Policyhodler's first name
   @param lName The Policyholder's last name
   @param a The Policyholder's age
   @param sStatus The Policyholder's smoking status
   @param h The Policyholder's height
   @param w The Policytholder's weight
   */

  
  public policy(double policyNumber , String providerName , String policyholderFirstName , String policyholderLastName , int age , String smokingStatus , double height , double weight)
  {
     policyNumber =  policyNumber;
     providerName = providerName;
     policyholderFirstName = policyholderFirstName;
     policyholderLastName = policyholderLastName;
     age = age; 
     smokingStatus = smokingStatus;
     height = height;
     weight = weight;
  }
  
  public policy(policy object2)
  {
     policyNumber = object2.policyNumber;
     providerName = object2.providerName;
     policyholderFirstName = object2.policyholderFirstName;
     policyholderLastName = object2.policyholderLastName;
     age = object2.age; 
     smokingStatus = object2.smokingStatus;
     height = object2.height;
     weight = object2.weight;
   }
    

  
   //setters//
   
   /**
   @param pNumber The Policy Number
   */

  
  public void setpolicyNumber(double policyNumber)
  {
     policyNumber =  policyNumber;
  }
  
  public void setproviderName(String providerName)
  {
    providerName = providerName;
  }
  
  public void setpolicyholderFirstName(String policyholderFirstName)
  {
    policyholderFirstName = policyholderFirstName;
  }
  
  public void setpolicyholderLastName(String policyholderLastName)
  {
    policyholderLastName = policyholderLastName;
  }
  
  public void setage(int age)
  {
    age = age;
  }
  
  public void setsmokingStatus(String smokingStatus)
  {
    smokingStatus = smokingStatus;
  }
  
  public void setheight(double height)
  {
    height = height;
  }
  
  public void setweight(double weight)
  {
    weight = weight;
  }
  
   //getters//
   /**
   @return The Policy Number
   */

  
  public double getpolicyNumber()
  {
    return policyNumber;
  }
  
  public String getproviderName()
  {
    return providerName;
  }
  
  public String getpolicyholderFirstName()
  {
    return policyholderFirstName;
  }
 
  public String getpolicyholderLastName()
  {
    return  policyholderLastName;
  }
  
  public int getage()
  {
   return age;
  }
  
  public String getsmokingStatus()
  {
    return smokingStatus;
  }
  
  public double getheight()
  {
    return height;
  }
  
  public double getweight()
  {
    return weight;
  }
  
  /**
   Calculates the Policyholder's BMI
   @return The BMI of the Policyholder
   */
   public double getBMI()
   {
      final double CONVFACTOR = 703;
      
      return (weight * CONVFACTOR) / (height * height);
   }
   
   /**
   Calculates the Policy's price
   @return The price of the Policy
   */
   public double getPrice()
   {
      final double BASE_PRICE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double price = BASE_PRICE;
      
      if(age > AGE_THRESHOLD)
         price += ADDITIONAL_FEE_AGE;
         
      if(smokingStatus.equalsIgnoreCase("smoker"))
         price += ADDITIONAL_FEE_SMOKING;
      
      if(getBMI() > BMI_THRESHOLD)
         price += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI);
         
      return price;
   }
   
   public String toString()
   {
      return String.format("policyNumber " + policyNumber + "\nproviderName " + providerName + 
      "\npolicyholderFirstName " + policyholderFirstName + "\npolicyholderLastName " + 
      policyholderLastName + "\nage " + age + "\nsmokingStatus " + smokingStatus + "\nheight " + height + "\nweight " +
      weight);
   }

}

 //Not included in the instructions but can be added...
   /*Displays information about the Policy
   public void displayInformation()
   {
      System.out.println("Policy Number: " + policyNumber);
      System.out.println("Provider Name: " + providerName);
      System.out.println("Policyholder's First Name: " + firstName);
      System.out.println("Policyholder's Last Name: " + lastName);
      System.out.println("Policyholder's Age: " + age);
      System.out.println("Policyholder's Smoking Status (Y/N): " + smokingStatus);
      System.out.println("Policyholder's Height: " + height + " inches");
      System.out.println("Policyholder's Weight: " + weight + " pounds");
      System.out.printf("Policyholder's BMI: %.2f\n", getBMI());
      System.out.printf("Policy Price: $%.2f\n", getPrice());
   }
   */

  
     
     
     
     
  