/** Converts centimeters to other units of measure
 * @author Aaro Tukia, Tuomas Thuren, Mika Lukkarinen
 * @version 1.4
 * @since 1.0
 * @param args array of string arguments.
 */
package OPR_Java;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
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
		
		
		//Create file where results will be stored if need for saving for example
		try {
			File OBJ = new File("..\\Java-Harjoitustyo\\tulos.txt");
			if (OBJ.createNewFile()) {
				System.out.println("File created called: " + OBJ.getName()+" - containing results also");
			} else {
				System.out.println("File "+OBJ.getName()+" allready exists! Will be updated for results!");
			}
			FileWriter writer = new FileWriter("..\\Java-Harjoitustyo\\tulos.txt");

		//IF STATEMENTS || MILLIMETERS || MILLIMETERS || MILLIMETERS || MILLIMETERS
		if (unit.equals("millimeter") && unit2.equals("centimeter")) {
			writer.write(unit2 + ": " + mmToCm(userInput));
			
			
		}
		else if (unit.equals("millimeter") && unit2.equals("decimeter")) {
			writer.write(unit2 + ": " + mmToDm(userInput));
			
		}
		else if (unit.equals("millimeter") && unit2.equals("meter")) {
			writer.write(unit2 + ": " + mmToM(userInput));
			
		}
		else if (unit.equals("millimeter") && unit2.equals("decameter")) {
			writer.write(unit2 + ": " + mmToDam(userInput));
			
		}
		else if (unit.equals("millimeter") && unit2.equals("hectometer")) {
			writer.write(unit2 + ": " + mmToHm(userInput));
		
		}
		else if (unit.equals("millimeter") && unit2.equals("kilometer")) {
			writer.write(unit2 + ": " +mmToKm(userInput));
			
		}
		else if (unit.equals("millimeter") && unit2.equals("inches")) {
			writer.write(unit2 + ": " +mmToIn(userInput));
		}
		else if (unit.equals("millimeter") && unit2.equals("foot")) {
			writer.write(unit2 + ": " +mmToFt(userInput));
		}
		else if (unit.equals("millimeter") && unit2.equals("yard")) {
			writer.write(unit2 + ": " +mmToYd(userInput));
		}
		else if (unit.equals("millimeter") && unit2.equals("mile")) {
			writer.write(unit2 + ": " +mmToMi(userInput));
		}
		
		//IF STATEMENTS || CENTIMETERS || CENTIMETERS || CENTIMETERS || CENTIMETERS 
		else if (unit.equals("centimeter") && unit2.equals("millimeter")) {
			writer.write(unit2 + ": " + cmToMm(userInput));
		}
		else if (unit.equals("centimeter") && unit2.equals("decimeter")) {
			writer.write(unit2 + ": " +cmToDm(userInput));
		}
		else if (unit.equals("centimeter") && unit2.equals("meter")) {
			writer.write(unit2 + ": " +cmToM(userInput));
		}
		else if (unit.equals("centimeter") && unit2.equals("decameter")) {
			writer.write(unit2 + ": " +cmToDam(userInput));
		}
		else if (unit.equals("centimeter") && unit2.equals("hectometer")) {
			writer.write(unit2 + ": " +cmToHm(userInput));
		}
		else if (unit.equals("centimeter") && unit2.equals("kilometer")) {
			writer.write(unit2 + ": " +cmToKm(userInput));
		}
		else if (unit.equals("centimeter") && unit2.equals("inches")) {
			writer.write(unit2 + ": " +cmToIn(userInput));
		}
		else if (unit.equals("centimeter") && unit2.equals("foot")) {
			writer.write(unit2 + ": " +cmToFt(userInput));
		}
		else if (unit.equals("centimeter") && unit2.equals("yard")) {
			writer.write(unit2 + ": " +cmToYd(userInput));
		}
		else if (unit.equals("centimeter") && unit2.equals("mile")) {
			writer.write(unit2 + ": " +cmToMi(userInput));
		}
		//IF STATEMENTS || DECIMETERS || DECIMETERS || DECIMETERS || DECIMETERS
		
		else if (unit.equals("decimeter") && unit2.equals("millimeter")) {
			writer.write(unit2 + ": " +dmToMm(userInput));
		}
		else if (unit.equals("decimeter") && unit2.equals("centimeter")) {
			writer.write(unit2 + ": " +dmToCm(userInput));
		}
		else if (unit.equals("decimeter") && unit2.equals("meter")) {
			writer.write(unit2 + ": " +dmToM(userInput));
		}
		else if (unit.equals("decimeter") && unit2.equals("decameter")) {
			writer.write(unit2 + ": " +dmToDam(userInput));
		}
		else if (unit.equals("decimeter") && unit2.equals("hectometer")) {
			writer.write(unit2 + ": " +dmToHm(userInput));
		}
		else if (unit.equals("decimeter") && unit2.equals("kilometer")) {
			writer.write(unit2 + ": " +dmToKm(userInput));
		}
		else if (unit.equals("decimeter") && unit2.equals("inches")) {
			writer.write(unit2 + ": " +dmToIn(userInput));
		}
		else if (unit.equals("decimeter") && unit2.equals("foot")) {
			writer.write(unit2 + ": " +dmToFt(userInput));
		}
		else if (unit.equals("decimeter") && unit2.equals("yard")) {
			writer.write(unit2 + ": " +dmToYd(userInput));
		}
		else if (unit.equals("decimeter") && unit2.equals("mile")) {
			writer.write(unit2 + ": " +dmToMi(userInput));
		}
		//IF STATEMENTS || METERS || METERS || METERS || METERS 
		
		else if (unit.equals("meter") && unit2.equals("millimeter")) {
			writer.write(unit2 + ": " +mToMm(userInput));
		}
		else if (unit.equals("meter") && unit2.equals("centimeter")) {
			writer.write(unit2 + ": " +mToCm(userInput));
		}
		else if (unit.equals("meter") && unit2.equals("decimeter")) {
			writer.write(unit2 + ": " +mToDm(userInput));
		}
		else if (unit.equals("meter") && unit2.equals("decameter")) {
			writer.write(unit2 + ": " +mToDam(userInput));
		}
		else if (unit.equals("meter") && unit2.equals("hectometer")) {
			writer.write(unit2 + ": " +mToHm(userInput));
		}
		else if (unit.equals("meter") && unit2.equals("kilometer")) {
			writer.write(unit2 + ": " +mToKm(userInput));
		}
		else if (unit.equals("meter") && unit2.equals("inches")) {
			writer.write(unit2 + ": " +mToIn(userInput));
		}
		else if (unit.equals("meter") && unit2.equals("foot")) {
			writer.write(unit2 + ": " +mToFt(userInput));
		}
		else if (unit.equals("meter") && unit2.equals("yard")) {
			writer.write(unit2 + ": " +mToYd(userInput));
		}
		else if (unit.equals("meter") && unit2.equals("mile")) {
			writer.write(unit2 + ": " +mToMi(userInput));
		}
		//IF STATEMENTS || DECAMETERS || DECAMETERS || DECAMETERS || DECAMETERS 
		else if (unit.equals("decameter") && unit2.equals("millimeter")) {
			writer.write(unit2 + ": " +damToMm(userInput));
		}
		else if (unit.equals("decameter") && unit2.equals("centimeter")) {
			writer.write(unit2 + ": " +damToCm(userInput));
		}
		else if (unit.equals("decameter") && unit2.equals("decimeter")) {
			writer.write(unit2 + ": " +damToDm(userInput));
		}
		else if (unit.equals("decameter") && unit2.equals("meter")) {
			writer.write(unit2 + ": " +damToM(userInput));
		}
		else if (unit.equals("decameter") && unit2.equals("hectometer")) {
			writer.write(unit2 + ": " +damToHm(userInput));
		}
		else if (unit.equals("decameter") && unit2.equals("kilometer")) {
			writer.write(unit2 + ": " +damToKm(userInput));
		}
		else if (unit.equals("decameter") && unit2.equals("inches")) {
			writer.write(unit2 + ": " +damToIn(userInput));
		}
		else if (unit.equals("decameter") && unit2.equals("foot")) {
			writer.write(unit2 + ": " +damToFt(userInput));
		}
		else if (unit.equals("decameter") && unit2.equals("yard")) {
			writer.write(unit2 + ": " +damToYd(userInput));
		}
		else if (unit.equals("decameter") && unit2.equals("mile")) {
			writer.write(unit2 + ": " +damToMi(userInput));
		}
		
		//IF STATEMENTS || HECTOMETERS || HECTOMETERS || HECTOMETERS || HECTOMETERS
		
		else if (unit.equals("hectometer") && unit2.equals("millimeter")) {
			writer.write(unit2 + ": " +hmToMm(userInput));
		}
		else if (unit.equals("hectometer") && unit2.equals("centimeter")) {
			writer.write(unit2 + ": " +hmToCm(userInput));
		}
		else if (unit.equals("hectometer") && unit2.equals("decimeter")) {
			writer.write(unit2 + ": " +hmToDm(userInput));
		}
		else if (unit.equals("hectometer") && unit2.equals("meter")) {
			writer.write(unit2 + ": " +hmToM(userInput));
		}
		else if (unit.equals("hectometer") && unit2.equals("decameter")) {
			writer.write(unit2 + ": " +hmToDam(userInput));
		}
		else if (unit.equals("hectometer") && unit2.equals("kilometer")) {
			writer.write(unit2 + ": " +hmToKm(userInput));
		}
		else if (unit.equals("hectometer") && unit2.equals("inches")) {
			writer.write(unit2 + ": " +hmToIn(userInput));
		}
		else if (unit.equals("hectometer") && unit2.equals("foot")) {
			writer.write(unit2 + ": " +hmToFt(userInput));
		}
		else if (unit.equals("hectometer") && unit2.equals("yard")) {
			writer.write(unit2 + ": " +hmToYd(userInput));
		}
		else if (unit.equals("hectometer") && unit2.equals("mile")) {
			writer.write(unit2 + ": " +hmToMi(userInput));
		}
		//IF STATEMENTS || KILOMETERS || KILOMETERS || KILOMETERS || KILOMETERS
		else if (unit.equals("kilometer") && unit2.equals("millimeter")) {
			writer.write(unit2 + ": " +kmToMm(userInput));
		}
		else if (unit.equals("kilometer") && unit2.equals("centimeter")) {
			writer.write(unit2 + ": " +kmToCm(userInput));
		}
		else if (unit.equals("kilometer") && unit2.equals("decimeter")) {
			writer.write(unit2 + ": " +kmToDm(userInput));
		}
		else if (unit.equals("kilometer") && unit2.equals("meter")) {
			writer.write(unit2 + ": " +kmToM(userInput));
		}
		else if (unit.equals("kilometer") && unit2.equals("decameter")) {
			writer.write(unit2 + ": " +kmToDam(userInput));
		}
		else if (unit.equals("kilometer") && unit2.equals("hectometer")) {
			writer.write(unit2 + ": " +kmToHm(userInput));
		}
		else if (unit.equals("kilometer") && unit2.equals("inches")) {
			writer.write(unit2 + ": " +kmToIn(userInput));
		}
		else if (unit.equals("kilometer") && unit2.equals("foot")) {
			writer.write(unit2 + ": " +kmToFt(userInput));
		}
		else if (unit.equals("kilometer") && unit2.equals("yard")) {
			writer.write(unit2 + ": " +kmToYd(userInput));
		}
		else if (unit.equals("kilometer") && unit2.equals("mile")) {
			writer.write(unit2 + ": " +kmToMi(userInput));
		}
		//IF STATEMENTS || INCHES || INCHES || INCHES || INCHES
		else if (unit.equals("inches") && unit2.equals("millimeter")) {
			writer.write(unit2 + ": " +inToMm(userInput));
		}
		else if (unit.equals("inches") && unit2.equals("centimeter")) {
			writer.write(unit2 + ": " +inToCm(userInput));
		}
		else if (unit.equals("inches") && unit2.equals("decimeter")) {
			writer.write(unit2 + ": " +inToDm(userInput));
		}
		else if (unit.equals("inches") && unit2.equals("meter")) {
			writer.write(unit2 + ": " +inToM(userInput));
		}
		else if (unit.equals("inches") && unit2.equals("decameter")) {
			writer.write(unit2 + ": " +inToDam(userInput));
		}
		else if (unit.equals("inches") && unit2.equals("hectometer")) {
			writer.write(unit2 + ": " +inToHm(userInput));
		}
		else if (unit.equals("inches") && unit2.equals("foot")) {
			writer.write(unit2 + ": " +inToFt(userInput));
		}
		else if (unit.equals("inches") && unit2.equals("yard")) {
			writer.write(unit2 + ": " +inToYd(userInput));
		}
		else if (unit.equals("inches") && unit2.equals("mile")) {
			writer.write(unit2 + ": " +inToMi(userInput));
		}
		
		//IF STATEMENTS || FOOT || FOOT || FOOT || FOOT
		
		else if (unit.equals("foot") && unit2.equals("millimeter")) {
			writer.write(unit2 + ": " +ftToMm(userInput));
		}
		else if (unit.equals("foot") && unit2.equals("centimeter")) {
			writer.write(unit2 + ": " +ftToCm(userInput));
		}
		else if (unit.equals("foot") && unit2.equals("decimeter")) {
			writer.write(unit2 + ": " +ftToDm(userInput));
		}
		else if (unit.equals("foot") && unit2.equals("meter")) {
			writer.write(unit2 + ": " +ftToM(userInput));
		}
		else if (unit.equals("foot") && unit2.equals("decameter")) {
			writer.write(unit2 + ": " +ftToDam(userInput));
		}
		else if (unit.equals("foot") && unit2.equals("hectometer")) {
			writer.write(unit2 + ": " +ftToHm(userInput));
		}
		else if (unit.equals("foot") && unit2.equals("inches")) {
			writer.write(unit2 + ": " +ftToIn(userInput));
		}
		else if (unit.equals("foot") && unit2.equals("yard")) {
			writer.write(unit2 + ": " +ftToYd(userInput));
		}
		else if (unit.equals("foot") && unit2.equals("mile")) {
			writer.write(unit2 + ": " +ftToMi(userInput));
		}
		
		//IF STATEMENTS || YARD || YARD || YARD || YARD || YARD || YARD 
		
		else if (unit.equals("yard") && unit2.equals("millimeter")) {
			writer.write(unit2 + ": " +ydToMm(userInput));
		}
		else if (unit.equals("yard") && unit2.equals("centimeter")) {
			writer.write(unit2 + ": " +ydToCm(userInput));
		}
		else if (unit.equals("yard") && unit2.equals("decimeter")) {
			writer.write(unit2 + ": " +ydToDm(userInput));
		}
		else if (unit.equals("yard") && unit2.equals("meter")) {
			writer.write(unit2 + ": " +ydToM(userInput));
		}
		else if (unit.equals("yard") && unit2.equals("decameter")) {
			writer.write(unit2 + ": " +ydToDam(userInput));
		}
		else if (unit.equals("yard") && unit2.equals("hectometer")) {
			writer.write(unit2 + ": " +ydToHm(userInput));
		}
		else if (unit.equals("yard") && unit2.equals("kilometer")) {
			writer.write(unit2 + ": " +ydToKm(userInput));
		}
		else if (unit.equals("yard") && unit2.equals("inches")) {
			writer.write(unit2 + ": " +ydToIn(userInput));
		}
		else if (unit.equals("yard") && unit2.equals("foot")) {
			writer.write(unit2 + ": " +ydToFt(userInput));
		}
		else if (unit.equals("yard") && unit2.equals("mile")) {
			writer.write(unit2 + ": " +ydToMi(userInput));
		}
		
		//IF STATEMENTS || MILE || MILE || MILE || MILE || MILE || MILE || MILE 
		
		else if (unit.equals("mile") && unit2.equals("millimeter")) {
			writer.write(unit2 + ": " +miToMm(userInput));
		}
		else if (unit.equals("mile") && unit2.equals("centimeter")) {
			writer.write(unit2 + ": " +miToCm(userInput));
		}
		else if (unit.equals("mile") && unit2.equals("decimeter")) {
			writer.write(unit2 + ": " +miToDm(userInput));
		}
		else if (unit.equals("mile") && unit2.equals("meter")) {
			writer.write(unit2 + ": " +miToM(userInput));
		}
		else if (unit.equals("mile") && unit2.equals("decameter")) {
			writer.write(unit2 + ": " +miToDam(userInput));
		}
		else if (unit.equals("mile") && unit2.equals("hectometer")) {
			writer.write(unit2 + ": " +miToHm(userInput));
		}
		else if (unit.equals("mile") && unit2.equals("kilometer")) {
			writer.write(unit2 + ": " +miToKm(userInput));
		}
		else if (unit.equals("mile") && unit2.equals("inches")) {
			writer.write(unit2 + ": " +miToIn(userInput));
		}
		else if (unit.equals("mile") && unit2.equals("foot")) {
			writer.write(unit2 + ": " +miToFt(userInput));
		}
		else if (unit.equals("mile") && unit2.equals("yard")) {
			writer.write(unit2 + ": " +miToYd(userInput));
		}
	
		else {
			System.out.println("Can't convert to that....");
		}

		//READING FILE FOR RESULTS
		writer.close();
		Scanner filereader = new Scanner(OBJ);
		while (filereader.hasNextLine()) {
			String data = filereader.nextLine();
			System.out.println(data);
		}
		filereader.close();
		//EXCEPTIONS
		} catch (IOException e) {
			System.out.print("Error occured while writing to file or creating file!");
			e.printStackTrace();
		}
	
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


/**  CONVERSION METHODS START HERE ||  CONVERSION METHODS START HERE ||  CONVERSION METHODS START HERE ||  /*
 * 
 * @param unit The amount of a given unit given by the user
 * @return Returns a double value representing the calculated conversion
 */
/* CONVERSION METHODS || MILLIMETERS  || MILLIMETERS || MILLIMETERS || MILLIMETERS  */

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

/* CONVERSION METHODS || YARD || YARD || YARD || YARD|| YARD || YARD */

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

/* CONVERSION METHODS || MILE || MILE || MILE || MILE || MILE || MILE */

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
