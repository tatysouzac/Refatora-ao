import java.util.Scanner;

public class Ex10B {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		soma();
	}

	private static void soma() {
		int x;
		int result = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite os numeros para somar quando terminar digite 0");
		do {
			x = leia.nextInt();
			result = result + x;
		} while (x != 0);
		System.out.println("O resultado da soma é " + result);
	}

}
