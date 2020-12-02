package Covid19_ergasia_ejamhnou;

import java.util.*;

public class AddPatient {
	
	Scanner sc = new Scanner(System.in);
	public void addPatient() {
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
}
