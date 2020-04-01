package variaveis.executavel;

public class ProjetoVariaveisClass {
	/*variavel global é acessivel a todos*/
	static int criancaIdade = 7;
	public static void main(String[]args) {
		int maiorIdade = 18;
		int idosoIdade = 60;
		String cpf = "145.785.789-54";
		System.out.println("Maior idade é: " + maiorIdade);
		System.out.println("Idoso idade é: " + idosoIdade);
		System.out.println("Meu CPF é: " + cpf);
		/*variavel local porque pertence somente a este metodo*/
		int jovemIdade = 16;
		System.out.println("Valor da variavel local: " + jovemIdade);
		System.out.println("Valor da variavel global: " + criancaIdade);
		metodo();
		metodoOperacoes();
		metodoCaracteres();
	}
	public static void metodo() {
		System.out.println("Valor da variavel global: " + criancaIdade);
		/*System.out.println("Valor da variavel local: " + jovemIdade);*/
	}
	public static void metodoOperacoes() {
		int nota1 = 90;
		int nota2 = 70;
		int nota3 = 50;
		int nota4 = 88;
		System.out.println("Media das notas = " + (nota1 + nota2 + nota3 + nota4) / 4);
		
		double nota5 = 90;
		double nota6 = 70;
		double nota7 = 50;
		double nota8 = 88;
		
		double media = (nota5 + nota6 + nota7 + nota8) / 4;
		System.out.println("Media das notas = " + media);
	}
	public static void metodoCaracteres() {
		char pessoaFisica = 'F';
		char pessoaJuridica = 'J';
		if(pessoaFisica == 'F') {
			System.out.println("Pessoa Física");
		}
		if (pessoaJuridica == 'J') {
			System.out.println("Pessoa Jurídica");
		}
		
		String texto = "sakdjujfehs345u5$##&&dmnsfjbHHHSH lbfjhdbkjfbwhb    fdlkjcdj";
		String nome = "Alexandre Luís";
		String cpf = "999999999-99";
		String telefone = "51 999999999";
		String endereco = "Torres - RS";
		String saida = "Meu nome é: " + nome + 
				" , de CPF: " + cpf + 
				" , com o telefone de número: " + telefone + 
				" e moro em " + endereco;
		System.out.println(texto);
		System.out.println(saida);
	}
}