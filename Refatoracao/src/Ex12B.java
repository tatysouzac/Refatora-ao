import java.util.Scanner;

public class Ex12B {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int n1 = 0, n2 = 0;

		System.out.println("Digite dois numeros entre 0 e 10 que sejam diferentes - Digite primeiro numero");
		do {
			n1 = leia.nextInt();
			if (n1 < 0 || n1 > 10) {
				System.out.println("Numero precisa ser entre 0 e 10 por favor digite novemente");
			}

		} while (n1 <= 0 || n1 >= 11);

		System.out.println("Digite segundo numero");

		do {
			do {
				n2 = leia.nextInt();
				if (n2 == n1) {
					System.out.println("Os numeros precisam ser diferentes digite novamente");
				}

				if (n2 < 0 || n2 > 10) {
					System.out.println("Numero precisa ser entre 0 e 10 por favor digite novemente");
				}
			} while (n2 == n1);
		} while (n2 <= 0 || n2 >= 11);
		
		multiplos(n1, n2);

	}
	
	private static void multiplos(int n1, int n2) {
		System.out.println("Os numeros multiplos de " + n1 + "e" + n2 + "sao:");
		for (int x = 1; x < 1000; x++) {
			if (x % n1 == 0 && x % n2 == 0) {
				System.out.println(x);
			}
		}
	}


}
