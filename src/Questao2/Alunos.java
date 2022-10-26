package Questao2;

public class Alunos {
	private String[] aluno;
    private String nome;
    private int matricula;
    private String curso;
    
    private int topo;
    private int tam_max;
    
    // Construtor
    public Alunos(int quantidade) {
    	aluno = new String[quantidade];
    	tam_max = quantidade;
    	topo = 0;
    }
    
    public void adicionar(String nome, int matricula, String curso) {
    	aluno[topo] = nome + matricula + curso;
    	System.out.println(aluno[topo]);
    	topo++;
    }
    
    public void qtsPosVazia() {
    	if ((tam_max - topo) == -1) {
    		tam_max = 4;
    		topo = 0;
    	}
    	System.out.println("A quantidade vazia é de: " + (tam_max - topo));
    }
    
    public boolean cheio() {
        return (topo == tam_max);
    }
    
    public void remover() {
    	topo--;
    }
    
    public void novoTamanho(int novoTamanho) {
    	String aluno2[] = new String[aluno.length * novoTamanho];
    	for (int i = 0; i < aluno.length; i++) {
    		aluno2[i] = aluno[i];
		}
    	aluno = aluno2;
    }

}
