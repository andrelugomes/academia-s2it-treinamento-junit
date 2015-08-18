package br.com.s2it.spring.cliente;

import br.com.s2it.spring.config.AppConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.Matchers.is;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig.class)
public class ClienteTest {

    private static final String SERGIO = "Sergio";
    private static final String RENAN = "Renan";
    private static final String CEP = "1234";

    private static final String AV_ENDERECO_BY_CEP = "Av Endereço by cep";
    private static final String AV_BLABLABLA = "Av blablabla, 123";

    @Mock
    private ClienteBusiness clienteBusiness;

    @InjectMocks
    private Cliente cliente = new Cliente();

    @Before
    public void setUp() throws Throwable {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void deveRetornarOEnderecoDoSergio(){
        Mockito.when(clienteBusiness.getEnderecoByCep(Mockito.eq(CEP))).thenReturn(AV_ENDERECO_BY_CEP);
        Assert.assertThat(cliente.getEnderecoByNome(SERGIO), is(SERGIO+" "+AV_ENDERECO_BY_CEP));
    }

    @Test
    public void deveRetornarOEnderecoQualquer(){
        Mockito.when(clienteBusiness.getEnderecoByCep(Mockito.anyString())).thenReturn(AV_BLABLABLA);
        Assert.assertThat(cliente.getEnderecoByNome(RENAN), is(RENAN+ " "+AV_BLABLABLA));
    }
}
