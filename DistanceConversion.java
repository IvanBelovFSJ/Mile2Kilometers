/* 
 * Edited by: Ivan Belov
 * StudentID: T00637195
 */ 
 
import java.text.DecimalFormat;
import java.util.Scanner;     // use Scanner class for console input 
 
public class DistanceConversion
{
	// Source for decimal formatting:
	// https://mkyong.com/java/java-display-double-in-2-decimal-points
	private static DecimalFormat decimalHelper = new DecimalFormat("#.##");
	static final double ML2KM = 1.60935;   // conversion factor: 1 mile ~= 1.60935 km

public static void main (String[] args)     
{         
  Scanner myScanner = new Scanner (System.in);   // create a Scanner object and attach it to System.in        
  
  double inputMiles = 0;    // this variable holds the value of miles inputted by a user. 
  double kms = 0;           // this variable holds the value of hours calculated
  double reminderKms = 0;   // this variable holds the value of minutes calculated
  
  System.out.println ("Miles to Kilometers Converter");         
  System.out.print   ("\nEnter miles to convert:");
  
  inputMiles = myScanner.nextDouble();        // get gallons from user                  
  myScanner.close();
  
    kms = inputMiles * ML2KM;    // conversion formula
    reminderKms = inputMiles % ML2KM; // getting reminder
    
    kms = kms + reminderKms;
  
  System.out.print   ("\nConverted: " + decimalHelper.format(inputMiles) + " Miles " + " = " );
  System.out.println ( decimalHelper.format(kms) + " km(s)");    // display result    
  System.out.println ( "\nThe app has closed.");
}// end of main() 
}// end of class 