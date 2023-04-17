package edu.fatec.exercicio2;

public class ListaCompras implements Calculavel{
	
	private ItemCompra[] itensCompra;
	private int qtdMaxima;
	
	public ListaCompras(int qtdMaxima) {
		this.qtdMaxima  = qtdMaxima;
	}
	
	//método adicionar itens da compra
	public void incluir(ItemCompra item) {
		int qtd = 0;
		if(qtd == qtdMaxima) {
			return;
		}
		itensCompra[qtd++] = item;
	}
	
	//método calcular preco (implements calculavel)
	public double calcularPreco() {
		double total = 0;
		for(ItemCompra item: itensCompra) {
			total += item.getProduto().getPreco();
		}
		return total;
	}


	public ItemCompra[] getItensCompra() {
		return itensCompra;
	}

	public void setItensCompra(ItemCompra[] itensCompra) {
		this.itensCompra = itensCompra;
	}

	public int getQtdMaxima() {
		return qtdMaxima;
	}

	public void setQtdMaxima(int qtdMaxima) {
		
	}	
	
	public static void main(String args[]) {
		Supermercado sp = new Supermercado();
		Produto pr = new Produto(sp);
		ItemCompra item = new ItemCompra(pr, 10);
		ListaCompras lst = new ListaCompras(10);
		lst.incluir(item);
		
		
		for(ItemCompra item1: lst.getItensCompra()) {
			System.out.print(item1.getProduto().getNome());
		}
	}
	
}
