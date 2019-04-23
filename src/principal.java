import java.util.Scanner;

public class principal {
	static Scanner entrada = new Scanner(System.in);
	static int yB;
	static int age;
	static String nElector;
	static Boolean validOK;

	public static void main(String[] args) throws Exception {
		System.out.print(
				"Observações para preencher seu nome e sobrenome: \n(Inicie somente com uma letra maiúscula seu nome e sobrenome (este no maxímo 16 caracteres e com espaço simples entre seu primeiro nome) e \nUtilize apenas letras. \n Qual seu nome?");
		nElector = entrada.nextLine();

		validOK = (validacao.validaString(nElector));

		for (; validOK != true;) {
			System.out.print("Algo deu errado, verifique seus dados! \n Qual seu nome?");
			nElector = entrada.nextLine();
			validOK = (validacao.validaString(nElector));
		}

		System.out.print("Qual seu ano de Nascimento?");
		yB = entrada.nextInt();
		age = calcIdade.calcAge(yB);

		if (age < 16) {
			System.out.println("Ainda não tem idade para votar!");
		} else {
			System.out.println("Muito bem " + nElector + ", exerça sua cidadania!");
		}
		System.out.println("Quem nasceu em " + yB + ", tem " + calcIdade.calcAge(yB) + " anos.");
	}
}