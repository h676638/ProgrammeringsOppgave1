import java.util.Scanner;

public class OppgaveO3 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = myObj.nextInt();
		if (num < 1) {
			System.out.println("invalid nummer, must be higher than 0.");
		}
		else {
		int n = 1;
		for(int i = 0;i<num;i++) {
			n = (i+1)*n;
		System.out.println(n);
		}}
		

	}

}
