public class PolicyHolder
{
  private policy pollicy;
  private double policyNumber;
  private String providerName;
  private String policyholderFirstName;
  private String policyholderLastName;
  private int age;
  private String smokingStatus;
  private double height;
  private double weight;
  
   public PolicyHolder(policy polli , double policyNumber , String providerName , String policyholderFirstName , String policyholderLastName , int age , String smokingStatus , double height , double weight)
  {
     this.policyNumber =  policyNumber;
     this.providerName = providerName;
     this.policyholderFirstName = policyholderFirstName;
     this.policyholderLastName = policyholderLastName;
     this.age = age; 
     this.smokingStatus = smokingStatus;
     this.height = height;
     this.weight = weight;
     pollicy = new policy(polli);//we use the copy contructor of the policy class to avoid security holes

  }
  //setters//
   
   /**
   @param pNumber The Policy Number
   */

  
  public void setpolicyNumber(double policyNumber)
  {
     this.policyNumber =  policyNumber;
  }
  
  public void setproviderName(String providerName)
  {
    this.providerName = providerName;
  }
  
  public void setpolicyholderFirstName(String policyholderFirstName)
  {
    this.policyholderFirstName = policyholderFirstName;
  }
  
  public void setpolicyholderLastName(String policyholderLastName)
  {
    this.policyholderLastName = policyholderLastName;
  }
  
  public void setage(int age)
  {
    this.age = age;
  }
  
  public void setsmokingStatus(String smokingStatus)
  {
    this.smokingStatus = smokingStatus;
  }
  
  public void setheight(double height)
  {
    this.height = height;
  }
  
  public void setweight(double weight)
  {
    this.weight = weight;
  }
  
  public void setpolicy(policy polli)
  {
    pollicy = new policy(polli);
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
 
 public String toString()
   {
      return String.format("policyNumber " + policyNumber + "\nproviderName " + providerName + 
      "\npolicyholderFirstName " + policyholderFirstName + "\npolicyholderLastName " + 
      policyholderLastName + "\nage " + age + "\nsmokingStatus " + smokingStatus + "\nheight " + height + "\nweight " +
      weight + "\npolicy " + pollicy.toString());
   }
}

  

    
