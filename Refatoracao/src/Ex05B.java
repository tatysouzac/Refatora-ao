import java.util.Scanner;

public class Ex05B {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cod;

		Scanner leia = new Scanner(System.in);

		System.out.println("1- Venda a Vista no dinheiro");
		System.out.println("2- Venda a vistano d�bito");
		System.out.println("3- 1x no cart�o de cr�dito");
		System.out.println("4- 3x vezes com juros no cart�o de cr�dito");
		System.out.println("5- 6x no cart�o de cr�dito");
		cod = leia.nextInt();
		
		 validar(cod);
	}
	
	private static void validar(int cod) {
		switch (cod) {
		case 1:
			System.out.println("Desconto de 12%");
			break;
		case 2:
			System.out.println("Desconto de 3%");
			break;
		case 3:
			System.out.println("Mesmo pre�o");
			break;
		case 4:
			System.out.println("Acr�scimo de 5%");
			break;
		case 5:
			System.out.println("Acr�scimo de 10%");
			break;
		default:
			System.out.println("Essa op��o n�o exite");

		}

	}



}
