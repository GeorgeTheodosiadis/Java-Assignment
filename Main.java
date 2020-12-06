import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
public static void main(String args[]) {
		
		String flag = "ΝΑΙ";
		Scanner in = new Scanner(System.in);
		while (flag.equalsIgnoreCase("ΝΑΙ")) {
			boolean check1 = false;
			boolean check2 = false;
			System.out.println("*** ΜΕΝΟΥ ΧΡΗΣΤΗ ***\n");
			System.out.println( "(1) Εμφάνιση Eγχειριδίου Xρήσης\n"
					+ "(2) Προσθήκη Eξεταζόμενου\n"
					+ "(3) Εμφάνιση Λίστας Ατόμων\n"
					+ "(4) Εύρεση Εξεταζόμενου\n"
					+ "(5) Αφαίρεση Εξεταζόμενου\n"
					+ "(6) Εμφάνιση Στατιστικών\n");
			int x = 0;
			while (check1 == false) {
				System.out.print("Εισάγετε επιλογή: ");
				x = intException();
				if (x == 1 || x == 2 || x == 3 || x == 4 || x == 5 || x == 6) {
					check1 = true;
				} else {
					System.out.println("Εισάγατε λανθασμένη επιλογή. Εισάγετε ξανά.\n");
				}
			}
			System.out.println();
			if (x == 1) {
				System.out.println("Soon to be added.\n");
			} else if (x == 2) {
				Patient.addPatient();
			} else if (x == 3) {
				Patient.printPatient();
			} else if (x == 4) {
				Patient.findPatient(in);
			} else if (x == 5) {
				Patient.removePatient(in);
			} else if (x == 6) {
				System.out.println( "(1) Στατιστικά ανά Γεωγραφικό Διαμέρισμα\n"
						+ "(2) Στατιστικά ανά Ημέρα Επιλογής\n"
						+ "(3) Στατιστικά ανά Μήνα Επιλογής\n"
						+ "(4) Στατιστικά ανά Έτος Επιλογής\n"
						+ "(5) Κρούσματα Μεταξύ Ανδρών και Γυναικών\n"
						+ "(6) Ποσοστό Αρνητικών Κρουσμάτων\n"
						+ "(7) Ποσοστό Αρνητικών Κρουσμάτων\n"
						+ "(8) Στατιστικά ανά Ηλικιακή Ομάδα\n");
				int y = 0;
				while (check2 == false) {
					System.out.print("Εισάγετε επιλογή: ");
					y = intException();
					if (y == 1 || y == 2 || y == 3 || y == 4 || y == 5 || y == 6 || y == 7 || y == 8) {
						check2 = true;
					} else {
						System.out.println("Εισάγατε λανθασμένη επιλογή. Εισάγετε ξανά.\n");
					}
				}
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
				}
			}
			do {
				System.out.print("Επιθυμείτε να συνεχίσετε τη χρήση της εφαρμογής (ΝΑΙ ή ΟΧΙ): ");
				flag = in.nextLine();
				if (!(flag.equalsIgnoreCase("ΝΑΙ") || flag.equalsIgnoreCase("ΟΧΙ"))) {
					System.out.println("Εισάγατε λανθασμένη επιλογή. Εισάγετε ξανά.\n");
				}
			} while (!(flag.equalsIgnoreCase("ΝΑΙ") || flag.equalsIgnoreCase("ΟΧΙ")));
			System.out.println();
		}
		System.out.print("Ευχαριστούμε που χρησιμοποιήσατε την πλατφόρμα μας.");
		
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
