import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
public static void main(String args[]) {
		
		String flag = "ΝΑΙ";
		Scanner in = new Scanner(System.in);
		while (flag.equalsIgnoreCase("ΝΑΙ")) {
			System.out.println("*** ΜΕΝΟΥ ΧΡΗΣΤΗ ***\n");
			System.out.println( "(1) Εμφάνιση Eγχειριδίου Xρήσης\n"
					+ "(2) Προσθήκη Eξεταζόμενου\n"
					+ "(3) Εμφάνιση Λίστας Ατόμων\n"
					+ "(4) Εμφάνιση Στατιστικών\n");
			System.out.print("Εισάγετε επιλογή: ");
			int x = intException();
			System.out.println();
			if (x == 1) {
				System.out.println("Soon to be added.\n");
			} else if (x == 2) {
				Patient.addPatient();
			} else if (x == 3) {
				System.out.println("Soon to be added.\n");
			} else if (x == 4) {
				System.out.println( "(1) Στατιστικά ανά Γεωγραφικό Διαμέρισμα\n"
						+ "(2) Στατιστικά ανά Ημέρα Επιλογής\n"
						+ "(3) Στατιστικά ανά Μήνα Επιλογής\n"
						+ "(4) Στατιστικά ανά Έτος Επιλογής\n"
						+ "(5) Κρούσματα Μεταξύ Ανδρών και Γυναικών\n"
						+ "(6) Ποσοστό Αρνητικών Κρουσμάτων\n"
						+ "(7) Ποσοστό Αρνητικών Κρουσμάτων\n"
						+ "(8) Στατιστικά ανά Ηλικιακή Ομάδα\n");
				System.out.print("Εισάγετε επιλογή: ");
				int y = intException();
				System.out.println();
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
			System.out.println();
		}
		System.out.println("Ευχαριστούμε που χρησιμοποιήσατε την πλατφόρμα μας.");
		
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
				System.out.println("Λανθασμένη καταχώρηση. Εισάγετε αριθμητικό χαρακτήρα.");
				sc.nextLine();
			}
		} while (action == false);
		return x;
		
	}

}
