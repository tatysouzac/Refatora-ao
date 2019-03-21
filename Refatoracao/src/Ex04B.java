import java.util.Scanner;

public class Ex04B {
	private static Scanner leia;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		int num3;

		System.out.println("Digite tres numeros");
		num1 = leitura("leia 1");
		num2 = leitura("leia 2");
		num3 = leitura("leia 3");
		ordenar(num1, num2, num3);
	}

	public static int leitura(String string) {
		leia = new Scanner(System.in);
		return leia.nextInt();
	}

	private static void ordenar(int num1, int num2, int num3) {
		if (num1 < num2 && num2 < num3) {
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
		}

		if (num1 < num3 && num3 < num2) {
			System.out.println(num1);
			System.out.println(num3);
			System.out.println(num2);
		}
		if (num3 < num1 && num1 < num2) {
			System.out.println(num3);
			System.out.println(num1);
			System.out.println(num2);
		}

		if (num2 < num1 && num1 < num3) {
			System.out.println(num2);
			System.out.println(num1);
			System.out.println(num3);
		}

		if (num2 < num3 && num3 < num1) {
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num1);
		}
		if (num3 < num2 && num2 < num1) {
			System.out.println(num3);
			System.out.println(num2);
			System.out.println(num1);
		}
	}

}
