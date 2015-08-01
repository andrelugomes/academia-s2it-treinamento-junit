package br.com.s2it.produto;

import br.com.s2it.produto.categoria.Categoria;

public class Produto {

	private int codigo;
	private String nome;
	private Categoria categoria;
	
	public Produto(int codigo, String nome, Categoria categoria) {
		this.codigo = codigo;
		this.nome = nome;
		this.categoria = categoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
	
}
