import java.util.Scanner;

public class Ex18B {
	public static void main(String[] args) {

		int vet[] = new int[10];

		lerVet(vet);
		ordenar(vet);
		mostrarVet(vet);

	}
	public static void lerVet(int vet[]) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite 10 numeros para armazenar no vetor");
		for (int x = 0; x < 10; x++) {
			vet[x] = leia.nextInt();
		}

	}
	public static void ordenar(int vet[]) {
		for (int i = 0; i < 10; i++) {
			for (int y = 0; y < 10; y++) {
				if (vet[y] > vet[i]) {
					int aux = vet[y];
					vet[y] = vet[i];
					vet[i] = aux;
				}
			}
		}
	}
	public static void mostrarVet(int vet[]) {
		System.out.println("Vetor ordenado");
		for (int a = 0; a < 10; a++) {
			System.out.println(vet[a]);
		}

	}
}
