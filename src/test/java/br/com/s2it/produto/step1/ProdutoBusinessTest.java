package br.com.s2it.produto.step1;

import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import br.com.s2it.produto.Produto;
import br.com.s2it.produto.ProdutoBusiness;
import br.com.s2it.produto.ProdutoRepository;
import br.com.s2it.produto.categoria.Categoria;
import br.com.s2it.utils.MyRule;

/**
 * 
 * @author agomes
 * 
 * [] Injeção de Dependência (DI) 
 * [] Testando listas de produtos 
 * [] Testando a busca por ID de Produto 
 * [] Inicando com Mocks - Evitar fazer a consulta no banco de dados. Exemplos 
 * [] @Ignore - não executa o teste 
 * [] @Rule - mudando o comportamento dos testes. Ex.: Tirar screenshots com Selenium
 * [] Testar Exceptions. Ex.: @Test(expected = Exception.class)
 *
 */
public class ProdutoBusinessTest {

	@Rule
	public MyRule rule = new MyRule();

	@Test
	public void deveTestarUmaListaDeProdutos() {

		ProdutoRepository repository = new ProdutoRepository();
		ProdutoBusiness produtoBusiness = new ProdutoBusiness(repository);

		Assert.assertThat(produtoBusiness.listarTodosProdutos(), not(empty()));
	}

	@Test
	public void deveBuscarUmProdutoPorID() {
		ProdutoRepository repository = new ProdutoRepository();
		ProdutoBusiness produtoBusiness = new ProdutoBusiness(repository);

		Produto produto1 = new Produto(1, "Moto X", new Categoria(1, "Celulares"));

		Assert.assertThat(produtoBusiness.listarPorId(1).getNome(), equalTo(produto1.getNome()));
	}

	@Test
	public void deveConcederDescontoDe10Porcento() {
		// Mock do Repositório
		ProdutoRepository mock = mock(ProdutoRepository.class);

		// Criando o Business e Injetando o Repository
		ProdutoBusiness produtoBusiness = new ProdutoBusiness(mock);

		// Novo produto
		when(mock.findById(anyInt())).thenReturn(new Produto(234, "Nextell 4G", new Categoria(1, "Celulares")));

		// Assert para testar o retorno do Mock
		// Assert.assert....

		Assert.assertThat("Deve dar 10% de desconto", produtoBusiness.podeDarDesconto(1), equalTo("Conceder 10%"));
	}
	
	@Test
	public void deveValidarAlgo() {
		ProdutoRepository repo = new ProdutoRepository();
		ProdutoBusiness produtoBusiness = new ProdutoBusiness(repo);
		
		int idNaoExiste = 34134134;
		//produtoBusiness.listarPorId(idNaoExiste);
	}
}
