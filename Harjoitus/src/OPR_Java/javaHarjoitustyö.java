/** Converts centimeters to other units of measure
 * @author Aaro Tukia, Tuomas Thurï¿½n, Mika Lukkarinen
 * @version 1.2
 * @since 1.0
 * @param args array of string arguments.
 */
package OPR_Java;
import java.util.Scanner;
public class javaHarjoitustyö {

public static final Scanner lukija = new Scanner(System.in);
public static void main(String[] args) {
	
	conv conv = new conv();
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


		break;
	case 13: 
	
	
		break;
	case 14:
	
		
		break;
	case 15: 

	
		break;
	case 16: 

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
		unit2 = "meter";
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

		break;
	case 13: 

	
		break;
	case 14:

		
		break;
	case 15: 

	
		break;
	case 16: 

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
	
		//ASK USER FOR THE AMOUNT OF UNITS TO BE USED IN THE CONVERSION
		System.out.println("converting " +unit +"s"+ " to " + unit2 +"s..");
	
		System.out.println("how many " +unit+"s ?: ");
		double userInput = lukija.nextDouble();
		
		//IF STATEMENTS || MILLIMETERS || MILLIMETERS || MILLIMETERS || MILLIMETERS
		
		if (unit.equals("millimeter") && unit2.equals("centimeter")) {
			System.out.println(mmToCm(userInput));
		}
		if (unit.equals("millimeter") && unit2.equals("decimeter")) {
			System.out.println(mmToDm(userInput));
		}
		if (unit.equals("millimeter") && unit2.equals("meter")) {
			System.out.println(mmToM(userInput));
		}
		if (unit.equals("millimeter") && unit2.equals("decameter")) {
			System.out.println(mmToDam(userInput));
		}
		if (unit.equals("millimeter") && unit2.equals("hectometer")) {
			System.out.println(mmToHm(userInput));
		}
		if (unit.equals("millimeter") && unit2.equals("kilometer")) {
			System.out.println(mmToKm(userInput));
		}
		if (unit.equals("millimeter") && unit2.equals("inches")) {
			System.out.println(mmToIn(userInput));
		}
		if (unit.equals("millimeter") && unit2.equals("foot")) {
			System.out.println(mmToFt(userInput));
		}
		if (unit.equals("millimeter") && unit2.equals("yard")) {
			System.out.println(mmToYd(userInput));
		}
		if (unit.equals("millimeter") && unit2.equals("mile")) {
			System.out.println(mmToMi(userInput));
		}
		
		//IF STATEMENTS || CENTIMETERS || CENTIMETERS || CENTIMETERS || CENTIMETERS 
		if (unit.equals("centimeter") && unit2.equals("millimeter")) {
			System.out.println(cmToMm(userInput));
		}
		if (unit.equals("centimeter") && unit2.equals("decimeter")) {
			System.out.println(cmToDm(userInput));
		}
		if (unit.equals("centimeter") && unit2.equals("meter")) {
			System.out.println(cmToM(userInput));
		}
		if (unit.equals("centimeter") && unit2.equals("decameter")) {
			System.out.println(cmToDam(userInput));
		}
		if (unit.equals("centimeter") && unit2.equals("hectometer")) {
			System.out.println(cmToHm(userInput));
		}
		if (unit.equals("centimeter") && unit2.equals("kilometer")) {
			System.out.println(cmToKm(userInput));
		}
		if (unit.equals("centimeter") && unit2.equals("inches")) {
			System.out.println(cmToIn(userInput));
		}
		if (unit.equals("centimeter") && unit2.equals("foot")) {
			System.out.println(cmToFt(userInput));
		}
		if (unit.equals("centimeter") && unit2.equals("yard")) {
			System.out.println(cmToYd(userInput));
		}
		if (unit.equals("centimeter") && unit2.equals("mile")) {
			System.out.println(cmToMi(userInput));
		}
		//IF STATEMENTS || DECIMETERS || DECIMETERS || DECIMETERS || DECIMETERS
		
		
		
		else {
			System.out.println("Can't convert to that....");
		}
//		System.out.println(cmToM(userInput));
	
	}
/** Lists available units of measurement
 */
public static void listUnits() {
	//lists available units of measurement to the user
	
	System.out.println(" 1:Millimeters      8: inches          15:    \n" 
					+ " 2:Centimeters      9: foot            16:   \n"
					+ " 3:Decimeter       10: yard            17:    \n "
					+ "4:Meter           11: mile            18: \n"
					+ " 5:Decameter       12:                 19: \n "
					+ "6:Hectometer      13:                 20: \n"
					+ " 7:Kilometer       14:                 21: \n"
					+ "");
	
}

//CONVERSION METHODS || MILLIMETER CONVERSION || MILLIMETER CONVERSION || MILLIMETER CONVERSION
public static double mmToCm(double unit) { 
	double conversionMath = conv.mm_to_cm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double mmToDm(double unit) { 
	double conversionMath = conv.mm_to_dm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double mmToM(double unit) { 
	double conversionMath = conv.mm_to_m;
	double answer = unit * conversionMath;		
	return answer;
}
public static double mmToDam(double unit) { 
	double conversionMath = conv.mm_to_dam;
	double answer = unit * conversionMath;		
	return answer;
}
public static double mmToHm(double unit) { 
	double conversionMath = conv.mm_to_hm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double mmToKm(double unit) { 
	double conversionMath = conv.mm_to_km;
	double answer = unit * conversionMath;		
	return answer;
}
public static double mmToIn(double unit) { 
	double conversionMath = conv.mm_to_in;
	double answer = unit * conversionMath;		
	return answer;
}
public static double mmToFt(double unit) { 
	double conversionMath = conv.mm_to_ft;
	double answer = unit * conversionMath;		
	return answer;
}
public static double mmToYd(double unit) { 
	double conversionMath = conv.mm_to_yd;
	double answer = unit * conversionMath;		
	return answer;
}
public static double mmToMi(double unit) { 
	double conversionMath = conv.mm_to_mi;
	double answer = unit * conversionMath;		
	return answer;
}

//CONVERSION METHODS || CENTIMETER CONVERSION || CENTIMETER CONVERSION || CENTIMETER CONVERSION

public static double cmToMm(double unit) { 
	double conversionMath = conv.cm_to_mm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double cmToDm(double unit) { 
	double conversionMath = conv.cm_to_dm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double cmToM(double unit) { 
	double conversionMath = conv.cm_to_m;
	double answer = unit * conversionMath;		
	return answer;
}
public static double cmToDam(double unit) { 
	double conversionMath = conv.cm_to_dam;
	double answer = unit * conversionMath;		
	return answer;
}
public static double cmToHm(double unit) { 
	double conversionMath = conv.cm_to_hm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double cmToKm(double unit) { 
	double conversionMath = conv.cm_to_km;
	double answer = unit * conversionMath;		
	return answer;
}
public static double cmToIn(double unit) { 
	double conversionMath = conv.cm_to_in;
	double answer = unit * conversionMath;		
	return answer;
}
public static double cmToFt(double unit) { 
	double conversionMath = conv.cm_to_ft;
	double answer = unit * conversionMath;		
	return answer;
}
public static double cmToYd(double unit) { 
	double conversionMath = conv.cm_to_yd;
	double answer = unit * conversionMath;		
	return answer;
}
public static double cmToMi(double unit) { 
	double conversionMath = conv.cm_to_mi;
	double answer = unit * conversionMath;		
	return answer;
}





	/** Converts centimeters to feet
	 *  
	 * @param cm The amount of centimeters.
	 * @return	A double value representing the length in feet.
	 */
//	public static double cmToFt(double unit) { 
//		double conversionMath = conv.cm_to_ft;
//		double feet = unit * conversionMath;	
//		return feet; 
//	}
	
	

	
	
}
