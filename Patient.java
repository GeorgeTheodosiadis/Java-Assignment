package Covid19_ergasia_ejamhnou;

import java.util.ArrayList;

public class Patient {
	private String firstName, lastName;
	private String gender, region, email;
	private int age, phoneNumber;
	private int covidTestDay, covidTestMonth, covidTestYear;
	private boolean infected;
	public static ArrayList<Patient> myPatient=new ArrayList<Patient>();
	
	public Patient(String fN,String lN,String gen,String reg,String em,int age,int pN,int cTD,int cTM,int cTY,boolean inf) {
		myPatient.add(this);
		this.firstName=fN;
		this.lastName=lN;
		this.gender=gen;
		this.region=reg;
		this.email=em;
		this.age=age;
		this.phoneNumber=pN;
		this.covidTestDay=cTD;
		this.covidTestMonth=cTM;
		this.covidTestYear=cTY;
		this.infected=inf;
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
