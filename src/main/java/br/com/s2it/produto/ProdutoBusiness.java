package br.com.s2it.produto;

import java.util.List;

public class ProdutoBusiness {

	private ProdutoRepository repository;

	public ProdutoBusiness(ProdutoRepository repository) {
		this.repository = repository;
	}

	public List<Produto> listarTodosProdutos() {
		
		return this.repository.findAll();
	}

	public Produto listarPorId(int id) {
		return repository.findById(id);
	}
	
	public String podeDarDesconto(int idProduto){
	
		Produto produto = repository.findById(idProduto);
		
		switch (produto.getCategoria().getId()) {
		case 1:
			return "Conceder 10%";
		case 2:
			return "Conceder 20%";
		default:
			return "Sem desconto";
		}
	}
	
}
