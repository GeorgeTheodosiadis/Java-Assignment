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
	private String firstName, lastName, gender, region, email, phoneNumber, nationalId;
	private int age, covidTestDay, covidTestMonth, covidTestYear;
	private boolean infected;
	public static ArrayList<Patient> myPatient = new ArrayList<Patient>();
	
	public Patient(String firstName, String lastName, String gender, String nationalId, String region, String email, int age,
		       String phoneNumber, int covidTestDay, int covidTestMonth, int covidTestYear, boolean infected) {
		myPatient.add(this);
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.nationalId = nationalId;
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

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
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
		
		String firstName, lastName, gender, region, email, phoneNumber, infectedMes, nationalId;
		int age, covidTestDay, covidTestMonth, covidTestYear;
		boolean infected, flag1 = false, flag2 = false;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Προσθέστε Όνομα: ");
		firstName = in.nextLine();
		System.out.print("Προσθέστε Επίθετο: ");
		lastName = in.nextLine();
		gender = "";
		while (flag1 == false) {
			System.out.print("Προσθέστε Φύλλο (ΑΝΤΡΑΣ/ΓΥΝΑΙΚΑ): ");
			gender = in.nextLine();
			if (gender.equalsIgnoreCase("ΑΝΤΡΑΣ") || gender.equalsIgnoreCase("ΓΥΝΑΙΚΑ")) {
				flag1 = true;
			} else {
				System.out.println("Λανθασμένη καταχώρηση. Εισάγετε ξανά.");
			}
		}
		System.out.print("Προσθέστε Αριρθμό Ταυτότητας: ");
		nationalId = in.nextLine();
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
			System.out.print("Αποτέλεσμα Τεστ COVID-19 (ΘΕΤΙΚΟ/ΑΡΝΗΤΙΚΟ): ");
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
		
		new Patient(firstName, lastName, gender, nationalId, region, email, age, phoneNumber, covidTestDay,
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
			if (!(myRegion.equalsIgnoreCase("ΗΠΕΙΡΟΣ") || myRegion.equalsIgnoreCase("ΘΕΣΣΑΛΙΑ") ||
					myRegion.equalsIgnoreCase("ΘΡΑΚΗ") || myRegion.equalsIgnoreCase("ΚΡΗΤΗ") ||
					myRegion.equalsIgnoreCase("ΜΑΚΕΔΟΝΙΑ") || myRegion.equalsIgnoreCase("ΝΗΣΟΙ ΑΙΓΑΙΟΥ ΠΕΛΑΓΟΥΣ") ||
					myRegion.equalsIgnoreCase("ΝΗΣΟΙ ΙΟΝΙΟΥ ΠΕΛΑΓΟΥΣ") || myRegion.equalsIgnoreCase("ΠΕΛΟΠΟΝΝΗΣΟΣ") ||
					myRegion.equalsIgnoreCase("ΣΤΕΡΕΑ ΕΛΛΑΔΑ"))) {
				System.out.println("Λανθασμένη καταχώρηση. Εισάγετε ξανά.");
			} else {
				flag = true;
			}
		}
		return myRegion;
		
	}
	
	/**
	 * This method prints all people tested for Covid-19.
	 */
	public static void printPatient() {
		
		if (Patient.myPatient.size() == 0) {
			System.out.println("Δεν έχουν καταγραφεί εξεταζόμενοι. Αδυναμία εύρεσης αποτελεσμάτων.\n");
		} else {
			System.out.println("*** ΛΙΣΤΑ ΕΞΕΤΑΖΟΜΕΝΩΝ ***\n");
			for (int i = 0; i < Patient.myPatient.size(); i++) {
				
				String check = "";
				if (Patient.myPatient.get(i).isInfected() == true) {
					check = "ΘΕΤΙΚΟ";
				} else {
					check = "ΑΡΝΗΤΙΚΟ";
				}
				System.out.println((i + 1) + ". " + Patient.myPatient.get(i).getFirstName().toUpperCase() + " " + Patient.myPatient.get(i).getLastName().toUpperCase() 
						+ " (Αριθμός Ταυτότητας: " + Patient.myPatient.get(i).getNationalId().toUpperCase() + ")\n"
						+ "Φύλο: " + Patient.myPatient.get(i).getGender().toUpperCase() + ", Ηλικία: " + Patient.myPatient.get(i).getAge() 
						+ ", Γεωγραφικό Διαμέρισμα: " + Patient.myPatient.get(i).getRegion().toUpperCase() + "\n"
						+ "Στοιχεία Επικοινωνίας: " + Patient.myPatient.get(i).getPhoneNumber() + " - " + Patient.myPatient.get(i).getEmail() + "\n"
						+ "Τεστ: " + check + ", Ημερομηνία Τεστ: " +  Patient.myPatient.get(i).getCovidTestDay() + "/"
						+ Patient.myPatient.get(i).getCovidTestMonth() + "/" + Patient.myPatient.get(i).getCovidTestYear());
				if (Patient.myPatient.get(i).isInfected() == true) {
					int [] newDate = checkDate(i);
					System.out.println("Σε καραντίνα έως: " + newDate[0] + "/" + newDate[1] + "/" + newDate[2] + "\n");
				} else {
					System.out.println();
				}
			}
		}
		
	}
	
	/**
	 * This method finds a Patient after requesting the national id.
	 */
	public static void findPatient(Scanner in) {
		
		boolean flag = false;
		System.out.print("Εισάγετε Αριθμό Ταυτότητας: ");
		String id = in.nextLine();
		System.out.println();
		for (int i = 0; i < Patient.myPatient.size(); i++) {
			if (Patient.myPatient.get(i).getNationalId().equalsIgnoreCase(id)) {
				flag = true;
				String check = "";
				if (Patient.myPatient.get(i).isInfected() == true) {
					check = "ΘΕΤΙΚΟ";
				} else {
					check = "ΑΡΝΗΤΙΚΟ";
				}
				System.out.println(Patient.myPatient.get(i).getFirstName().toUpperCase() + " " + Patient.myPatient.get(i).getLastName().toUpperCase() 
						+ " (Αριθμός Ταυτότητας: " + Patient.myPatient.get(i).getNationalId().toUpperCase() + ")\n"
						+ "Φύλο: " + Patient.myPatient.get(i).getGender().toUpperCase() + ", Ηλικία: " + Patient.myPatient.get(i).getAge() 
						+ ", Γεωγραφικό Διαμέρισμα: " + Patient.myPatient.get(i).getRegion().toUpperCase() + "\n"
						+ "Στοιχεία Επικοινωνίας: " + Patient.myPatient.get(i).getPhoneNumber() + " - " + Patient.myPatient.get(i).getEmail() + "\n"
						+ "Τεστ: " + check + ", Ημερομηνία Τεστ: " +  Patient.myPatient.get(i).getCovidTestDay() + "/"
						+ Patient.myPatient.get(i).getCovidTestMonth() + "/" + Patient.myPatient.get(i).getCovidTestYear());
				if (Patient.myPatient.get(i).isInfected() == true) {
					int [] newDate = checkDate(i);
					System.out.println("Σε καραντίνα έως: " + newDate[0] + "/" + newDate[1] + "/" + newDate[2] + "\n");
				} else {
					System.out.println();
				}
			}
		}
		if (flag == false) {
			System.out.println("Αδυναμία εύρεσης εξεταζόμενου.\n");
		}
		
	}
	
	/**
	 * This method returns an array of Integers with the day, month and year
	 * the person tested positive can get out of quarantine.
	 */
	public static int[] checkDate(int i) {
		int[] newDate = new int[3];
		int dif;
		int day = Patient.myPatient.get(i).getCovidTestDay();
		int month = Patient.myPatient.get(i).getCovidTestMonth();
		int year = Patient.myPatient.get(i).getCovidTestYear();
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if ((day + 14) > 31) {
				dif = Math.abs(31 - (day + 14));
				if (month == 12) {
					newDate[2] = year + 1;
					newDate[1] = 1;
					newDate[0] = dif;
				} else {
					newDate[2] = year;
					newDate[1] = month + 1;
					newDate[0] = dif;
				}	
			} else {
				newDate[2] = year;
				newDate[1] = month;
				newDate[0] = day + 14;
			}
		} else if (month == 2) {
			 if (year == 2020 || year == 2024) {
				if ((day + 14) > 29) {
					dif = Math.abs(29 - (day + 14));
					newDate[2] = year;
					newDate[1] = month + 1;
					newDate[0] = dif;	
				} else {
					newDate[2] = year;
					newDate[1] = month;
					newDate[0] = day + 14;
				}
			} else {
				if ((day + 14) > 28) {
					dif = Math.abs(28 - (day + 14));
					newDate[2] = year;
					newDate[1] = month + 1;
					newDate[0] = dif;	
				} else {
					newDate[2] = year;
					newDate[1] = month;
					newDate[0] = day + 14;
				}
			}
		} else {
			if ((day + 14) > 30) {
				dif = Math.abs(30 - (day + 14));
				newDate[2] = year;
				newDate[1] = month++;
				newDate[0] = dif;	
			} else {
				newDate[2] = year;
				newDate[1] = month;
				newDate[0] = day + 14;
			}
		}
		return newDate;
	}
	
	public static void removePatient(Scanner in) {
		
		boolean flag = false;
		System.out.print("Εισάγετε Αριθμό Ταυτότητας: ");
		String id = in.nextLine();
		System.out.println();
		for (int i = 0; i < Patient.myPatient.size(); i++) {
			if (Patient.myPatient.get(i).getNationalId().equalsIgnoreCase(id)) {
				Patient.myPatient.remove(i);
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("Αδυναμία εύρεσης εξεταζόμενου.\n");
		} else {
			System.out.println("Επιτυχής αφαίρεση εξεταζόμενου.\n");
		}
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
