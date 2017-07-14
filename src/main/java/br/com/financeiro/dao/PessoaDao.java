package br.com.financeiro.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.financeiro.model.Pessoa;

public class PessoaDao {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("FinanceiroEE");
	private EntityManager manager = factory.createEntityManager();
	
			
	public void cadPessoa(Pessoa p){
		p = new Pessoa();
		p.setNome(p.getNome());
		manager.persist(p);
		manager.close();
	}
	
	
}
