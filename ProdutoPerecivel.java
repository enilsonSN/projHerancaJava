
public class ProdutoPerecivel extends Produto {
	int validade;
	
	ProdutoPerecivel(String nome, int quantidade,double preco, int validade) {
		super(nome, quantidade, preco);
		
		this.validade= validade;
	}
	public void retiraEstoque(int qtde){
		if (validade<2){
			super.quantidade=0;
		}
		else {
			quantidade-= qtde;
		}
	}
	public void entraEstoque(int qtde){
		if (quantidade==0){
			quantidade+=qtde;
		}
		
	}
	public String toString() {
	
		return super.toString()+ "\n"+validade;
	}

}
