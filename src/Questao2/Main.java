package Questao2;

public class Main {
	public static void main(String[] args) {
		Alunos a1 = new Alunos(5);
		a1.adicionar("Mateus ", 01, " TI");
		a1.adicionar("Mateus ", 02, " TI");
		a1.adicionar("Mateus ", 03, " TI");
		a1.adicionar("Mateus ", 04, " TI");
		a1.adicionar("Mateus ", 05, " TI");
		a1.qtsPosVazia();
		if (a1.cheio()) {
			a1.novoTamanho(5);
		}
		a1.adicionar("Mateus ", 06, " TI");
		
	}
	
}
