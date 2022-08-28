package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{

	private static final SimpleDateFormat sdf = new SimpleDateFormat();
	
//	ATRIBUTOS
	private Date dataFabricao;
	
//	CONSTRUTORES
	public ProdutoUsado() {}

	public ProdutoUsado(String nome, Double preco, Date dataFabricao) {
		super(nome, preco);
		this.dataFabricao = dataFabricao;
	}

//	GETTERS E SETTERS
	public Date getDataFabricao() {
		return dataFabricao;
	}

	public void setDataFabricao(Date dataFabricao) {
		this.dataFabricao = dataFabricao;
	}

//	MÉTODOS
	@Override
	public String toString() {
		return super.getNome()+" (usado) $"+super.getPreco()+" (Data de fabricação: )"+sdf.format(dataFabricao);
	}
	
	
	
}
