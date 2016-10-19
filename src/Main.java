import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Напишете програма, която приема две цели числа - съответно страната и височината на триъгълник. 
		//Пресметнете лицето на дадения триъгълник и я изведете на конзолата.

Scanner scan = new Scanner(System.in);
System.out.println("Въведи две цели числа: ");
	int a = scan. nextInt();
	int h = scan.nextInt();
	double x = (double) (a*h)/2;
	
	System.out.println("Лицето на триъгълника е : " + x);
	
	}

}
