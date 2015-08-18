package br.com.s2it.spring.cliente;

import org.springframework.stereotype.Component;


@Component
public class ClienteBusiness {

    public String endereco() {

        return "Av blablabla, 123";
    }

    public String getEnderecoByCep(String cep) {
        if("1234".equals(cep)) {
            return "Av Endereço by cep";
        }
        return endereco();
    }


}
