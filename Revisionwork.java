import java.util.Scanner;
/**
 * @author User
 *
 */
public class Revisionwork {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner mykeyboard = new Scanner(System.in);
     
     double num1;
     double num2;
     double num3;
     double num4;
     int reply;
     
     double sum;
     double average;
     
     do{
    	
     
     
     System.out.println("Enter number1: ");
     num1 = mykeyboard.nextDouble();
     
     System.out.println("Enter num2: ");
      num2 = mykeyboard.nextDouble();
     
     System.out.println("Enter num3: ");
      num3 = mykeyboard.nextDouble();
     
     System.out.println("Enter num4: ");
      num4 = mykeyboard.nextDouble();
     
      sum = (num1 + num2 + num3 +num4);
     
      average=(sum/4);
      
      
      System.out.println("The average is "+ average);
      
      do {
    	  
      
      System.out.println("Choose 1 to continue or 2 to exit");
      System.out.println("Enter your desicion: ");
      reply = mykeyboard.nextInt();
      
      if (reply != 1 && reply != 2){
    	  
    	  System.out.println("Invalid decision,enter again");
    	  
      }
      
      }while(reply != 1 && reply != 2 );
      
      
      if (reply == 2) {
    	  System.out.println("You are exiting the program");
      }
      
     }while(reply == 1);
      
      
      
	} 
     
	}


