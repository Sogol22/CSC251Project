public class policy
{
  private double policyNumber;
  private string providerName;
  private string policyholderFirstName;
  private string policyholderLastName;
  private int age;
  private string smokingStatus;
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
  
  public policy(double policyNumber , string providerName , string policyholderFirstName , string policyholderLastName , int age , string smokingStatus , double height , double weight)
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
  
  public void setproviderName(string providerName)
  {
    providerName = providerName;
  }
  
  public void setpolicyholderFirstName(string policyholderFirstName)
  {
    policyholderFirstName = policyholderFirstName;
  }
  
  public void setpolicyholderLastName(string policyholderLastName)
  {
    policyholderLastName = policyholderLastName;
  }
  
  public void setage(int age)
  {
    age = age;
  }
  
  public void setsmokingStatus(string smokingStatus)
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
  
  public string providerName()
  {
    return providerName;
  }
  
  public string policyholderFirstName()
  {
    return policyholderFirstName;
  }
 
  public string policyholderLastName()
  {
    return  policyholderLastName;
  }
  
  public int age()
  {
   return age;
  }
  
  public string smokingStatus()
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
  
     
     
     
     
  