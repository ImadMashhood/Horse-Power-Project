//Imad, Brad, Robert 4/19/18
import java.util.Scanner;
import java.io.*;
import java.lang.Math.*;
public class HPCalc
{
   public static void main(String []args) throws IOException
   {
      //These Arrays will be used to store info on the parts
      double [] hp = new double [4];
      String [] part = new String [4];
      String [] parts = {"Intake ", "Turbo  ", "CAM    ", "Exhaust"}; 
      
      //Variables to store parts names
      String a;
      String b;
      String c;
      String d;
      
      //Variables to store parts HP 
      double intakeHP;
      double turboHP;
      double camHP;
      double exhaustHP;
      
      Scanner sc = new Scanner(System.in);
      
      //Code Assumes you have the engine this Calculator is made for
      System.out.println("Welcome to Horsepower Calculator,\nThis Calculator is created for the Nissan RB26DETT Engine.");
      
      
      //Prompts user if they want given mod or not
      System.out.println("Would you like an aftermarket Air Intake: ");
      a = sc.nextLine();
      
      //Intake
      
      while(1==1)
      {  
         //if yes
         if((a.equalsIgnoreCase("yes"))||(a.equalsIgnoreCase("y")))
         {
            //Options for said mod
            System.out.println("We have the following options which one would you like?\n1. GReddy Airinx, 2. APEXi Power,\n3. K&N, 4. HKS Super Flow");
            String airint = sc.nextLine();
            
            //Call Class
            intake intakeOne = new intake(airint);
            intakeHP = intakeOne.getIntakeHP();
            
            //Input Validation
            while(intakeHP == 1)
            {
               System.out.println("Invalid Input Please Try Again!");
               System.out.println("We have the following options which one would you like?\n1. GReddy Airinx, 2. APEXi Power,\n3. K&N, 4. HKS Super Flow");
               airint = sc.nextLine();
               intake intakeloop = new intake(airint);
               intakeHP = intakeloop.getIntakeHP();
            }
            
            //Place Info In Array
            hp[0] = intakeHP;  
            part[0] = airint;
            
            //Print Info
            System.out.println("Your Air Intake Added "+intakeHP+" Horsepower");
            break;           
        
         }
         //if no
         else if ((a.equalsIgnoreCase("no"))||(a.equalsIgnoreCase("n")))
            break;
         //if none
         else 
         {
            //Input Validation
            System.out.println("Invalid Entry Please Try Again!");
            System.out.println("Would you like an aftermarket Intake: ");
            a = sc.nextLine();  
         }
      }
      
      //Prompts user if they want part or not
      System.out.println("Would you like an aftermarket Turbo: ");
      b = sc.nextLine();
      
      //Turbo
      
      while (1==1)
      {  
         //if yes
         if((b.equalsIgnoreCase("yes"))||(b.equalsIgnoreCase("y")))
         {
            //Options for said mod
            System.out.println("We have the following options which one would you like?\n1. Precision PT58, 2. Garret GTX307,\n3. HKS 5r, 4. Ebay Turbo");
            String turboInp = sc.nextLine();
            
            //Call Class
            turbo turboOne = new turbo(turboInp);
            turboHP = turboOne.getTurboHP();
            
            //Input Validation
            while(turboHP == 1)
            {
               System.out.println("Invalid Input Please Try Again!");
               System.out.println("We have the following options which one would you like?\n1. Precision PT58, 2. Garret GTX307,\n3. HKS 5r, 4. Ebay Turbo");
               turboInp = sc.nextLine();
               turbo turboloop = new turbo(turboInp);
               turboHP = turboloop.getTurboHP();
            }
            
            //Place Info In Array
            hp[1] = turboHP;  
            part[1] = turboInp;
            
            //Print Info
            System.out.println("Your Turbo Added "+turboHP+" Horsepower");
            break;           
        
         }
         //if no
         else if ((b.equalsIgnoreCase("no"))||(b.equalsIgnoreCase("n")))
            break;
         //if none
         else 
         {
            //Input Validation
            System.out.println("Invalid Entry Please Try Again!");
            System.out.println("Would you like an Turbo: ");
            b = sc.nextLine();  
         }
      }
      
      //Prompts user if they want part or not
      System.out.println("Would you like an aftermarket CAM Shaft: ");
      c = sc.nextLine();
      
      //CAM
      
      while(1==1)
      {  
         //if yes
         if((c.equalsIgnoreCase("yes"))||(c.equalsIgnoreCase("y")))
         {
            //Options for said mod
            System.out.println("We have the following options which one would you like?\n1. HKS CAM, 2. Lunati CAM,\n3. TexasPerformance CAM, 4. ISKY CAM");
            String camInp = sc.nextLine();
            
            //Call Class
            cam camOne = new cam(camInp);
            camHP = camOne.getCamHP();
            
            //Input Validation
            while(camHP == 1)
            {
               System.out.println("Invalid Input Please Try Again!");
               System.out.println("We have the following options which one would you like?\n1. HKS CAM, 2. Lunati CAM,\n3. TexasPerformance CAM, 4. ISKY CAM");
               camInp = sc.nextLine();
               cam camloop = new cam(camInp);
               camHP = camloop.getCamHP();
            }
            
            //Place Info In Array
            hp[2] = camHP;  
            part[2] = camInp;
            
            //Print Info
            System.out.println("Your CAM Added "+camHP+" Horsepower");
            break;           
        
         }
         //if no
         else if ((c.equalsIgnoreCase("no"))||(c.equalsIgnoreCase("n")))
            break;
         //if none
         else 
         {
            //Input Validation
            System.out.println("Invalid Entry Please Try Again!");
            System.out.println("Would you like an aftermarket CAM: ");
            c = sc.nextLine();  
         }
      }
      
      //Prompts user if they want part or not
      System.out.println("Would you like an aftermarket Exhaust: ");
      d = sc.nextLine();
      
      //Exhaust
      
      while(1==1)
      {  
         //if yes
         if((d.equalsIgnoreCase("yes"))||(d.equalsIgnoreCase("y")))
         {
            //Options for said mod
            System.out.println("We have the following options which one would you like?\n1. MagnaFlow CatBack, 2. Borla,\n3. Corsa, 4. APEXi");
            String exhaustInp = sc.nextLine();
            
            //Call Class
            exhaust exhaustOne = new exhaust(exhaustInp);
            exhaustHP = exhaustOne.getExhaustHP();
            
            //Input Validation
            while(exhaustHP == 1)
            {
               System.out.println("Invalid Input Please Try Again!");
               System.out.println("We have the following options which one would you like?\n1. MagnaFlow CatBack, 2. Borla,\n3. Corsa, 4. APEXi");
               exhaustInp = sc.nextLine();
               exhaust exhaustloop = new exhaust(exhaustInp);
               exhaustHP = exhaustloop.getExhaustHP();
            }
            
            //Place Info In Array
            hp[3] = exhaustHP;  
            part[3] = exhaustInp;
            
            //Print Info
            System.out.println("Your Exhaust Added "+exhaustHP+" Horsepower");
            break;           
        
         }
         //if no
         else if ((d.equalsIgnoreCase("no"))||(d.equalsIgnoreCase("n")))
            break;
         //if none
         else 
         {
            //Input Validation
            System.out.println("Invalid Entry Please Try Again!");
            System.out.println("Would you like an aftermarket Exhaust: ");
            d = sc.nextLine();  
         }
      }
      double totalHP = hp [0] + hp [1] + hp[2] + hp[3] + 276;
      
      //MathClass
      totalHP = Math.abs(totalHP);
      
      System.out.println("\nYour engine makes a total of "+totalHP+"hp");
      System.out.println("\nCheck file location of the main to find more info on the part.");
      
      //The PrintWriter allows the code to store variables in a text file
      PrintWriter writer = new PrintWriter("HorsePowerMade");
      writer.println("  Parts           HP");
      writer.println("----------------------");
      int x = 0;
      while(x<4)
      {
         writer.println("  "+parts[x]+"        "+hp[x]);
         x+=1;
      }
      writer.println("  Stock          276.0");
      writer.println("  Total          " + totalHP);
      writer.close();
   }
}