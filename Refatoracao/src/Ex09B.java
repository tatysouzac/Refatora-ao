
public class Ex09B {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A soma dos numeros de 1 a 10 é: ");
		soma();

	}
	private static void soma() {
		int result = 0;

		for (int x = 1; x < 11; x++) {

			result = result + x;

		}

		System.out.println(result);
	}
}
