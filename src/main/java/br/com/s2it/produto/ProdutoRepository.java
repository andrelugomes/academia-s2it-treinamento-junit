package br.com.s2it.produto;

import java.util.Arrays;
import java.util.List;

import br.com.s2it.produto.categoria.Categoria;

/**
 * 
 * @author agomes
 *
 *         Acesso ao banco de Dados
 */
public class ProdutoRepository {

	public List<Produto> findAll() {

		return Arrays.asList(new Produto(1, "Moto X", new Categoria(1, "Celuares")), 
				new Produto(2, "Dell Vostro i7",new Categoria(2, "Informatica")), 
				new Produto(3, "Galaxy Note 2", new Categoria(3, "Tablets")));
	}

	public Produto findById(int id) {

		List<Produto> todosOsProdutos = findAll();
		Produto produto = null;

		try {
			// Array começa com index 0
			produto =  todosOsProdutos.get(id - 1);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Não achou o ID no indie do Array");
			throw new IndexOutOfBoundsException();
		}
		
		return produto;
	}
}
