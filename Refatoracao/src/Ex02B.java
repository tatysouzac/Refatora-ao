import java.util.Scanner;

public class Ex02B {
	private static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;

		System.out.println("Digite primeiro numero:");
		num1 = leitura("leia 1");
		System.out.println("Digite segundo numero:");
		num2 = leitura("leia 2");
		comparar(num1, num2);

	}
	public static int leitura(String string){
	entrada = new Scanner(System.in);
	return entrada.nextInt();
	}
	
	private static void comparar(int num1,int num2) {
		if (num1 < num2) {
			System.out.println("O menor numero é o " + num1);
		} else
			System.out.println("O menor numero é o " + num2);

	}


}
