package apidesafio.desafio.model;

import java.math.BigDecimal;

public class Produto {

	private final String id;
	private final String descricao;
	private final BigDecimal preco;

	public Produto(String id, String descricao, BigDecimal preco) {
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
	}

	public String getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

}
