package ItemsPedidos;

import Produto.Produto;

public class ItemPedido {
	// Geral
	double valor;
    int quantidade;
    Produto[] produto;
    
    // Quest�o A
    private int primeiroNo;
    private int ultimoNo;
    public ItemPedido(int quantidade) {
    	produto = new Produto[quantidade];
	}
    
    // Quest�o B
    ItemPedido proximo;
    ItemPedido anterior;
    int numeroDeNos;
    public void ItemPedido2 () {
    	proximo = anterior = null;
        numeroDeNos = 0;
    }

    // Quest�o C
    private int topo;
    private int tam_max;
    
    public void ItemPedido3 (int quantidade) {
    	int[] Produto = new int[quantidade];
    	tam_max = quantidade;
    	topo = 0;
    }
}
