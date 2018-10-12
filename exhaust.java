public class exhaust
{
   String exhaustName;
   double HPOutput;

   //Accessor
   public double getExhaustHP()
   {
      //If exhaust is a Magnaflow
      if ((exhaustName.toLowerCase().contains("magna"))||(exhaustName.toLowerCase().contains("1")))
      {
         HPOutput = 35;
         return HPOutput;
      } 
      //If exhaust is a Borla
      else if ((exhaustName.toLowerCase().contains("borla"))||(exhaustName.toLowerCase().contains("2")))
      {
         HPOutput = 32;   
         return HPOutput; 
      }
      //If exhaust is a Corsa
      else if ((exhaustName.toLowerCase().contains("corsa"))||(exhaustName.toLowerCase().contains("3")))
      {
         HPOutput = 42; 
         return HPOutput; 
      }
      //If exhaust is a APEXi
      else if ((exhaustName.toLowerCase().contains("apex"))||(exhaustName.toLowerCase().contains("4")))
      {
         HPOutput = 65;  
         return HPOutput;
      }
      //Use this to input validate
      else
      {
         //Use this to Input Validate
         HPOutput = 1;
         return HPOutput;
      }  
         
   }
   
   //Constructor
   public exhaust(String exhaustInp)
   {
      exhaustName = exhaustInp;
   }
}