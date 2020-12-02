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
 *
 */
public class Patient {
	private String firstName, lastName, gender, region, email, phoneNumber;
	private int age, covidTestDay, covidTestMonth, covidTestYear;
	private boolean infected;
	public static ArrayList<Patient> myPatient = new ArrayList<Patient>();
/**
 * 
 * This is the Constructor method of the class
 * 
 */
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

	public void addPatient() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Εισάγετε το όνομά σας");
		String firstName =  sc.next();
		System.out.println("Εισάγετε το επίθετό σας");
		String lastName = sc.next();
		System.out.println("Εισάγετε το φύλο σας: άνδρας/γυναίκα");
		String gender = sc.next();
		System.out.println("Εισάγετε την περιοχή σας");
		String region = sc.next();
		System.out.println("Εισάγετε το email σας");
		String email = sc.next();
		int age = 0;
		while (age <= 0 ) {
			try {
				System.out.println("Εισάγετε την ηλικία σας");
				age = sc.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("Μη έγκυρη τιμή");
			}
		}
		System.out.println("Εισάγετε το τηλέφωνό σας");
		int phoneNumber = sc.nextInt();
		System.out.println("Εισάγετε την ημερομηνία");
		int covidTestDay = 0;
		while (covidTestDay <= 0 && covidTestDay > 31 ) {
			try {
				System.out.println("Μέρα:");
				covidTestDay = sc.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("Μη έγκυρη τιμή");
			}
		}
		
		int covidTestMonth = 0;
		while (covidTestMonth <= 0 && covidTestMonth > 12 ) {
			try {
				System.out.println("Μήνας:");
				covidTestMonth = sc.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("Μη έγκυρη τιμή");
			}
		}
		int covidTestYear = 0;
		while (covidTestYear <=0 ) {
			try {
				System.out.println("Έτος:");
				age = sc.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("Μη έγκυρη τιμή");
			}
		}
		
		System.out.println("Εισάγετε το αποτέλεσμα του test: θετικό/αρνητικό");
		String apantisi = sc.next();
		boolean infected;
		if (apantisi.equals("θετικό")) {
			infected = true;
		} else {
			infected = false;
		}
		Patient Patient = new Patient(firstName, lastName, gender, region, email, age, phoneNumber, covidTestDay, covidTestMonth, covidTestYear, infected);
	}
/**
 * 
 * These are the setters and getters of the main variables
 * 
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

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
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
	
}
