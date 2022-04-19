/** Converts centimeters to other units of measure
 * @author Aaro Tukia
 * @version 1.0
 * @since 1.0
 * @param args array of string arguments.
 */
package OPR_Java;
import java.util.Scanner;
public class javaHarjoitustyö {

public static final Scanner lukija = new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Converting centimeters to inches and feet. \nGive centimeters:");
	double cm = lukija.nextDouble();
	System.out.println(cm + " centimeters =");
	System.out.println(cmToIn(cm) + " inches");
	System.out.println(cmToFt(cm) +" feet");
	}
	/** Converts centimeters to feet
	 *  
	 * @param cm The amount of centimeters.
	 * @return	A double value representing the length in feet.
	 */
	public static double cmToFt(double cm) { 
		double conversionMath = 30.48;
		double feet = 0;
		feet = cm / conversionMath;	
		return feet; //yes
	}
	/** Converts centimeters to inches 
	 * 
	 * @param cm The amount of centimeters
	 * @return   A double value representing the length in inches.
	 */
	public static double cmToIn(double cm) { 
		double inches = 0;
		double conversionMath = 2.54;
		inches = cm / conversionMath;		
		return inches;
	}
}
