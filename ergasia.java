import java.util.scanner;

public static void main(String args[]) {
	System.out.println("(1)Εμφάνιση εγχειριδίου χρήσης");
	System.out.println("(2)Προσθήκη εξεταζομένου");
	System.out.println("(3)Εμφάνιση λίστας ατόμων");
	System.out.println("(4)Εμφάνιση στατιστικών");
	Scanner sc = new Scanner();
	int x = sc.nextInt();
	if (x == 1) {
		Information.information();
	}
	elseif (x == 2) {
		AddPatient.addPatient();
	}
	elseif (x == 3) {
		PrintPatient.printPatient();
	}
	else {
		System.out.println("(1)Στατιστικά ανά Γεωγραφικό Διαμέρισμα");
		System.out.println("(2)Στατιστικά ανά Ημέρα Επιλογής");
		System.out.println("(3)Στατιστικά ανά Μήνα Επιλογής");
		System.out.println("(4)Στατιστικά ανά Έτος Επιλογής");
		System.out.println("(5)Κρούσματα Μεταξύ Ανδρών και Γυναικών");
		System.out.println("(6)Ποσοστό Θετικών Κρουσμάτων");
		System.out.println("(7)Ποσοστό Αρνητικών Κρουσμάτων");
		System.out.println("(8)Στατιστικά ανά Ηλικιακή Ομάδα");
		int y = sc.nextInt();
		if (y == 1) {
			Statistics.casesPerRegion(String myRegion);
		}
		elseif (y == 2) {
			System.out.println("Εισάγετε ημέρα, μήνα και έτος");
			int myCovidTestDay = sc.nextInt();
			int myCovidTestMonth = sc.nextInt();
			int myCovidTestYear = sc.nextInt();
			Statistics.casesPerDay(myCovidTestDay,myCovidTestMonth,myCovidTestYear);
		}
		elseif (y == 3) {
			System.out.println("Εισάγετε μήνα και έτος");
			int ctm = sc.nextInt();
			int cty = sc.nextInt();
			Statistics.casesPerMonth(ctm, cty);
		}
		elseif (y == 4) {
			System.out.println("Εισάγετε έτος");
			int cty = sc.nextInt();
			Statistics.casesPerYear(cty);
		}
		elseif (y == 5) {
			System.out.println("Εισάγετε φύλο");
			String gen = sc.nextString();
			Statistics.casesPerGender(gen);
		}
		elseif (y == 6) {
			System.out.println("Εισάγετε Θετικά κρούσματα");
			int krous = sc.nextInt();
			Statistics.casesOfPositive(krous);
		}
		elseif (y == 7) {
			System.out.println("Εισάγετε αρνητικά κρούσματα");
			int healthy = sc.nextInt();
			Statistics.casesOfNegative(healthy);
		}
		else {
			System.out.println("Εισάγετε ηλικία");
			int age = sc.nextInt();
			Statistics.casesPerAge(age);
		}
	}
}
