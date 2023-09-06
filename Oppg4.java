import java.util.Scanner;

public class Oppg4 {

	public static void main(String[] args) {
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter your income: ");
		int income = myobj.nextInt();
		if (income < 190349) {
			System.out.println(income);
		}
		else if (income >= 190350 && income < 267899){
			System.out.println(income*0.983);
		}
		else if (income >= 267900 && income < 643799){
			System.out.println(income*0.96);
		}
		else if (income >= 643800 && income < 969199){
			System.out.println(income*0.866);
		}
		else if (income >= 969200 && income < 1999999){
			System.out.println(income*0.836);
		}
		else if (income >= 2000000){
			System.out.println(income*0.826);
		}
					
		}

}
