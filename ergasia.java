import java.util.scanner;

public static void main(String args[]) {
	System.out.println("(1)�������� ����������� ������");
	System.out.println("(2)�������� ������������");
	System.out.println("(3)�������� ������ ������");
	System.out.println("(4)�������� �����������");
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
		System.out.println("(1)���������� ��� ���������� ����������");
		System.out.println("(2)���������� ��� ����� ��������");
		System.out.println("(3)���������� ��� ���� ��������");
		System.out.println("(4)���������� ��� ���� ��������");
		System.out.println("(5)��������� ������ ������ ��� ��������");
		System.out.println("(6)������� ������� ����������");
		System.out.println("(7)������� ��������� ����������");
		System.out.println("(8)���������� ��� �������� �����");
		int y = sc.nextInt();
		if (y == 1) {
			Statistics.casesPerRegion(String myRegion);
		}
		elseif (y == 2) {
			System.out.println("�������� �����, ���� ��� ����");
			int myCovidTestDay = sc.nextInt();
			int myCovidTestMonth = sc.nextInt();
			int myCovidTestYear = sc.nextInt();
			Statistics.casesPerDay(myCovidTestDay,myCovidTestMonth,myCovidTestYear);
		}
		elseif (y == 3) {
			System.out.println("�������� ���� ��� ����");
			int ctm = sc.nextInt();
			int cty = sc.nextInt();
			Statistics.casesPerMonth(ctm, cty);
		}
		elseif (y == 4) {
			System.out.println("�������� ����");
			int cty = sc.nextInt();
			Statistics.casesPerYear(cty);
		}
		elseif (y == 5) {
			System.out.println("�������� ����");
			String gen = sc.nextString();
			Statistics.casesPerGender(gen);
		}
		elseif (y == 6) {
			System.out.println("�������� ������ ���������");
			int krous = sc.nextInt();
			Statistics.casesOfPositive(krous);
		}
		elseif (y == 7) {
			System.out.println("�������� �������� ���������");
			int healthy = sc.nextInt();
			Statistics.casesOfNegative(healthy);
		}
		else {
			System.out.println("�������� ������");
			int age = sc.nextInt();
			Statistics.casesPerAge(age);
		}
	}
}
