package br.com.s2it.produto.categoria;

import java.util.List;

public class CategoriaBusiness {

	private CategoriaRepository repository;

	public CategoriaBusiness(CategoriaRepository repository) {
		this.repository = repository;
	}

	public List<Categoria> listarTodasCategorias() {
		
		return this.repository.findAll();
	}

	public Categoria listarPorId(int id) {
		return repository.findById(id);
	}
	
}
