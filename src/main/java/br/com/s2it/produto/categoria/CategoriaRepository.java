package br.com.s2it.produto.categoria;

import java.util.Arrays;
import java.util.List;

import br.com.s2it.produto.categoria.Categoria;

/**
 * 
 * @author agomes
 *
 * Acesso ao banco de Dados de categoria
 */
public class CategoriaRepository {

	public List<Categoria> findAll() {

		return Arrays.asList(new Categoria(1, "Celulares"), 
				new Categoria(2, "Informatica"), 
				new Categoria(3, "Tablets"));
	}

	public Categoria findById(int id) {

		List<Categoria> todasCategorias = findAll();
		Categoria categoria = null;

		try {
			// Array começa com index 0
			categoria =  todasCategorias.get(id - 1);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Não achou o ID no indice do Array");
			throw new IndexOutOfBoundsException();
		}
		
		return categoria;
	}
}
