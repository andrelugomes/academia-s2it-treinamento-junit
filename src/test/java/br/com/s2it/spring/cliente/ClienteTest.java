
package br.com.s2it.spring.cliente;

import static org.hamcrest.Matchers.is;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.s2it.spring.config.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig.class)
public class ClienteTest {
	
	@Autowired
	private ClienteBusiness clienteBusiness;
	
	@Test
	public void deveRetornarOEnderecoDoCliente(){
		Assert.assertThat(clienteBusiness.endereco(), is("Av blablabla, 123"));
	}

}
