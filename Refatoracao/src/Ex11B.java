
public class Ex11B {
	public static void main(String[] args) {

		parMultiplo();
	}
	public static void parMultiplo() {
		for (int x = 0; x < 1000; x++) {
			if (x % 2 == 0 && x % 3 == 0) {
				System.out.println("O numero " + x + " é par e multiplo de três");
			}
		}

	}
}
