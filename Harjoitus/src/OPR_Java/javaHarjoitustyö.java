/** Converts centimeters to other units of measure
 * @author Aaro Tukia, Tuomas Thurèn, Mika Lukkarinen
 * @version 1.1
 * @since 1.0
 * @param args array of string arguments.
 */
package OPR_Java;
import java.util.Scanner;
public class javaHarjoitustyö {

public static final Scanner lukija = new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Converting units to other units of measurement \nGive unit type:");
	listUnits();

	//takes user input
	int input = lukija.nextInt();
	String unit = "";
	//switch1
	switch(input) {
	case 1:
		System.out.println("You chose millimeters");
		unit = "millimeters";
		
		break; 
	case 2: 
		System.out.println("You chose centimeters");
		unit = "centimeters";
		
		break;
	case 3:
		System.out.println("You chose Decimeters");
		unit = "Decimeters";
		break;
	case 4: 
		System.out.println("You chose Meters");
		unit = "Meters";
		break;
	case 5:
		System.out.println("You chose decameters");
		unit = "decameters";
		break;
	case 6: 
		System.out.println("You chose hectometers");
		unit = "hectometers";
		break;
	case 7:
		System.out.println("You chose kilometers");
		unit = "kilometers";
		break;
	case 8: 
		System.out.println("You chose inches");
		unit = "inches";
		break;
	case 9: 
		System.out.println("You chose foot");
		unit = "foot";
		break;
	case 10:
		System.out.println("You chose yard");
		unit = "yard";
		break;
	case 11: 
		System.out.println("You chose mile");
		unit = "mile";
		break;
	case 12:
		System.out.println("You chose square meter");
		unit = "Square meter";
		break;
	case 13: 
		System.out.println("You chose are");
		unit = "are";
		break;
	case 14:
		System.out.println("You chose hectare");
		unit = "hectare";
		break;
	case 15: 
		System.out.println("You chose acre");
		unit = "acre";
		break;
	case 16: 
		System.out.println("You chose square mile");
		unit = "square mile";
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
			System.out.println("You chose millimeters");
			unit2 = "millimeters";
			break; 
		case 2: 
			System.out.println("You chose centimeters");
			unit2 = "centimeters";
			break;
		case 3:
			System.out.println("You chose Ddecimeters");
			unit2 = "decimeters";
			break;
		case 4: 
			System.out.println("You chose meters");
			unit2 = "meters";
			break;
		case 5:
			System.out.println("You chose decameters");
			unit2 = "decameters";
			break;
		case 6: 
			System.out.println("You chose hectometers");
			unit2 = "hectometers";
			break;
		case 7:
			System.out.println("You chose kilometers");
			unit2 = "kilometers";
			break;
		case 8: 
			System.out.println("You chose inches");
			unit2 = "inches";
			break;
		case 9: 
			System.out.println("You chose foot");
			unit2 = "foot";
			break;
		case 10:
			System.out.println("You chose yard");
			unit2 = "yard";
			break;
		case 11: 
			System.out.println("You chose mile");
			unit2 = "mile";
			break;
		case 12:
			System.out.println("You chose square meter");
			unit2 = "Square meter";
			break;
		case 13: 
			System.out.println("You chose are");
			unit2 = "are";
			break;
		case 14:
			System.out.println("You chose hectare");
			unit2 = "hectare";
			break;
		case 15: 
			System.out.println("You chose acre");
			unit2 = "acre";
			break;
		case 16: 
			System.out.println("You chose square mile");
			unit2 = "square mile";
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
		System.out.println(unit + " to " + unit2 +" ....");
	
	}
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
