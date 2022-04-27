/** Converts centimeters to other units of measure
 * @author Aaro Tukia, Tuomas Thurèn, Mika Lukkarinen
 * @version 1.2
 * @since 1.0
 * @param args array of string arguments.
 */
package OPR_Java;
import java.util.Scanner;
public class javaHarjoitustyö {

public static final Scanner lukija = new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Converting units to other units of measurement \nGive unit type:");
	
	//lists available units of measurement
	listUnits();
	
	//takes user input
	int input = lukija.nextInt();
	
	String unit = "";
	//switch1
	switch(input) {
	case 1:
		unit = "millimeter";
		System.out.println("You chose "+ unit);
		break; 
	case 2: 
		unit = "centimeter";
		System.out.println("You chose "+ unit);
		break;
	case 3:
		unit = "decimeter";
		System.out.println("You chose "+ unit);
	
		break;
	case 4: 
		unit = "meters";
		System.out.println("You chose "+ unit);

		break;
	case 5:
		unit = "decameters";
		System.out.println("You chose "+ unit);

		break;
	case 6: 
		unit = "hectometers";
		System.out.println("You chose "+ unit);

		break;
	case 7:
		unit = "kilometers";
		System.out.println("You chose "+ unit);
	
		break;
	case 8: 
		unit = "inches";
		System.out.println("You chose "+ unit);

		break;
	case 9: 
		unit = "foot";
		System.out.println("You chose "+ unit);
	
		break;
	case 10:
		unit = "yard";
		System.out.println("You chose "+ unit);
	
		break;
	case 11: 
		unit = "mile";
		System.out.println("You chose "+ unit);
	
		break;
	case 12:
		unit = "Square meter";
		System.out.println("You chose "+ unit);

		break;
	case 13: 
		unit = "are";
		System.out.println("You chose "+ unit);
	
		break;
	case 14:
		unit = "hectare";
		System.out.println("You chose "+ unit);
		
		break;
	case 15: 
		unit = "acre";
		System.out.println("You chose "+ unit);
		
		break;
	case 16: 
		unit = "square mile";
		System.out.println("You chose "+ unit);
		break;
	case 17:
		//ASD
		break;
	case 18: 
		//asd
		break;
	case 19:
		//ASD
		break;
	case 20: 
		//asd
		break;
	case 21:
		//ASD
		break;
	}
	
	listUnits();
	System.out.println(unit + "s to?:  ");
	//takes the second user input
	int input2 = lukija.nextInt();
	String unit2 = "";
	//switch2
	switch(input2) {
	case 1:
		unit2 = "millimeter";
		System.out.println("You chose "+ unit2);
		break; 
	case 2: 
		unit2 = "centimeter";
		System.out.println("You chose "+ unit2);
		break;
	case 3:
		unit2 = "decimeter";
		System.out.println("You chose "+ unit2);
	
		break;
	case 4: 
		unit2 = "meters";
		System.out.println("You chose "+ unit2);

		break;
	case 5:
		unit2 = "decameter";
		System.out.println("You chose "+ unit2);

		break;
	case 6: 
		unit2 = "hectometer";
		System.out.println("You chose "+ unit2);

		break;
	case 7:
		unit2 = "kilometer";
		System.out.println("You chose "+ unit2);
	
		break;
	case 8: 
		unit2 = "inches";
		System.out.println("You chose "+ unit2);

		break;
	case 9: 
		unit2 = "foot";
		System.out.println("You chose "+ unit2);
	
		break;
	case 10:
		unit2 = "yard";
		System.out.println("You chose "+ unit2);
	
		break;
	case 11: 
		unit2 = "mile";
		System.out.println("You chose "+ unit2);
	
		break;
	case 12:
		unit2 = "Square meter";
		System.out.println("You chose "+ unit2);

		break;
	case 13: 
		unit2 = "are";
		System.out.println("You chose "+ unit2);
	
		break;
	case 14:
		unit2 = "hectare";
		System.out.println("You chose "+ unit2);
		
		break;
	case 15: 
		unit2 = "acre";
		System.out.println("You chose "+ unit2);
	
		break;
	case 16: 
		unit2 = "square mile";
		System.out.println("You chose "+ unit2);
		break;
	case 17:
		//ASD
		break;
	case 18: 
		//asd
		break;
	case 19:
		//ASD
		break;
	case 20: 
		//asd
		break;
	case 21:
		//ASD
		break;
	}
		System.out.println("converting " + unit + " to " + unit2 +"s..");	
	}
/** Lists available units of measurement
 */
public static void listUnits() {
	//lists available units of measurement to the user
	
	System.out.println(" 1:Millimeters      8: inches          15:   acre \n" 
					+ " 2:Centimeters      9: foot            16:   square mile\n"
					+ " 3:Decimeter       10: yard            17:    \n "
					+ "4:Meter           11: mile            18: \n"
					+ " 5:Decameter       12: square meter    19: \n "
					+ "6:Hectometer      13: are             20: \n"
					+ " 7:Kilometer       14: hectare         21: \n"
					+ "");
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
		return feet; 
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
