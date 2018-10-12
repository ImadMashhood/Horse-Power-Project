public class cam
{
   String camName;
   double HPOutput;

   //Accessor
   public double getCamHP()
   {
      //If cam is a HKS
      if ((camName.toLowerCase().contains("hks"))||(camName.toLowerCase().contains("1")))
      {
         HPOutput = 65;
         return HPOutput;
      } 
      //If cam is a Lunati
      else if ((camName.toLowerCase().contains("lunati"))||(camName.toLowerCase().contains("2")))
      {
         HPOutput = 57;   
         return HPOutput; 
      }
      //If cam is a Texas Performance
      else if ((camName.toLowerCase().contains("texas"))||(camName.toLowerCase().contains("3")))
      {
         HPOutput = 100; 
         return HPOutput; 
      }
      //If cam is a ISKY
      else if ((camName.toLowerCase().contains("isky"))||(camName.toLowerCase().contains("4")))
      {
         HPOutput = 75;  
         return HPOutput;
      }
      //Use for Input Validation
      else
      {
         //Use this to Input Validate
         HPOutput = 1;
         return HPOutput;
      }  
         
   }
   
   //Constructor
   public cam(String camInp)
   {
      camName = camInp;
   }
}