import java.util.Scanner;

public class Ex03B {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia;
		int num1;

		leia = new Scanner(System.in);

		System.out.println("Digite numero que eu vou dizer o mes");
		num1 = leia.nextInt();

		CompMes(num1);
	}

	private static void CompMes(int num1) {
		switch (num1) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Mar�o");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
		default:
			System.out.println("Essa op��o n�o exite");

		}
	}

}
