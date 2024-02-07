import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int y = 32;
		double x = 10.321;
		String nome = "Bruna";
		int idade = 21;
		double renda = 2133.3;
		System.out.print("hello word!");
		System.out.println("Oi!");
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		System.out.println("altura = " + x + " metros.");
		System.out.printf("Resultado = %.2f metros%n", x);
		System.out.printf("%s Ganha R$ %.2f reais aos %d anos", nome, renda, idade );
	}

}
