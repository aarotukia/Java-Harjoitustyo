/** Converts centimeters to other units of measure
 * @author Aaro Tukia, Tuomas Thuren, Mika Lukkarinen
 * @version 1.3
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
	
	//empty string to store corresponding string from input
	String unit = "";
	
	
	//SWITCH #1  ||  Determine what is being converted 
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
	//lists available units
	listUnits();
	
	//asks user what to convert first unit to
	System.out.println(unit + "s to?:  ");
	
	//takes the second user input
	int input2 = lukija.nextInt();
	
	//empty string used to store corresponding string from input
	String unit2 = "";
	
	
	//SWITCH #2   || DETERMINE UNIT 2
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
		
		if (unit.equals("decimeter") && unit2.equals("millimeter")) {
			System.out.println(dmToMm(userInput));
		}
		if (unit.equals("decimeter") && unit2.equals("centimeter")) {
			System.out.println(dmToCm(userInput));
		}
		if (unit.equals("decimeter") && unit2.equals("meter")) {
			System.out.println(dmToM(userInput));
		}
		if (unit.equals("decimeter") && unit2.equals("decameter")) {
			System.out.println(dmToDam(userInput));
		}
		if (unit.equals("decimeter") && unit2.equals("hectometer")) {
			System.out.println(dmToHm(userInput));
		}
		if (unit.equals("decimeter") && unit2.equals("kilometer")) {
			System.out.println(dmToKm(userInput));
		}
		if (unit.equals("decimeter") && unit2.equals("inches")) {
			System.out.println(dmToIn(userInput));
		}
		if (unit.equals("decimeter") && unit2.equals("foot")) {
			System.out.println(dmToFt(userInput));
		}
		if (unit.equals("decimeter") && unit2.equals("yard")) {
			System.out.println(dmToYd(userInput));
		}
		if (unit.equals("decimeter") && unit2.equals("mile")) {
			System.out.println(dmToMi(userInput));
		}
		//IF STATEMENTS || METERS || METERS || METERS || METERS 
		
		if (unit.equals("meter") && unit2.equals("millimeter")) {
			System.out.println(mToMm(userInput));
		}
		if (unit.equals("meter") && unit2.equals("centimeter")) {
			System.out.println(mToCm(userInput));
		}
		if (unit.equals("meter") && unit2.equals("decimeter")) {
			System.out.println(mToDm(userInput));
		}
		if (unit.equals("meter") && unit2.equals("decameter")) {
			System.out.println(mToDam(userInput));
		}
		if (unit.equals("meter") && unit2.equals("hectometer")) {
			System.out.println(mToHm(userInput));
		}
		if (unit.equals("meter") && unit2.equals("kilometer")) {
			System.out.println(mToKm(userInput));
		}
		if (unit.equals("meter") && unit2.equals("inches")) {
			System.out.println(mToIn(userInput));
		}
		if (unit.equals("meter") && unit2.equals("foot")) {
			System.out.println(mToFt(userInput));
		}
		if (unit.equals("meter") && unit2.equals("yard")) {
			System.out.println(mToYd(userInput));
		}
		if (unit.equals("meter") && unit2.equals("mile")) {
			System.out.println(mToMi(userInput));
		}
		else {
			System.out.println("Can't convert to that....");
		}
//		System.out.println(cmToM(userInput)); 
	
	}

/** Void method used to list available units of measurement to the user  */
public static void listUnits() {
	
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

//CONVERSION METHODS || DECIMETER CONVERSION || DECIMETER CONVERSION || DECIMETER CONVERSION

public static double dmToMm(double unit) { 
	double conversionMath = conv.dm_to_mm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double dmToCm(double unit) { 
	double conversionMath = conv.dm_to_cm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double dmToM(double unit) { 
	double conversionMath = conv.dm_to_m;
	double answer = unit * conversionMath;		
	return answer;
}
public static double dmToDam(double unit) { 
	double conversionMath = conv.dm_to_dam;
	double answer = unit * conversionMath;		
	return answer;
}
public static double dmToHm(double unit) { 
	double conversionMath = conv.dm_to_hm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double dmToKm(double unit) { 
	double conversionMath = conv.dm_to_km;
	double answer = unit * conversionMath;		
	return answer;
}
public static double dmToIn(double unit) { 
	double conversionMath = conv.dm_to_in;
	double answer = unit * conversionMath;		
	return answer;
}
public static double dmToFt(double unit) { 
	double conversionMath = conv.dm_to_ft;
	double answer = unit * conversionMath;		
	return answer;
}
public static double dmToYd(double unit) { 
	double conversionMath = conv.dm_to_yd;
	double answer = unit * conversionMath;		
	return answer;
}
public static double dmToMi(double unit) { 
	double conversionMath = conv.dm_to_mi;
	double answer = unit * conversionMath;		
	return answer;
}

//CONVERSION METHODS || METER CONVERSION || METER CONVERSION || METER CONVERSION

public static double mToMm(double unit) { 
	double conversionMath = conv.m_to_mm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double mToCm(double unit) { 
	double conversionMath = conv.m_to_cm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double mToDm(double unit) { 
	double conversionMath = conv.m_to_dm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double mToDam(double unit) { 
	double conversionMath = conv.m_to_dam;
	double answer = unit * conversionMath;		
	return answer;
}
public static double mToHm(double unit) { 
	double conversionMath = conv.m_to_hm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double mToKm(double unit) { 
	double conversionMath = conv.m_to_km;
	double answer = unit * conversionMath;		
	return answer;
}
public static double mToIn(double unit) { 
	double conversionMath = conv.m_to_in;
	double answer = unit * conversionMath;		
	return answer;
}
public static double mToFt(double unit) { 
	double conversionMath = conv.m_to_ft;
	double answer = unit * conversionMath;		
	return answer;
}
public static double mToYd(double unit) { 
	double conversionMath = conv.m_to_yd;
	double answer = unit * conversionMath;		
	return answer;
}
public static double mToMi(double unit) { 
	double conversionMath = conv.m_to_mi;
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
