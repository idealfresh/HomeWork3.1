import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//�������� ��������, ����� ������ ��� ���� ����� - ��������� �������� � ���������� �� ����������. 
		//����������� ������ �� ������� ���������� � � �������� �� ���������.

Scanner scan = new Scanner(System.in);
System.out.println("������ ��� ���� �����: ");
	int a = scan. nextInt();
	int h = scan.nextInt();
	double x = (double) (a*h)/2;
	
	System.out.println("������ �� ����������� � : " + x);
	
	}

}
