public class intake
{
   String intakeName;
   double HPOutput;
   
   //Accessor
   public double getIntakeHP()
   {
      //If Intake is a Greddy
      if ((intakeName.toLowerCase().contains("eddy"))||(intakeName.toLowerCase().contains("1")))
      {
         HPOutput = 13;
         return HPOutput;
      } 
      //If intake is a APEXi
      else if ((intakeName.toLowerCase().contains("apexi"))||(intakeName.toLowerCase().contains("2")))
      {
         HPOutput = 10;   
         return HPOutput; 
      }
      //If intake is K&N
      else if ((intakeName.toLowerCase().contains("&"))||(intakeName.toLowerCase().contains("3")))
      {
         HPOutput = 15; 
         return HPOutput; 
      }
      //If intake is HKS
      else if ((intakeName.toLowerCase().contains("hks"))||(intakeName.toLowerCase().contains("4")))
      {
         HPOutput = 16;  
         return HPOutput;
      }
      else
      {
         //Use this to Input Validate
         HPOutput = 1;
         return HPOutput;
      }  
         
   }
   
   //Constructor
   public intake(String airint)
   {
      intakeName = airint;
   }
}