import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class is used to track the Patients that are tested for Covid-19
 * and insert their firstName, lastName, gender, region, email, age,
 * phoneNumber, covidTestDay, covidTestMonth, covidTestYear and 
 * if they are infected or not to our Database Arraylist System.
 * 
 * @author George Theodosiadis
 */
public class Patient {
	private String firstName, lastName, gender, region, email, phoneNumber;
	private int age, covidTestDay, covidTestMonth, covidTestYear;
	private boolean infected;
	public static ArrayList<Patient> myPatient = new ArrayList<Patient>();
	
	public Patient(String firstName, String lastName, String gender, String region, String email, int age,
		       String phoneNumber, int covidTestDay, int covidTestMonth, int covidTestYear, boolean infected) {
		myPatient.add(this);
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.region = region;
		this.email = email;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.covidTestDay = covidTestDay;
		this.covidTestMonth = covidTestMonth;
		this.covidTestYear = covidTestYear;
		this.infected = infected;
	}

	/**
	 * These are the setters and getters of the main variables
	 */
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getCovidTestDay() {
		return covidTestDay;
	}

	public void setCovidTestDay(int covidTestDay) {
		this.covidTestDay = covidTestDay;
	}

	public int getCovidTestMonth() {
		return covidTestMonth;
	}

	public void setCovidTestMonth(int covidTestMonth) {
		this.covidTestMonth = covidTestMonth;
	}

	public int getCovidTestYear() {
		return covidTestYear;
	}

	public void setCovidTestYear(int covidTestYear) {
		this.covidTestYear = covidTestYear;
	}

	public boolean isInfected() {
		return infected;
	}

	public void setInfected(boolean infected) {
		this.infected = infected;
	}
	
	/**
	 * This method adds new Patients to our ArrayList.
	 */
	public static void addPatient() {
		
		String firstName, lastName, gender, region, email, phoneNumber, infectedMes;
		int age, covidTestDay, covidTestMonth, covidTestYear;
		boolean infected, flag1 = false, flag2 = false;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Προσθέστε Όνομα: ");
		firstName = in.nextLine();
		System.out.print("Προσθέστε Επίθετο: ");
		lastName = in.nextLine();
		gender = "";
		while (flag1 == false) {
			System.out.print("Προσθέστε Φύλλο (Άντρας/Γυναίκα): ");
			gender = in.nextLine();
			if (gender.equalsIgnoreCase("ΑΝΤΡΑΣ") || gender.equalsIgnoreCase("ΓΥΝΑΙΚΑ")) {
				flag1 = true;
			} else {
				System.out.println("Λανθασμένη καταχώρηση. Εισάγετε ξανά.");
			}
		}
		age = 0;
		while (age <= 0) {
			System.out.print("Προσθέστε με Αριθμητικό Χαρακτήρα την Ηλικία: ");
			age = intException(); 
			if (age <= 0) {
				System.out.println("Λανθασμένη ηλικία. Εισάγετε ξανά.");
			}
		}
		region = inputRegion(in);
		System.out.print("Προσθέστε e-mail Επικοινωνίας: ");
		email = in.nextLine();
		System.out.print("Προσθέστε Τηλέφωνο Επικοινωνίας: ");
		phoneNumber = in.nextLine();
		infected = true;
		while (flag2 == false) {
			System.out.print("Αποτέλεσμα Τεστ COVID-19 (Θετικό/Αρνητικό): ");
			infectedMes = in.nextLine();
			if (infectedMes.equalsIgnoreCase("ΘΕΤΙΚΟ") || infectedMes.equalsIgnoreCase("ΑΡΝΗΤΙΚΟ")) {
				flag2 = true;
				if (infectedMes.equalsIgnoreCase("ΘΕΤΙΚΟ")) {
					infected = true;
				} else {
					infected = false;
				}
			} else {
				System.out.println("Λανθασμένη καταχώρηση. Εισάγετε ξανά.");
			}
		}
		covidTestDay = 0;
		while (covidTestDay <= 0 || covidTestDay > 31) {
			System.out.print("Προσθέστε με Αριθμητικό Χαρακτήρα την Ημέρα Διενέργιας Τεστ: ");
			covidTestDay = intException();
			if (covidTestDay <= 0 || covidTestDay > 31) {
				System.out.println("Λανθασμένη καταχώρηση ημέρας. Εισάγετε ξανά.");
			}
		}
		covidTestMonth = 0;
		while (covidTestMonth <= 0 || covidTestMonth > 12) {
			System.out.print("Προσθέστε με Αριθμητικό Χαρακτήρα το Μήνα Διενέργιας Τεστ: ");
			covidTestMonth = intException();
			if (covidTestMonth <= 0 || covidTestMonth > 12) {
				System.out.println("Λανθασμένη καταχώρηση μήνα. Εισάγετε ξανά.");
			}
		}
		covidTestYear = 0;
		while (covidTestYear < 2019 || covidTestYear > 2025) {
			System.out.print("Προσθέστε με Αριθμητικό Χαρακτήρα το Έτος Διενέργιας Τεστ: ");
			covidTestYear = intException();
			if (covidTestYear < 2019 || covidTestYear > 2025) {
				System.out.println("Λανθασμένη καταχώρηση έτους. Εισάγετε ξανά (2019-2025).");
			}
		}
		System.out.println("\n*** Επιτυχής Καταχώρηση Στοιχείων ***\n");
		
		new Patient(firstName, lastName, gender, region, email, age, phoneNumber, covidTestDay,
				covidTestMonth, covidTestYear, infected);

	}
	
	public static String inputRegion(Scanner in) {

		boolean flag = false;
		String myRegion = "";
		while (flag == false) {
			System.out.println("Γεωγραφικά Διαμερίσματα Ελλάδας:\n"
					+ "ΗΠΕΙΡΟΣ - ΘΕΣΣΑΛΙΑ - ΘΡΑΚΗ - ΚΡΗΤΗ\n"
					+ "ΜΑΚΕΔΟΝΙΑ - ΝΗΣΟΙ ΑΙΓΑΙΟΥ ΠΕΛΑΓΟΥΣ\n"
					+ "ΝΗΣΟΙ ΙΟΝΙΟΥ ΠΕΛΑΓΟΥΣ\n"
					+ "ΠΕΛΟΠΟΝΝΗΣΟΣ - ΣΤΕΡΕΑ ΕΛΛΑΔΑ");
			System.out.print("Εισάγετε Γεωγραφικό Διαμέρισμα: ");
			myRegion = in.nextLine();
			if (!(myRegion.equalsIgnoreCase("ΗΠΕΙΡΟΣ") && myRegion.equalsIgnoreCase("ΘΕΣΣΑΛΙΑ") ||
					myRegion.equalsIgnoreCase("ΘΡΑΚΗ") && myRegion.equalsIgnoreCase("ΚΡΗΤΗ") ||
					myRegion.equalsIgnoreCase("ΜΑΚΕΔΟΝΙΑ") && myRegion.equalsIgnoreCase("ΝΗΣΟΙ ΑΙΓΑΙΟΥ ΠΕΛΑΓΟΥΣ") ||
					myRegion.equalsIgnoreCase("ΝΗΣΟΙ ΙΟΝΙΟΥ ΠΕΛΑΓΟΥΣ") && myRegion.equalsIgnoreCase("ΠΕΛΟΠΟΝΝΗΣΟΣ") ||
					myRegion.equalsIgnoreCase("ΣΤΕΡΕΑ ΕΛΛΑΔΑ"))) {
				System.out.println("Λανθασμένη καταχώρηση. Εισάγετε ξανά.");
			} else {
				flag = true;
			}
		}
		return myRegion;
		
	}
	
	/**
	 * This method is used to catch an Input Mismatch Exception.
	 */
	public static int intException() {
		
		Scanner sc = new Scanner(System.in);
		boolean action = false;
		int x = 0;
		do {
			try {
				x = sc.nextInt();
				action = true;
			} catch (InputMismatchException inputMismatchException) {
				System.out.println("Λανθασμένη καταχώρηση. Εισάγετε ξανά αριθμητικό χαρακτήρα.");
				sc.nextLine();
			}
		} while (action == false);
		return x;
		
	}
	
}
