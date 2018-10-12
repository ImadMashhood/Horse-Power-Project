public class turbo
{
   String turboName;
   double HPOutput;
   
   //Accessor
   public double getTurboHP()
   {
      //If turbo is a Precision Turbo
      if ((turboName.toLowerCase().contains("pre"))||(turboName.toLowerCase().contains("1")))
      {
         HPOutput = 85;
         return HPOutput;
      } 
      //If turbo is a Garrett Turbo
      else if ((turboName.toLowerCase().contains("gar"))||(turboName.toLowerCase().contains("2")))
      {
         HPOutput = 105;   
         return HPOutput; 
      }
      //If turbo is a HKS Turbo
      else if ((turboName.toLowerCase().contains("hks"))||(turboName.toLowerCase().contains("3")))
      {
         HPOutput = 97; 
         return HPOutput; 
      }
      //If turbo is a Ebay Turbo
      else if ((turboName.toLowerCase().contains("bay"))||(turboName.toLowerCase().contains("4")))
      {
         HPOutput = 65;  
         return HPOutput;
      }
      //Use this for input validation
      else
      {
         HPOutput = 1;
         return HPOutput;
      }  
         
   }
   
   //Constructor
   public turbo(String turboInp)
   {
      turboName = turboInp;
   }
}