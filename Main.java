import java.util.InputMismatchException;
import java.util.scanner;

public class Main {
	
	public static void main(String args[]) {
		
		String flag = "ΝΑΙ";
		Scanner in = new Scanner(System.in);
		while (flag == "ΝΑΙ") {
			System.out.println("(1)ÅìöÜíéóç åã÷åéñéäßïõ ÷ñÞóçò");
			System.out.println("(2)ÐñïóèÞêç åîåôáæïìÝíïõ");
			System.out.println("(3)ÅìöÜíéóç ëßóôáò áôüìùí");
			System.out.println("(4)ÅìöÜíéóç óôáôéóôéêþí");
			int x = intException();
			if (x == 1) {
				Information.information();
			} else if (x == 2) {
				Patient.addPatient();
			} else if (x == 3) {
				Patient.printPatient();
			} else if (x == 4) {
				System.out.println("(1)ÓôáôéóôéêÜ áíÜ Ãåùãñáöéêü ÄéáìÝñéóìá");
				System.out.println("(2)ÓôáôéóôéêÜ áíÜ ÇìÝñá ÅðéëïãÞò");
				System.out.println("(3)ÓôáôéóôéêÜ áíÜ ÌÞíá ÅðéëïãÞò");
				System.out.println("(4)ÓôáôéóôéêÜ áíÜ ¸ôïò ÅðéëïãÞò");
				System.out.println("(5)Êñïýóìáôá Ìåôáîý Áíäñþí êáé Ãõíáéêþí");
				System.out.println("(6)Ðïóïóôü Èåôéêþí ÊñïõóìÜôùí");
				System.out.println("(7)Ðïóïóôü Áñíçôéêþí ÊñïõóìÜôùí");
				System.out.println("(8)ÓôáôéóôéêÜ áíÜ ÇëéêéáêÞ ÏìÜäá");
				int y = intException();
				if (y == 1) {
					Statistics.casesPerRegion(String myRegion);
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
					System.out.println("Εισάγατε λανθασμένη επιλογή. Εισάγετε ξανά."\n);
				}
			} else {
				System.out.println("Εισάγατε λανθασμένη επιλογή. Εισάγετε ξανά."\n);
			}
			do {
				System.out.print("Επιθυμείτε να συνεχίσετε τη χρήση της εφαρμογής (ΝΑΙ ή ΟΧΙ): ");
				flag = in.nextLine();
				if (!(flag.equalsIgnoreCase("ΝΑΙ") || flag.equalsIgnoreCase("ΟΧΙ"))) {
					System.out.println("Εισάγατε λανθασμένη επιλογή. Εισάγετε ξανά.");
				}
			}
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
