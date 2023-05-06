import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n sayısını giriniz: ");
		int n = input.nextInt();
		System.out.print("r sayısını giriniz: ");
		int r = input.nextInt(), factorialN = 1, factorialR = 1, factorialNMinusR = 1, combinationNR;
		for (int i = 1; i <= n; i++) factorialN *= i;
		for (int i = 1; i <= r; i++) factorialR *= i;
		for (int i = 1; i <= n - r; i++) factorialNMinusR *= i;
		combinationNR = factorialN / (factorialR * factorialNMinusR);
		System.out.println("C(n, r) = " + combinationNR);
	}

}
