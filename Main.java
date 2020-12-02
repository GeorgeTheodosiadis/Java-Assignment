import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		String flag = "ΝΑΙ";
		Scanner in = new Scanner(System.in);
		while (flag.equalsIgnoreCase("ΝΑΙ")) {
			System.out.println("(1)Εμφάνιση εγχειρίδιου χρήσης");
			System.out.println("(2)Προσθήκη εξεταζόμενου");
			System.out.println("(3)Εμφάνιση Λίστας Ατόμων");
			System.out.println("(4)Εμφάνιση Στατιστικών");
			int x = intException();
			if (x == 1) {
				Information.information();
			} else if (x == 2) {
				Patient.addPatient();
			} else if (x == 3) {
				Patient.printPatient();
			} else if (x == 4) {
				System.out.println("(1)Στατιστικά ανά Γεωγραφικό Διαμέρισμα");
				System.out.println("(2)Στατιστικά ανά Ημέρα Επιλογής");
				System.out.println("(3)Στατιστικά ανά Μήνα Επιλογής");
				System.out.println("(4)Στατιστικά ανά Έτος Επιλογής");
				System.out.println("(5)Κρούσματα Μεταξύ Ανδρών και Γυναικών");
				System.out.println("(6)Ποσοστό Θετικών Κρουσμάτων");
				System.out.println("(7)Ποσοστό Αρνητικών Κρουσμάτων");
				System.out.println("(8)Στατιστικά ανά Ηλικιακή Ομάδα");
				int y = intException();
				if (y == 1) {
					Statistics.casesPerRegion();
				} else if (y == 2) {
					Statistics.casesPerDay();
				} else if (y == 3) {
					Statistics.casesPerMonth();
				} else if (y == 4) {
					Statistics.casesPerYear();
				} else if (y == 5) {
					Statistics.casesPerGender();
				} else if (y == 6) {
					Statistics.casesOfPositive();
				} else if (y == 7) {
					Statistics.casesOfNegative();
				} else if (y == 8) {
					Statistics.casesPerAge();
				} else {
					System.out.println("Εισάγατε λανθασμένη επιλογή. Εισάγετε ξανά.\n");
				}
			} else {
				System.out.println("Εισάγατε λανθασμένη επιλογή. Εισάγετε ξανά.");
			}
			do {
				System.out.print("Επιθυμείτε να συνεχίσετε τη χρήση της εφαρμογής (ΝΑΙ ή ΟΧΙ): ");
				flag = in.nextLine();
				if (!(flag.equalsIgnoreCase("ΝΑΙ") || flag.equalsIgnoreCase("ΟΧΙ"))) {
					System.out.println("Εισάγατε λανθασμένη επιλογή. Εισάγετε ξανά.");
				}
			} while (!(flag.equalsIgnoreCase("ΝΑΙ") || flag.equalsIgnoreCase("ΟΧΙ")));
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
