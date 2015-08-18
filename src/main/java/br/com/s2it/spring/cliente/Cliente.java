package br.com.s2it.spring.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cliente {

    @Autowired
    private ClienteBusiness clienteBusiness;

    public String getEnderecoByNome(String nome) {
        String resultado = nome+ " %s";

        if("Sergio".equals(nome)) {
            return String.format( resultado, clienteBusiness.getEnderecoByCep("1234"));
        }
        return String.format(resultado, clienteBusiness.getEnderecoByCep("Cep Generico"));
    }

}
