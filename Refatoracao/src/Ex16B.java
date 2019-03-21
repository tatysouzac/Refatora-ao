import java.util.Scanner;

public class Ex16B {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vetor[] = new int[10];
		
		lerVet(vetor);
		mostrarVet(vetor); 
	}
	public static void lerVet(int vetor[]) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite 10 numeros para colocar no vetor");
		for (int x = 0; x < 10; x++) {

			vetor[x] = leia.nextInt();

		}
	}
	public static void mostrarVet(int vetor[]) {
		System.out.println("Valores guardados no vetor");
		for (int i = 9; i >= 0; i--) {
			System.out.println(vetor[i]);
		}
	}

}
