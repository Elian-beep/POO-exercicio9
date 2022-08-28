package entities;

public class ProdutoImportado extends Produto{
	
//	ATRIBUTOS
	private Double taxaAlfandega;
	
//	CONSTRUTORES
	public ProdutoImportado() {}

	public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}

//	MÉTODOS
	public double valorTotal() {
		return super.getPreco() + taxaAlfandega;
	}
	
	@Override
	public String toString() {
		return super.getNome()+" $"+valorTotal()+" (Taxa Alfândega: $"+String.format("%.2f", taxaAlfandega)+")";
	};
	
}
