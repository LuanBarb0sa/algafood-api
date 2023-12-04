package com.llucasb.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.llucasb.algafood.AlgafoodApiApplication;
import com.llucasb.algafood.domain.model.Cozinha;

public class InclusaoCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE).run(args);
		
		CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);
		List<Cozinha> cozinhas = cadastroCozinha.listar();
		
		Cozinha cozinha1 = new Cozinha();
		cozinha1.setNome("Americana Teste 123456");
		cadastroCozinha.adicionarCozinha(cozinha1);
		
		Cozinha cozinha2 = new Cozinha();
		cozinha2.setNome("Mexicana teste 12346565");
		cadastroCozinha.adicionarCozinha(cozinha2);
		
	}

}
