
public class Ex13B {
	public static void main(String[] args) {

		System.out.println("Numeros de 100 a 0 que são par");
		pares();
	}
	public static void pares() {
		for (int x = 100; x >= 0; x--) {

			if (x % 2 == 0) {
				System.out.println(x);
			}
		}

	}
}
