/** Converts centimeters to other units of measure
 * @author Aaro Tukia, Tuomas Thuren, Mika Lukkarinen
 * @version 1.4
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
		unit = "meter";
		System.out.println("You chose "+ unit);

		break;
	case 5:
		unit = "decameter";
		System.out.println("You chose "+ unit);

		break;
	case 6: 
		unit = "hectometer";
		System.out.println("You chose "+ unit);

		break;
	case 7:
		unit = "kilometer";
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
		else if (unit.equals("millimeter") && unit2.equals("decimeter")) {
			System.out.println(mmToDm(userInput));
		}
		else if (unit.equals("millimeter") && unit2.equals("meter")) {
			System.out.println(mmToM(userInput));
		}
		else if (unit.equals("millimeter") && unit2.equals("decameter")) {
			System.out.println(mmToDam(userInput));
		}
		else if (unit.equals("millimeter") && unit2.equals("hectometer")) {
			System.out.println(mmToHm(userInput));
		}
		else if (unit.equals("millimeter") && unit2.equals("kilometer")) {
			System.out.println(mmToKm(userInput));
		}
		else if (unit.equals("millimeter") && unit2.equals("inches")) {
			System.out.println(mmToIn(userInput));
		}
		else if (unit.equals("millimeter") && unit2.equals("foot")) {
			System.out.println(mmToFt(userInput));
		}
		else if (unit.equals("millimeter") && unit2.equals("yard")) {
			System.out.println(mmToYd(userInput));
		}
		else if (unit.equals("millimeter") && unit2.equals("mile")) {
			System.out.println(mmToMi(userInput));
		}
		
		//IF STATEMENTS || CENTIMETERS || CENTIMETERS || CENTIMETERS || CENTIMETERS 
		else if (unit.equals("centimeter") && unit2.equals("millimeter")) {
			System.out.println(cmToMm(userInput));
		}
		else if (unit.equals("centimeter") && unit2.equals("decimeter")) {
			System.out.println(cmToDm(userInput));
		}
		else if (unit.equals("centimeter") && unit2.equals("meter")) {
			System.out.println(cmToM(userInput));
		}
		else if (unit.equals("centimeter") && unit2.equals("decameter")) {
			System.out.println(cmToDam(userInput));
		}
		else if (unit.equals("centimeter") && unit2.equals("hectometer")) {
			System.out.println(cmToHm(userInput));
		}
		else if (unit.equals("centimeter") && unit2.equals("kilometer")) {
			System.out.println(cmToKm(userInput));
		}
		else if (unit.equals("centimeter") && unit2.equals("inches")) {
			System.out.println(cmToIn(userInput));
		}
		else if (unit.equals("centimeter") && unit2.equals("foot")) {
			System.out.println(cmToFt(userInput));
		}
		else if (unit.equals("centimeter") && unit2.equals("yard")) {
			System.out.println(cmToYd(userInput));
		}
		else if (unit.equals("centimeter") && unit2.equals("mile")) {
			System.out.println(cmToMi(userInput));
		}
		//IF STATEMENTS || DECIMETERS || DECIMETERS || DECIMETERS || DECIMETERS
		
		else if (unit.equals("decimeter") && unit2.equals("millimeter")) {
			System.out.println(dmToMm(userInput));
		}
		else if (unit.equals("decimeter") && unit2.equals("centimeter")) {
			System.out.println(dmToCm(userInput));
		}
		else if (unit.equals("decimeter") && unit2.equals("meter")) {
			System.out.println(dmToM(userInput));
		}
		else if (unit.equals("decimeter") && unit2.equals("decameter")) {
			System.out.println(dmToDam(userInput));
		}
		else if (unit.equals("decimeter") && unit2.equals("hectometer")) {
			System.out.println(dmToHm(userInput));
		}
		else if (unit.equals("decimeter") && unit2.equals("kilometer")) {
			System.out.println(dmToKm(userInput));
		}
		else if (unit.equals("decimeter") && unit2.equals("inches")) {
			System.out.println(dmToIn(userInput));
		}
		else if (unit.equals("decimeter") && unit2.equals("foot")) {
			System.out.println(dmToFt(userInput));
		}
		else if (unit.equals("decimeter") && unit2.equals("yard")) {
			System.out.println(dmToYd(userInput));
		}
		else if (unit.equals("decimeter") && unit2.equals("mile")) {
			System.out.println(dmToMi(userInput));
		}
		//IF STATEMENTS || METERS || METERS || METERS || METERS 
		
		else if (unit.equals("meter") && unit2.equals("millimeter")) {
			System.out.println(mToMm(userInput));
		}
		else if (unit.equals("meter") && unit2.equals("centimeter")) {
			System.out.println(mToCm(userInput));
		}
		else if (unit.equals("meter") && unit2.equals("decimeter")) {
			System.out.println(mToDm(userInput));
		}
		else if (unit.equals("meter") && unit2.equals("decameter")) {
			System.out.println(mToDam(userInput));
		}
		else if (unit.equals("meter") && unit2.equals("hectometer")) {
			System.out.println(mToHm(userInput));
		}
		else if (unit.equals("meter") && unit2.equals("kilometer")) {
			System.out.println(mToKm(userInput));
		}
		else if (unit.equals("meter") && unit2.equals("inches")) {
			System.out.println(mToIn(userInput));
		}
		else if (unit.equals("meter") && unit2.equals("foot")) {
			System.out.println(mToFt(userInput));
		}
		else if (unit.equals("meter") && unit2.equals("yard")) {
			System.out.println(mToYd(userInput));
		}
		else if (unit.equals("meter") && unit2.equals("mile")) {
			System.out.println(mToMi(userInput));
		}
		//IF STATEMENTS || DECAMETERS || DECAMETERS || DECAMETERS || DECAMETERS 
		else if (unit.equals("decameter") && unit2.equals("millimeter")) {
			System.out.println(damToMm(userInput));
		}
		else if (unit.equals("decameter") && unit2.equals("centimeter")) {
			System.out.println(damToCm(userInput));
		}
		else if (unit.equals("decameter") && unit2.equals("decimeter")) {
			System.out.println(damToDm(userInput));
		}
		else if (unit.equals("decameter") && unit2.equals("meter")) {
			System.out.println(damToM(userInput));
		}
		else if (unit.equals("decameter") && unit2.equals("hectometer")) {
			System.out.println(damToHm(userInput));
		}
		else if (unit.equals("decameter") && unit2.equals("kilometer")) {
			System.out.println(damToKm(userInput));
		}
		else if (unit.equals("decameter") && unit2.equals("inches")) {
			System.out.println(damToIn(userInput));
		}
		else if (unit.equals("decameter") && unit2.equals("foot")) {
			System.out.println(damToFt(userInput));
		}
		else if (unit.equals("decameter") && unit2.equals("yard")) {
			System.out.println(damToYd(userInput));
		}
		else if (unit.equals("decameter") && unit2.equals("mile")) {
			System.out.println(damToMi(userInput));
		}
		
		//IF STATEMENTS || HECTOMETERS || HECTOMETERS || HECTOMETERS || HECTOMETERS
		
		else if (unit.equals("hectometer") && unit2.equals("millimeter")) {
			System.out.println(hmToMm(userInput));
		}
		else if (unit.equals("hectometer") && unit2.equals("centimeter")) {
			System.out.println(hmToCm(userInput));
		}
		else if (unit.equals("hectometer") && unit2.equals("decimeter")) {
			System.out.println(hmToDm(userInput));
		}
		else if (unit.equals("hectometer") && unit2.equals("meter")) {
			System.out.println(hmToM(userInput));
		}
		else if (unit.equals("hectometer") && unit2.equals("decameter")) {
			System.out.println(hmToDam(userInput));
		}
		else if (unit.equals("hectometer") && unit2.equals("kilometer")) {
			System.out.println(hmToKm(userInput));
		}
		else if (unit.equals("hectometer") && unit2.equals("inches")) {
			System.out.println(hmToIn(userInput));
		}
		else if (unit.equals("hectometer") && unit2.equals("foot")) {
			System.out.println(hmToFt(userInput));
		}
		else if (unit.equals("hectometer") && unit2.equals("yard")) {
			System.out.println(hmToYd(userInput));
		}
		else if (unit.equals("hectometer") && unit2.equals("mile")) {
			System.out.println(hmToMi(userInput));
		}
		//IF STATEMENTS || KILOMETERS || KILOMETERS || KILOMETERS || KILOMETERS
		else if (unit.equals("kilometer") && unit2.equals("millimeter")) {
			System.out.println(kmToMm(userInput));
		}
		else if (unit.equals("kilometer") && unit2.equals("centimeter")) {
			System.out.println(kmToCm(userInput));
		}
		else if (unit.equals("kilometer") && unit2.equals("decimeter")) {
			System.out.println(kmToDm(userInput));
		}
		else if (unit.equals("kilometer") && unit2.equals("meter")) {
			System.out.println(kmToM(userInput));
		}
		else if (unit.equals("kilometer") && unit2.equals("decameter")) {
			System.out.println(kmToDam(userInput));
		}
		else if (unit.equals("kilometer") && unit2.equals("hectometer")) {
			System.out.println(kmToHm(userInput));
		}
		else if (unit.equals("kilometer") && unit2.equals("inches")) {
			System.out.println(kmToIn(userInput));
		}
		else if (unit.equals("kilometer") && unit2.equals("foot")) {
			System.out.println(kmToFt(userInput));
		}
		else if (unit.equals("kilometer") && unit2.equals("yard")) {
			System.out.println(kmToYd(userInput));
		}
		else if (unit.equals("kilometer") && unit2.equals("mile")) {
			System.out.println(kmToMi(userInput));
		}
		//IF STATEMENTS || INCHES || INCHES || INCHES || INCHES
		else if (unit.equals("inches") && unit2.equals("millimeter")) {
			System.out.println(inToMm(userInput));
		}
		else if (unit.equals("inches") && unit2.equals("centimeter")) {
			System.out.println(inToCm(userInput));
		}
		else if (unit.equals("inches") && unit2.equals("decimeter")) {
			System.out.println(inToDm(userInput));
		}
		else if (unit.equals("inches") && unit2.equals("meter")) {
			System.out.println(inToM(userInput));
		}
		else if (unit.equals("inches") && unit2.equals("decameter")) {
			System.out.println(inToDam(userInput));
		}
		else if (unit.equals("inches") && unit2.equals("hectometer")) {
			System.out.println(inToHm(userInput));
		}
		else if (unit.equals("inches") && unit2.equals("foot")) {
			System.out.println(inToFt(userInput));
		}
		else if (unit.equals("inches") && unit2.equals("yard")) {
			System.out.println(inToYd(userInput));
		}
		else if (unit.equals("inches") && unit2.equals("mile")) {
			System.out.println(inToMi(userInput));
		}
		
		//IF STATEMENTS || FOOT || FOOT || FOOT || FOOT
		
		else if (unit.equals("foot") && unit2.equals("millimeter")) {
			System.out.println(ftToMm(userInput));
		}
		else if (unit.equals("foot") && unit2.equals("centimeter")) {
			System.out.println(ftToCm(userInput));
		}
		else if (unit.equals("foot") && unit2.equals("decimeter")) {
			System.out.println(ftToDm(userInput));
		}
		else if (unit.equals("foot") && unit2.equals("meter")) {
			System.out.println(ftToM(userInput));
		}
		else if (unit.equals("foot") && unit2.equals("decameter")) {
			System.out.println(ftToDam(userInput));
		}
		else if (unit.equals("foot") && unit2.equals("hectometer")) {
			System.out.println(ftToHm(userInput));
		}
		else if (unit.equals("foot") && unit2.equals("inches")) {
			System.out.println(ftToIn(userInput));
		}
		else if (unit.equals("foot") && unit2.equals("yard")) {
			System.out.println(ftToYd(userInput));
		}
		else if (unit.equals("foot") && unit2.equals("mile")) {
			System.out.println(ftToMi(userInput));
		}
		
		//IF STATEMENTS || YARD || YARD || YARD || YARD || YARD || YARD 
		
		else if (unit.equals("yard") && unit2.equals("millimeter")) {
			System.out.println(ydToMm(userInput));
		}
		else if (unit.equals("yard") && unit2.equals("centimeter")) {
			System.out.println(ydToCm(userInput));
		}
		else if (unit.equals("yard") && unit2.equals("decimeter")) {
			System.out.println(ydToDm(userInput));
		}
		else if (unit.equals("yard") && unit2.equals("meter")) {
			System.out.println(ydToM(userInput));
		}
		else if (unit.equals("yard") && unit2.equals("decameter")) {
			System.out.println(ydToDam(userInput));
		}
		else if (unit.equals("yard") && unit2.equals("hectometer")) {
			System.out.println(ydToHm(userInput));
		}
		else if (unit.equals("yard") && unit2.equals("kilometer")) {
			System.out.println(ydToKm(userInput));
		}
		else if (unit.equals("yard") && unit2.equals("inches")) {
			System.out.println(ydToIn(userInput));
		}
		else if (unit.equals("yard") && unit2.equals("foot")) {
			System.out.println(ydToFt(userInput));
		}
		else if (unit.equals("yard") && unit2.equals("mile")) {
			System.out.println(ydToMi(userInput));
		}
		
		//IF STATEMENTS || MILE || MILE || MILE || MILE || MILE || MILE || MILE 
		
		else if (unit.equals("mile") && unit2.equals("millimeter")) {
			System.out.println(miToMm(userInput));
		}
		else if (unit.equals("mile") && unit2.equals("centimeter")) {
			System.out.println(miToCm(userInput));
		}
		else if (unit.equals("mile") && unit2.equals("decimeter")) {
			System.out.println(miToDm(userInput));
		}
		else if (unit.equals("mile") && unit2.equals("meter")) {
			System.out.println(miToM(userInput));
		}
		else if (unit.equals("mile") && unit2.equals("decameter")) {
			System.out.println(miToDam(userInput));
		}
		else if (unit.equals("mile") && unit2.equals("hectometer")) {
			System.out.println(miToHm(userInput));
		}
		else if (unit.equals("mile") && unit2.equals("kilometer")) {
			System.out.println(miToKm(userInput));
		}
		else if (unit.equals("mile") && unit2.equals("inches")) {
			System.out.println(miToIn(userInput));
		}
		else if (unit.equals("mile") && unit2.equals("foot")) {
			System.out.println(miToFt(userInput));
		}
		else if (unit.equals("mile") && unit2.equals("yard")) {
			System.out.println(miToYd(userInput));
		}
	
		else {
			System.out.println("Can't convert to that....");
		}
	
	}

/* Void method that lists available units of measurement for the user */

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
/* CONVERSION METHODS || MILLIMETERS  || MILLIMETERS || MILLIMETERS || MILLIMETERS  */


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

/* CONVERSION METHODS || CENTIMETERS || CENTIMETERS || CENTIMETERS || CENTIMETERS  */



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

/* CONVERSION METHODS || DECIMETERS || DECIMETERS || DECIMETERS || DECIMETERS  */


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

/* CONVERSION METHODS || METERS || METERS || METERS || METERS */


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

/* CONVERSION METHODS || DECAMETERS || DECAMETERS || DECAMETERS || DECAMETERS */



//CONVERSION METHODS || DECAMETER CONVERSION || DECAMETER CONVERSION || DECAMETER CONVERSION

public static double damToMm(double unit) { 
	double conversionMath = conv.dam_to_mm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double damToCm(double unit) { 
	double conversionMath = conv.dam_to_cm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double damToDm(double unit) { 
	double conversionMath = conv.dam_to_dm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double damToM(double unit) { 
	double conversionMath = conv.dam_to_m;
	double answer = unit * conversionMath;		
	return answer;
}
public static double damToHm(double unit) { 
	double conversionMath = conv.dam_to_hm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double damToKm(double unit) { 
	double conversionMath = conv.dam_to_km;
	double answer = unit * conversionMath;		
	return answer;
}
public static double damToIn(double unit) { 
	double conversionMath = conv.dam_to_in;
	double answer = unit * conversionMath;		
	return answer;
}
public static double damToFt(double unit) { 
	double conversionMath = conv.dam_to_ft;
	double answer = unit * conversionMath;		
	return answer;
}
public static double damToYd(double unit) { 
	double conversionMath = conv.dam_to_yd;
	double answer = unit * conversionMath;		
	return answer;
}
public static double damToMi(double unit) { 
	double conversionMath = conv.dam_to_mi;
	double answer = unit * conversionMath;		
	return answer;
}

/* CONVERSION METHODS || HECTOMETERS || HECTOMETERS  || HECTOMETERS || HECTOMETERS  */


//CONVERSION METHODS || HECTOMETER CONVERSION || HECTOMETER CONVERSION || HECTOMETER CONVERSION

public static double hmToMm(double unit) { 
	double conversionMath = conv.hm_to_mm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double hmToCm(double unit) { 
	double conversionMath = conv.hm_to_cm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double hmToDm(double unit) { 
	double conversionMath = conv.hm_to_dm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double hmToM(double unit) { 
	double conversionMath = conv.hm_to_m;
	double answer = unit * conversionMath;		
	return answer;
}
public static double hmToDam(double unit) { 
	double conversionMath = conv.hm_to_dam;
	double answer = unit * conversionMath;		
	return answer;
}
public static double hmToKm(double unit) { 
	double conversionMath = conv.hm_to_km;
	double answer = unit * conversionMath;		
	return answer;
}
public static double hmToIn(double unit) { 
	double conversionMath = conv.hm_to_in;
	double answer = unit * conversionMath;		
	return answer;
}
public static double hmToFt(double unit) { 
	double conversionMath = conv.hm_to_ft;
	double answer = unit * conversionMath;		
	return answer;
}
public static double hmToYd(double unit) { 
	double conversionMath = conv.hm_to_yd;
	double answer = unit * conversionMath;		
	return answer;
}
public static double hmToMi(double unit) { 
	double conversionMath = conv.hm_to_mi;
	double answer = unit * conversionMath;		
	return answer;
}

/* CONVERSION METHODS || KILOMETERS ||KILOMETERS || KILOMETERS || KILOMETERS  */


//CONVERSION METHODS || KILOMETER CONVERSION || KILOMETER CONVERSION || KILOMETER CONVERSION

public static double kmToMm(double unit) { 
	double conversionMath = conv.km_to_mm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double kmToCm(double unit) { 
	double conversionMath = conv.km_to_cm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double kmToDm(double unit) { 
	double conversionMath = conv.km_to_dm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double kmToM(double unit) { 
	double conversionMath = conv.km_to_m;
	double answer = unit * conversionMath;		
	return answer;
}
public static double kmToDam(double unit) { 
	double conversionMath = conv.km_to_dam;
	double answer = unit * conversionMath;		
	return answer;
}
public static double kmToHm(double unit) { 
	double conversionMath = conv.km_to_hm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double kmToIn(double unit) { 
	double conversionMath = conv.km_to_in;
	double answer = unit * conversionMath;		
	return answer;
}
public static double kmToFt(double unit) { 
	double conversionMath = conv.km_to_ft;
	double answer = unit * conversionMath;		
	return answer;
}
public static double kmToYd(double unit) { 
	double conversionMath = conv.km_to_yd;
	double answer = unit * conversionMath;		
	return answer;
}
public static double kmToMi(double unit) { 
	double conversionMath = conv.km_to_mi;
	double answer = unit * conversionMath;		
	return answer;
}

/* CONVERSION METHODS || INCHES || INCHES|| INCHES|| INCHES */


//CONVERSION METHODS || INCHES CONVERSION || INCHES CONVERSION || INCHES CONVERSION
public static double inToMm(double unit) { 
	double conversionMath = conv.in_to_mm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double inToCm(double unit) { 
	double conversionMath = conv.in_to_cm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double inToDm(double unit) { 
	double conversionMath = conv.in_to_dm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double inToM(double unit) { 
	double conversionMath = conv.in_to_m;
	double answer = unit * conversionMath;		
	return answer;
}
public static double inToDam(double unit) { 
	double conversionMath = conv.in_to_dam;
	double answer = unit * conversionMath;		
	return answer;
}
public static double inToHm(double unit) { 
	double conversionMath = conv.in_to_hm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double inToKm(double unit) { 
	double conversionMath = conv.in_to_km;
	double answer = unit * conversionMath;		
	return answer;
}
public static double inToFt(double unit) { 
	double conversionMath = conv.in_to_ft;
	double answer = unit * conversionMath;		
	return answer;
}
public static double inToYd(double unit) { 
	double conversionMath = conv.in_to_yd;
	double answer = unit * conversionMath;		
	return answer;
}
public static double inToMi(double unit) { 
	double conversionMath = conv.in_to_mi;
	double answer = unit * conversionMath;		
	return answer;
}

/* CONVERSION METHODS || FEET || FEET || FEET || FEET || FEET || FEET */

public static double ftToMm(double unit) { 
	double conversionMath = conv.ft_to_mm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double ftToCm(double unit) { 
	double conversionMath = conv.ft_to_cm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double ftToDm(double unit) { 
	double conversionMath = conv.ft_to_dm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double ftToM(double unit) { 
	double conversionMath = conv.ft_to_m;
	double answer = unit * conversionMath;		
	return answer;
}
public static double ftToDam(double unit) { 
	double conversionMath = conv.ft_to_dam;
	double answer = unit * conversionMath;		
	return answer;
}
public static double ftToHm(double unit) { 
	double conversionMath = conv.ft_to_hm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double ftToKm(double unit) { 
	double conversionMath = conv.ft_to_km;
	double answer = unit * conversionMath;		
	return answer;
}
public static double ftToIn(double unit) { 
	double conversionMath = conv.ft_to_in;
	double answer = unit * conversionMath;		
	return answer;
}
public static double ftToYd(double unit) { 
	double conversionMath = conv.ft_to_yd;
	double answer = unit * conversionMath;		
	return answer;
}
public static double ftToMi(double unit) { 
	double conversionMath = conv.ft_to_mi;
	double answer = unit * conversionMath;		
	return answer;
}

/* CONVERSION METHODS || YARD || YARD || YARD || YARD|| YARD || YARD*/

public static double ydToMm(double unit) { 
	double conversionMath = conv.yd_to_mm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double ydToCm(double unit) { 
	double conversionMath = conv.yd_to_cm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double ydToDm(double unit) { 
	double conversionMath = conv.yd_to_dm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double ydToM(double unit) { 
	double conversionMath = conv.yd_to_m;
	double answer = unit * conversionMath;		
	return answer;
}
public static double ydToDam(double unit) { 
	double conversionMath = conv.yd_to_dam;
	double answer = unit * conversionMath;		
	return answer;
}
public static double ydToHm(double unit) { 
	double conversionMath = conv.yd_to_hm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double ydToKm(double unit) { 
	double conversionMath = conv.yd_to_km;
	double answer = unit * conversionMath;		
	return answer;
}
public static double ydToIn(double unit) { 
	double conversionMath = conv.yd_to_in;
	double answer = unit * conversionMath;		
	return answer;
}
public static double ydToFt(double unit) { 
	double conversionMath = conv.yd_to_ft;
	double answer = unit * conversionMath;		
	return answer;
}
public static double ydToMi(double unit) { 
	double conversionMath = conv.yd_to_mi;
	double answer = unit * conversionMath;		
	return answer;
}

/* CONVERSION METHODS || MILE || MILE || MILE || MILE || MILE || MILE*/

public static double miToMm(double unit) { 
	double conversionMath = conv.mi_to_mm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double miToCm(double unit) { 
	double conversionMath = conv.mi_to_cm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double miToDm(double unit) { 
	double conversionMath = conv.mi_to_dm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double miToM(double unit) { 
	double conversionMath = conv.mi_to_m;
	double answer = unit * conversionMath;		
	return answer;
}
public static double miToDam(double unit) { 
	double conversionMath = conv.mi_to_dam;
	double answer = unit * conversionMath;		
	return answer;
}
public static double miToHm(double unit) { 
	double conversionMath = conv.mi_to_hm;
	double answer = unit * conversionMath;		
	return answer;
}
public static double miToKm(double unit) { 
	double conversionMath = conv.mi_to_km;
	double answer = unit * conversionMath;		
	return answer;
}
public static double miToIn(double unit) { 
	double conversionMath = conv.mi_to_in;
	double answer = unit * conversionMath;		
	return answer;
}
public static double miToFt(double unit) { 
	double conversionMath = conv.mi_to_ft;
	double answer = unit * conversionMath;		
	return answer;
}
public static double miToYd(double unit) { 
	double conversionMath = conv.mi_to_yd;
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
