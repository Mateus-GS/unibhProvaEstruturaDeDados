package Aluno;

public class Aluno {
	private String[] aluno;
    private String nome;
    private int matricula;
    private String curso;
    
    private int topo;
    private int tam_max;
    
    // Construtor
    public Aluno(int quantidade) {
    	aluno = new String[quantidade];
    	tam_max = quantidade;
    	topo = 0;
    }
    
    public void adicionar(String nome, int matricula, String curso) {
    	aluno[topo] = nome + matricula + curso;
    	topo++;
    }
}
