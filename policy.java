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
  
  public double getpolicyNumber()
  {
    return policyNumber;
  }
  
  public string getproviderName()
  {
    return providerName;
  }
  
  public string getpolicyholderFirstName()
  {
    return policyholderFirstName;
  }
 
  public string getpolicyholderLastName()
  {
    return  policyholderLastName;
  }
  
  public int getage()
  {
   return age;
  }
  
  public string getsmokingStatus()
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
  
  public double calculateBmi()
  {
    double BMI;
    
    BMI = (weight * 703 ) / (height * height);
    
    return BMI;
  }
  
  public double calculatePricePolicy()
  {
    final double insurancePolicy = 600;
    double additionalFee;
    int age;
    
    
    if(age > 50)
    {
      additionalFee = insurancePolicy + 75;
    }
    else if(smokingStatus = smoker)
    {
      additionalFee = insurancePolicy + 100;
    }
    else if(BMI > 35)
    {
      additionalFee = (BMI - 35) * 20;
    }
    
    return additionalFee;
  }
    
     
     
     
     
  