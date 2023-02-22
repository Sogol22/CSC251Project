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
  
  public double policyNumber()
  {
    return policyNumber;
  }
  
  public String providerName()
  {
    return providerName;
  }
  
  public String policyholderFirstName()
  {
    return policyholderFirstName;
  }
 
  public String policyholderLastName()
  {
    return  policyholderLastName;
  }
  
  public int age()
  {
   return age;
  }
  
  public String smokingStatus()
  {
    return smokingStatus;
  }
  
  public double height()
  {
    return height;
  }
  
  public double weight()
  {
    return weight;
  }
}
  
     
     
     
     
  