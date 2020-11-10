import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class includes methods that calculate some statistic results regarding Covid-19 tests.
 * The class calculates statistics such as how many cases a region in Greece has,
 * how many are the cases of a specific day, of a specific month and of a specific year,
 * how many are the cases per gender (male or female), how many are the positive and
 * negative cases and how many are the cases per age.
 *
 * @version 1.0 1 Nov 2020
 * @author  Dimitris Grigoratos
 */
public class Statistics {

	/**
	 * This method is used to print the Covid-19 cases per region.
	 * The method searches every tested person's region and it stores on regions array
	 * the total amount of people from every region and it stores on positives array
	 * the total amount of people tested positive from every region. Afterwards,
	 * the method shows the user a message which has statistic information regarding
	 * Covid-19 cases on every region.
	 * If no people were being tested a different message informs the user.
	 */
	public static void casesPerRegion() {
		
		int[] regions = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int[] positives = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < Patient.myPatient.size(); i++) {
			if (Patient.myPatient.get(i).getRegion().equalsIgnoreCase("ΗΠΕΙΡΟΣ")) {
				regions[0]++;
				if (Patient.myPatient.get(i).isInfected() == true)
					positives[0]++;
			} else if (Patient.myPatient.get(i).getRegion().equalsIgnoreCase("ΘΕΣΣΑΛΙΑ")) {
				regions[1]++;
				if (Patient.myPatient.get(i).isInfected() == true)
					positives[1]++;
			} else if (Patient.myPatient.get(i).getRegion().equalsIgnoreCase("ΘΡΑΚΗ")) {
				regions[2]++;
				if (Patient.myPatient.get(i).isInfected() == true)
					positives[2]++;
			} else if (Patient.myPatient.get(i).getRegion().equalsIgnoreCase("ΚΡΗΤΗ")) {
				regions[3]++;
				if (Patient.myPatient.get(i).isInfected() == true)
					positives[3]++;
			} else if (Patient.myPatient.get(i).getRegion().equalsIgnoreCase("ΜΑΚΕΔΟΝΙΑ")) {
				regions[4]++;
				if (Patient.myPatient.get(i).isInfected() == true)
					positives[4]++;
			} else if (Patient.myPatient.get(i).getRegion().equalsIgnoreCase("ΝΗΣΟΙ ΑΙΓΑΙΟΥ ΠΕΛΑΓΟΥΣ")) {
				regions[5]++;
				if (Patient.myPatient.get(i).isInfected() == true)
					positives[5]++;
			} else if (Patient.myPatient.get(i).getRegion().equalsIgnoreCase("ΝΗΣΟΙ ΙΟΝΙΟΥ ΠΕΛΑΓΟΥΣ")) {
				regions[6]++;
				if (Patient.myPatient.get(i).isInfected() == true)
					positives[6]++;
			} else if (Patient.myPatient.get(i).getRegion().equalsIgnoreCase("ΠΕΛΟΠΟΝΝΗΣΟΣ")) {
				regions[7]++;
				if (Patient.myPatient.get(i).isInfected() == true)
					positives[7]++;
			} else if (Patient.myPatient.get(i).getRegion().equalsIgnoreCase("ΣΤΕΡΕΑ ΕΛΛΑΔΑ")) {
				regions[8]++;
				if (Patient.myPatient.get(i).isInfected() == true)
					positives[8]++;
			}
		}
		int count = 0;
		for (int x = 0; x < positives.length; x++) {
			count = count + positives[x];
		}
		if (Patient.myPatient.size() != 0 && count != 0) {
			System.out.println(
				 "Τα στατιστικά κρουσμάτων για τα 9 Γεωγραφικά Διαμερίσματα της Ελλάδας είναι τα εξής:\n\n"
			  + "Στο γεωγραφικο διαμέρισμα της Ηπείρου εντοπίζονται " + positives[0] + " κρούσματα σε σύνολο "
			  + regions[0] + " ελέγχων.\n"
			  + "Στην Ήπειρο εντοπίζεται το " + (positives[0] * 100 / count) + "% των κρουσμάτων πανελλαδικά.\n\n"
			  + "Στο γεωγραφικο διαμέρισμα της Θεσσαλίας εντοπίζονται " + positives[1] + " κρούσματα σε σύνολο "
			  + regions[1] + " ελέγχων.\n"
			  + "Στη Θεσσαλία εντοπίζεται το " + (positives[1] * 100 / count) + "% των κρουσμάτων πανελλαδικά.\n\n"
			  + "Στο γεωγραφικο διαμέρισμα της Θράκης εντοπίζονται " + positives[2] + " κρούσματα σε σύνολο "
			  + regions[2] + " ελέγχων.\n"
			  + "Στη Θράκη εντοπίζεται το " + (positives[2] * 100 / count) + "% των κρουσμάτων πανελλαδικά.\n\n"
			  + "Στο γεωγραφικο διαμέρισμα της Κρήτης εντοπίζονται " + positives[3] + " κρούσματα σε σύνολο "
			  + regions[3] + " ελέγχων.\n"
			  + "Στην Κρήτη εντοπίζεται το " + (positives[3] * 100 / count) + "% των κρουσμάτων πανελλαδικά.\n\n"
			  + "Στο γεωγραφικο διαμέρισμα της Μακεδονίας εντοπίζονται " + positives[4] + " κρούσματα σε σύνολο "
			  + regions[4] + " ελέγχων.\n"
			  + "Στην Μακεδονία εντοπίζεται το " + (positives[4] * 100 / count) + "% των κρουσμάτων πανελλαδικά.\n\n"
			  + "Στο γεωγραφικο διαμέρισμα των Νήσων Αγαίου Πελάγους εντοπίζονται " + positives[5] + " κρούσματα σε σύνολο "
			  + regions[5] + " ελέγχων.\n"
			  + "Στις Νήσους Αιγαίου Πελάγους εντοπίζεται το " + (positives[5] * 100 / count) + "% των κρουσμάτων πανελλαδικά.\n\n"
			  + "Στο γεωγραφικο διαμέρισμα της των Νήσων Ιονίου Πελάγους εντοπίζονται " + positives[6] + " κρούσματα σε σύνολο "
			  + regions[6] + " ελέγχων.\n"
			  + "Στις Νήσους Ιονίου Πελάγους εντοπίζεται το " + (positives[6] * 100 / count) + "% των κρουσμάτων πανελλαδικά.\n\n"
			  + "Στο γεωγραφικο διαμέρισμα της Πελοποννήσου εντοπίζονται " + positives[7] + " κρούσματα σε σύνολο "
			  + regions[7] + " ελέγχων.\n"
			  + "Στην Πελοπόννησο εντοπίζεται το " + (positives[7] * 100 / count) + "% των κρουσμάτων πανελλαδικά.\n\n"
			  + "Στο γεωγραφικο διαμέρισμα της Στερεάς Ελλάδας εντοπίζονται " + positives[8] + " κρούσματα σε σύνολο "
			  + regions[8] + " ελέγχων.\n"
			  + "Στην Στερεά Ελλάδα εντοπίζεται το " + (positives[8] * 100 / count) + "% των κρουσμάτων πανελλαδικά.\n");
		} else if (Patient.myPatient.size() != 0 && count == 0) {
			System.out.println(
				"Τα στατιστικά κρουσμάτων για τα 9 Γεωγραφικά Διαμερίσματα της Ελλάδας είναι τα εξής:\n\n"
			  + "Στο γεωγραφικο διαμέρισμα της Ηπείρου εντοπίζονται " + positives[0] + " κρούσματα σε σύνολο "
			  + regions[0] + " ελέγχων.\n\n"
			  + "Στο γεωγραφικο διαμέρισμα της Θεσσαλίας εντοπίζονται " + positives[1] + " κρούσματα σε σύνολο "
			  + regions[1] + " ελέγχων.\n\n"
			  + "Στο γεωγραφικο διαμέρισμα της Θράκης εντοπίζονται " + positives[2] + " κρούσματα σε σύνολο "
			  + regions[2] + " ελέγχων.\n\n"
			  + "Στο γεωγραφικο διαμέρισμα της Κρήτης εντοπίζονται " + positives[3] + " κρούσματα σε σύνολο "
			  + regions[3] + " ελέγχων.\n\n"
			  + "Στο γεωγραφικο διαμέρισμα της Μακεδονίας εντοπίζονται " + positives[4] + " κρούσματα σε σύνολο "
			  + regions[4] + " ελέγχων.\n\n"
			  + "Στο γεωγραφικο διαμέρισμα των Νήσων Αγαίου Πελάγους εντοπίζονται " + positives[5] + " κρούσματα σε σύνολο "
			  + regions[5] + " ελέγχων.\n\n"
			  + "Στο γεωγραφικο διαμέρισμα της των Νήσων Ιονίου Πελάγους εντοπίζονται " + positives[6] + " κρούσματα σε σύνολο "
			  + regions[6] + " ελέγχων.\n\n"
			  + "Στο γεωγραφικο διαμέρισμα της Πελοποννήσου εντοπίζονται " + positives[7] + " κρούσματα σε σύνολο "
			  + regions[7] + " ελέγχων.\n\n"
			  + "Στο γεωγραφικο διαμέρισμα της Στερεάς Ελλάδας εντοπίζονται " + positives[8] + " κρούσματα σε σύνολο "
			  + regions[8] + " ελέγχων.\n");
		} else {
			System.out.println("Δεν έχουν καταγραφεί εξεταζόμενοι. Αδυναμία εύρεσης αποτελεσμάτων.\n");
		}
	}
	
	/**
	 * This method is used to print the Covid-19 cases of a specific day.
	 * The method asks the user to input the day, month and year he or she wants
	 * get results from regarding the Covid-19 tests. After inputing the full date,
	 * the method searches every tested person's test full date in order to find if that
	 * matches with the one the user is searching. Afterwards, a message shows the
	 * data and statistics regarding the amount of tests made this specific day. 
	 * If no people were being tested that day a different message informs the user.
	 */
	public static void casesPerDay() {
		
		int myCovidTestDay, myCovidTestMonth, myCovidTestYear;
		System.out.println("Εισάγετε Ημέρα για Εύρεση Αποτελεσμάτων");
		myCovidTestDay = intException();
		System.out.println("Εισάγετε Μήνα για Εύρεση Αποτελεσμάτων");
		myCovidTestMonth = intException();
		System.out.println("Εισάγετε Έτος για Εύρεση Αποτελεσμάτων");
		myCovidTestYear = intException();
		int count = 0;
		int countPositives = 0;
		for (int i = 0; i < Patient.myPatient.size(); i++) {
			if (Patient.myPatient.get(i).getCovidTestDay() == myCovidTestDay && 
			Patient.myPatient.get(i).getCovidTestMonth() == myCovidTestMonth &&
			Patient.myPatient.get(i).getCovidTestYear() == myCovidTestYear) {
				count++;
				if (Patient.myPatient.get(i).isInfected() == true)
					countPositives++;
			}
		}
		if (count != 0) {
			System.out.println(
					"Στις " + myCovidTestDay + "/" + myCovidTestMonth + "/" + myCovidTestYear
				  + " διενεργήθηκαν " + count + " τεστ Covid-19 εκ των οποίων τα " + countPositives + " ήταν θετικά.\n"
				  + "Το ποσοστό θετικών κρουσμάτων την συγκεκριμένη ημέρα είναι " + (countPositives * 100 / count) + "%\n");
		} else {
			System.out.println("Δεν έγιναν έλεγχοι την συγκεκριμένη ημέρα. Αδυναμία εύρεσης αποτελεσμάτων.\n");
		}
		
	}
	
	/**
	 * This method is used to print the Covid-19 cases of a specific month.
	 * The method asks the user to input the month and year he or she wants
	 * get results from regarding the Covid-19 tests. After inputing these data,
	 * the method searches every tested person's test month and year in order to find 
	 * if that matches with the one the user is searching. 
	 * Afterwards, a message shows the data and statistics regarding the
	 * amount of tests made this specific month. 
	 * If no people were being tested that month a different message informs the user.
	 */
	public static void casesPerMonth() {
	
		int myCovidTestMonth, myCovidTestYear;
		System.out.println("Εισάγετε Μήνα για Εύρεση Αποτελεσμάτων");
		myCovidTestMonth = intException();
		System.out.println("Εισάγετε Έτος για Εύρεση Αποτελεσμάτων");
		myCovidTestYear = intException();
		int count = 0;
		int countPositives = 0;
		for (int i = 0; i < Patient.myPatient.size(); i++) {
			if (Patient.myPatient.get(i).getCovidTestMonth() == myCovidTestMonth &&
			Patient.myPatient.get(i).getCovidTestYear() == myCovidTestYear) {
				count++;
				if (Patient.myPatient.get(i).isInfected() == true)
					countPositives++;
			}
		}
		if (count != 0) {
			System.out.println(
					"Τον " + myCovidTestMonth + "o μήνα του έτους " + myCovidTestYear
				  + " διενεργήθηκαν " + count + " τεστ Covid-19 εκ των οποίων τα " + countPositives + " ήταν θετικά.\n"
				  + "Το ποσοστό θετικών κρουσμάτων το συγκεκριμένο μήνα είναι " + (countPositives * 100 / count) + "%\n");
		} else {
			System.out.println("Δεν έγιναν έλεγχοι το συγκεκριμένο μήνα. Αδυναμία εύρεσης αποτελεσμάτων.\n");
		}
		
	}
	
	/**
	 * This method is used to print the Covid-19 cases of a specific year.
	 * The method asks the user to input the year he or she wants
	 * get results from regarding the Covid-19 tests. After inputing the year,
	 * the method searches every tested person's test year in order to find 
	 * if that matches with the one the user is searching. 
	 * Afterwards, a message shows the data and statistics regarding the amount 
	 * of tests made this specific year. 
	 * If no people were being tested that year a different message informs the user.
	 */
	public static void casesPerYear() {
		
		int myCovidTestYear;
		System.out.println("Εισάγετε Έτος για Εύρεση Αποτελεσμάτων");
		myCovidTestYear = intException();
		int count = 0;
		int countPositives = 0;
		for (int i = 0; i < Patient.myPatient.size(); i++) {
			if (Patient.myPatient.get(i).getCovidTestYear() == myCovidTestYear) {
				count++;
				if (Patient.myPatient.get(i).isInfected() == true)
					countPositives++;
			}
		}
		if (count !=0 ) {
			System.out.println(
					"Το έτος " + myCovidTestYear + " διενεργήθηκαν " + count + " τεστ Covid-19 εκ των οποίων τα " 
					+ countPositives + " ήταν θετικά.\n" + "Το ποσοστό θετικών κρουσμάτων το συγκεκριμένο έτος είναι " 
					+ (countPositives * 100 / count) + "%\n");
		} else {
			System.out.println("Δεν έγιναν έλεγχοι το συγκεκριμένο έτος. Αδυναμία εύρεσης αποτελεσμάτων.\n");
		}
		
	}
	
	/**
	 * This method is used to print the Covid-19 cases per gender.
	 * The method searches every tested person's gender and test results.
	 * Gender informations are saved on the variables countMale, countFemale
	 * which stores the sum of all tested person's gender. The variables 
	 * positiveMale and positiveFemale stores the number of all the people who
	 * were tested positive for Covid-19 and differenciates them regarding their
	 * gender. Afterwards, a message shows statistics regarding every gender's 
	 * Covid-19 cases. 
	 * If no people were being tested a different message informs the user.
	 */
	public static void casesPerGender() {
		
		int countMale = 0, countFemale = 0, positiveMale = 0, positiveFemale = 0;
		for (int i = 0; i < Patient.myPatient.size(); i++) {
			if (Patient.myPatient.get(i).getGender().equalsIgnoreCase("ΑΝTΡΑΣ")) {
				countMale++;
				if (Patient.myPatient.get(i).isInfected() == true)
					positiveMale++;
			} else {
				countFemale++;
				if (Patient.myPatient.get(i).isInfected() == true)
					positiveFemale++;
			}
		}
		if (countMale != 0 && countFemale != 0) {
			System.out.println(
					"Σε σύνολο " + (countMale + countFemale) + " εξεταζόμενων, οι άνδρες είναι " + countMale
				  + " και οι γυναίκες είναι " + countFemale + ".\n" + "Τα κρούσματα στους άνδρες είναι " + positiveMale
				  + " (ποσοστό θετικών ανδρών στο σύνολο εξεταζόμενων ανδρών " + (positiveMale * 100 / countMale) + "%).\n"
				  + "Τα κρούσματα στις γυναίκες είναι " + positiveFemale + " (ποσοστό θετικών γυναικών στο σύνολο εξεταζόμενων γυναικών " 
				  + (positiveFemale * 100 / countFemale) + "%).\n");
		} else if (countMale == 0 && countFemale != 0) {
			System.out.println(
					"Σε σύνολο " + (countMale + countFemale) + " εξεταζόμενων, οι άνδρες είναι " + countMale
				  + " και οι γυναίκες είναι " + countFemale + ".\n" + "Τα κρούσματα στους άνδρες είναι " + positiveMale + ".\n"
				  + "Τα κρούσματα στις γυναίκες είναι " + positiveFemale + " (ποσοστό θετικών γυναικών στο σύνολο εξεταζόμενων γυναικών " 
				  + (positiveFemale * 100 / countFemale) + "%).\n");
		} else if (countMale != 0 && countFemale == 0) {
			System.out.println(
					"Σε σύνολο " + (countMale + countFemale) + " εξεταζόμενων, οι άνδρες είναι " + countMale
				  + " και οι γυναίκες είναι " + countFemale + ".\n" + "Τα κρούσματα στους άνδρες είναι " + positiveMale
				  + " (ποσοστό θετικών ανδρών στο σύνολο εξεταζόμενων ανδρών " + (positiveMale * 100 / countMale) + "%).\n"
				  + "Τα κρούσματα στις γυναίκες είναι " + positiveFemale + ".\n");
		} else {
			System.out.println("Δεν έχουν καταγραφεί εξεταζόμενοι. Αδυναμία εύρεσης αποτελεσμάτων.\n");
		}
		
	}
	
	/**
	 * This method is used to print the amount of positive Covid-19 tests.
	 * The method searches every tested person's test results.
	 * After calculating the total amount of positive tests a message shows
	 * some statistics and data regarding the amount of people who were tested
	 * positive for Covid-19
	 * If no people were being tested a different message informs the user.
	 */
	public static void casesOfPositive() {
		
		int count = Patient.myPatient.size();
		int countPositives = 0;
		for (int i = 0; i < Patient.myPatient.size(); i++) {
			if (Patient.myPatient.get(i).isInfected() == true) {
				countPositives++;
			}
		}
		if (count != 0) {
			System.out.println("Σε σύνολο " + count + " εξεταζόμενων, θετικοί παρουσιάστηκαν οι " + countPositives + ".\n"
					+ "Το ποσοστό των θετικών κρουσμάτων σε σχέση με το σύνολο είναι " + (countPositives * 100 / count) + "%.\n");
		} else {
			System.out.println("Δεν έχουν καταγραφεί εξεταζόμενοι. Αδυναμία εύρεσης αποτελεσμάτων.\n");
		}
		
	}
	
	/**
	 * This method is used to print the amount of negative Covid-19 tests.
	 * The method searches every tested person's test results.
	 * After calculating the total amount of negative tests a message shows
	 * some statistics and data regarding the amount of people who were tested
	 * negative for Covid-19
	 * If no people were being tested a different message informs the user.
	 */
	public static void casesOfNegative() {
		
		int count = Patient.myPatient.size();
		int countNegatives = 0;
		for (int i = 0; i < Patient.myPatient.size(); i++) {
			if (Patient.myPatient.get(i).isInfected() == false) {
				countNegatives++;
			}
		}
		if (count != 0) {
			System.out.println("Σε σύνολο " + count + " εξεταζόμενων, αρνητικοί παρουσιάστηκαν οι " + countNegatives + ".\n"
					+ "Το ποσοστό των αρνητικών κρουσμάτων σε σχέση με το σύνολο είναι " + (countNegatives * 100 / count) + "%.\n");
		} else {
			System.out.println("Δεν έχουν καταγραφεί εξεταζόμενοι. Αδυναμία εύρεσης αποτελεσμάτων.\n");
		}
		
	}
	
	/**
	 * This method is used to print the amount of Covid-19 cases per age category.
	 * The method searches every tested person's age and it stores on cases array
	 * the total amount of people from every age category and it stores on positiveCases
	 * array the total amount of people tested positive from every age category.
	 * The age categories are 5: 0-20 | 21-40 | 41-60 | 61-80 | 80+
	 * After calculating all the data a messages shows some statistics and data
	 * regarding the Covid-19 cases per age category.
	 * If no people were being tested a different message informs the user.
	 */
	public static void casesPerAge() {
		
		int[] cases = new int[] { 0, 0, 0, 0, 0 };
		int[] positiveCases = new int[] { 0, 0, 0, 0, 0 };
		for (int i = 0; i < Patient.myPatient.size(); i++) {
			if (Patient.myPatient.get(i).getAge() > 0 && Patient.myPatient.get(i).getAge() <= 20) {
				cases[0]++;
				if (Patient.myPatient.get(i).isInfected() == true )
					positiveCases[0]++;
			} else if (Patient.myPatient.get(i).getAge() > 20 && Patient.myPatient.get(i).getAge() <= 40) {
				cases[1]++;
				if (Patient.myPatient.get(i).isInfected() == true )
					positiveCases[1]++;
			} else if (Patient.myPatient.get(i).getAge() > 40 && Patient.myPatient.get(i).getAge() <= 60) {
				cases[2]++;
				if (Patient.myPatient.get(i).isInfected() == true )
					positiveCases[2]++;
			} else if (Patient.myPatient.get(i).getAge() > 60 && Patient.myPatient.get(i).getAge() <= 80) {
				cases[3]++;
				if (Patient.myPatient.get(i).isInfected() == true )
					positiveCases[3]++;
			} else {
				cases[4]++;
				if (Patient.myPatient.get(i).isInfected() == true )
					positiveCases[4]++;
			}
		}
		int positiveSum = positiveCases[0] + positiveCases[1] + positiveCases[2] + positiveCases[3] + positiveCases[4];
		if (Patient.myPatient.size() != 0 && positiveSum != 0) {
			System.out.println("Στην ηλικιακή κατηγορία 0-20 ετών εντοπίζονται " + cases[0] + " εξεταζόμενοι εκ των οποίων " + positiveCases[0] + " είναι θετικοί.\n"
					+ "Στην ηλικιακή κατηγορία 21-40 ετών εντοπίζονται " + cases[1] + " εξεταζόμενοι εκ των οποίων " + positiveCases[1] + " είναι θετικοί.\n"
					+ "Στην ηλικιακή κατηγορία 41-60 ετών εντοπίζονται " + cases[2] + " εξεταζόμενοι εκ των οποίων " + positiveCases[2] + " είναι θετικοί.\n"
					+ "Στην ηλικιακή κατηγορία 61-80 ετών εντοπίζονται " + cases[3] + " εξεταζόμενοι εκ των οποίων " + positiveCases[3] + " είναι θετικοί.\n"
					+ "Στην ηλικιακή κατηγορία 81+ ετών εντοπίζονται " + cases[4] + " εξεταζόμενοι εκ των οποίων " + positiveCases[4] + " είναι θετικοί.\n"
					+ "Ποσοστό θετικών στην κατηγορία 0-20 επί του συνόλου θετικών: " + (positiveCases[0]  * 100 / positiveSum) + "%\n"
					+ "Ποσοστό θετικών στην κατηγορία 21-40 επί του συνόλου θετικών: " + (positiveCases[1]  * 100 / positiveSum) + "%\n"
					+ "Ποσοστό θετικών στην κατηγορία 41-60 επί του συνόλου θετικών: " + (positiveCases[2]  * 100 / positiveSum) + "%\n"
					+ "Ποσοστό θετικών στην κατηγορία 61-80 επί του συνόλου θετικών: " + (positiveCases[3]  * 100 / positiveSum) + "%\n"
					+ "Ποσοστό θετικών στην κατηγορία 81+ επί του συνόλου θετικών: " + (positiveCases[4]  * 100 / positiveSum) + "%\n");
		} else if (Patient.myPatient.size() != 0 && positiveSum == 0) {
			System.out.println("Στην ηλικιακή κατηγορία 0-20 ετών εντοπίζονται " + cases[0] + " εξεταζόμενοι εκ των οποίων " + positiveCases[0] + " είναι θετικοί.\n"
					+ "Στην ηλικιακή κατηγορία 21-40 ετών εντοπίζονται " + cases[1] + " εξεταζόμενοι εκ των οποίων " + positiveCases[1] + " είναι θετικοί.\n"
					+ "Στην ηλικιακή κατηγορία 41-60 ετών εντοπίζονται " + cases[2] + " εξεταζόμενοι εκ των οποίων " + positiveCases[2] + " είναι θετικοί.\n"
					+ "Στην ηλικιακή κατηγορία 61-80 ετών εντοπίζονται " + cases[3] + " εξεταζόμενοι εκ των οποίων " + positiveCases[3] + " είναι θετικοί.\n"
					+ "Στην ηλικιακή κατηγορία 81+ ετών εντοπίζονται " + cases[4] + " εξεταζόμενοι εκ των οποίων " + positiveCases[4] + " είναι θετικοί.\n");
		} else if (Patient.myPatient.size() == 0) {
			System.out.println("Δεν έχουν καταγραφεί εξεταζόμενοι. Αδυναμία εύρεσης αποτελεσμάτων.\n");
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
