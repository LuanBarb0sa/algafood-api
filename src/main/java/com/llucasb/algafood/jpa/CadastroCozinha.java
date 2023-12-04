package com.llucasb.algafood.jpa;

import java.util.List;

import org.springframework.stereotype.Component;

import com.llucasb.algafood.domain.model.Cozinha;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Component
public class CadastroCozinha {

	@PersistenceContext
	private EntityManager em;

	public List<Cozinha> listar() {
		return em.createQuery("from Cozinha", Cozinha.class).getResultList();
	}
	
	@Transactional
	public Cozinha adicionarCozinha(Cozinha cozinha) {
		return em.merge(cozinha);
	}
	
	public Cozinha buscar (Long id) {
		return em.find(Cozinha.class, id);
	}
	
	@Transactional
	public void remover(Long id) {
		Cozinha cozinha = this.buscar(id);		
		em.remove(cozinha);
	}

}
