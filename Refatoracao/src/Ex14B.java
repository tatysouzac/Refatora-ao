
public class Ex14B {	
	public static void main(String[] args) {

		System.out.println(" Números ímparese e múltiplos de 9 de -1000 a 0: ");
	imparesMulti();

}
public static void imparesMulti() {
	for (int x = -1000; x < 0; x++) {
		if (x % 2 == 0) {

			if (x % 9 == 0) {
				System.out.println(x);
			}
		}
	}	
}

}
