import java.util.Scanner;

public class Ex06B {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int n1;
		int n2;
		int cod;
		int result=0;
		
		System.out.println("Calculadora");
		System.out.println("Digite primeiro numero");
		n1 = leitura("leia");
		System.out.println("Digite segundo numero");
		n2 = leitura("leia");
		System.out.println("O código da operação desejada");
		System.out.println("1- Soma");
		System.out.println("2- Subtração");
		System.out.println("3- Multiplicação");
		System.out.println("4- Divisão");
		cod = leitura("leia");
		Calcular(cod, result, n1, n2);
	}
	
	public static int leitura(String string) {
		Scanner leia = new Scanner(System.in);
		return leia.nextInt();
	}

	private static void Calcular(int cod, int result, int n1, int n2) {
		switch (cod) {
		case 1:
			result = n1 + n2;
			System.out.println("O resultado é " + result);
			break;
		case 2:
			result = n1 - n2;
			System.out.println("O resultado é " + result);
			break;
		case 3:
			result = n1 * n2;
			System.out.println("O resultado é " + result);
			break;
		case 4:
			if (n2 == 0) {
				System.out.println("Não é possivel dividir por zero ");
				break;
			} else
				result = n1 / n2;
			System.out.println("O resultado é " + result);
			break;
			default:
				System.out.println("Opçao nao existe");
				break;
		}

	}


}
