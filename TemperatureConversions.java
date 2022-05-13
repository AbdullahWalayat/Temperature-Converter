import java.util.*;

class TemperatureConversions
{
  
   public static void main(String args[])
   {
       char ch;
       int tempF, tempC;
      
       Scanner sc = new Scanner(System.in);
      
       
       while(true)
       {
           
           ch = displayMenu();
          
           switch(ch)
           {
               
               case 'C':
              
                           System.out.print("\n Enter the Celsius temperature: ");
                           tempC = sc.nextInt();
                           tempF = CtoF(tempC);
                           System.out.print("\n The temperature " + tempC + " Celsius is " + tempF + " Fahrenheit. ");
                           break;
              
                             
               case 'F':  
              
                           System.out.print("\n Enter the Fahrenheit temperature: ");
                           tempF = sc.nextInt();
                           tempC = FtoC(tempF);
                           System.out.print("\n The temperature " + tempF + " Fahrenheit is " + tempC + " Celsius. ");
                           break;
              
               //Quit
               case 'Q':   return;
              
               default:   break;
           }
       }
   }
  
   
   public static char displayMenu()
   {
       Scanner sc = new Scanner(System.in);
       char ch;
      
       do
       {
           
           System.out.print("\n\n Please select one of the following: \n\t F - Fahrenheit to Celsius \n\t C - Celsius to Fahrenheit \n\t Q - Quit. \n\n\t Choice: ");
      
           
           ch = ((sc.next()).toUpperCase()).charAt(0);
          
       }while(ch != 'F' && ch != 'C' && ch != 'Q');
      
       return ch;
   }
  
   
   public static int CtoF(int c)
   {
       int tempF;
          
       //Converting temperature from Celsius to Fahrenheit
       tempF = (int)( c * (9/5.0)) + 32;
      
       return tempF;
   }
  
   
   public static int FtoC(int f)
   {
       int tempC;
      
       
       tempC = (int)(( f - 32) * (5/9.0));
      
       return tempC;
   }
}
