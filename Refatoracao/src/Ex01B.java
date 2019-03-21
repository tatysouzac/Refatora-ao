import java.util.Scanner;

public class Ex01B {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;

		System.out.println("Digite primeiro numero:");
		num1 = leitura("leia");
		System.out.println("Digite segundo numero:");
		num2 = leitura("leia");
		validar(num1, num2);
	}
	public static int leitura(String string) {
		Scanner entrada = new Scanner(System.in);
		return entrada.nextInt();
	}
		
	private static void validar(int num1, int num2){
		
		if (num1 > num2) {
			System.out.println("O maior numero é o " + num1);
		} else
			System.out.println("O maior numero é o " + num2);
	
	}
}
