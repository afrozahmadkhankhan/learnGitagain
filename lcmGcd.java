
import java.util.Scanner;

public class Alphanumeric {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int temp=solve(n1, n2);
		System.out.println(temp);

	}

	public static int solve(int n1, int n2) {
		int min = 0;
		int gcd=0;
		min = (n1 < n2) ? n1 : n2;
		for (int i=1;i<=min;i++) {
			if (n1%i == 0 && n2 % i == 0) {
				
				gcd=i;
			}
		
		}
		return gcd;
	}

}