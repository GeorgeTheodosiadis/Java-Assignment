import java.util.ArrayList;

public class Patient {
	private String firstName, lastName;
	private String gender, region, email;
	private int age, phoneNumber;
	private int covidTestDay, covidTestMonth, covidTestYear;
	private boolean infected;
	public static ArrayList<Patient> myPatient = new ArrayList<Patient>();
	
	public Patient(String firstName, String lastName, String gender, String region, String email, int age,
		       int phoneNumber, int covidTestDay, int covidTestMonth, int covidTestYear, boolean infected) {
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
