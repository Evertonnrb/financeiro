package br.com.domain;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.junit.Test;

import br.com.financeiro.model.Lancamento;
import br.com.financeiro.model.Pessoa;
import br.com.financeiro.model.TipoLancamento;
import br.com.financeiro.util.JpaUtil;

public class ClienteTest {	

	EntityManager em = JpaUtil.getEntityManager();
	EntityTransaction manager = em.getTransaction();
	
	private Calendar dataVencimento1 = Calendar.getInstance();
	private Calendar dataVencimento2 = Calendar.getInstance();
	
	
	@Test
	public void salvar(){
		
		Pessoa cliente = new Pessoa();
		cliente.setNome("www Indústri de alimentos");
		dataVencimento1.set(2013,10,1,0,0,0);
		
		
		Pessoa fornecedor = new Pessoa();
		fornecedor.setNome("SoftBrax treinamentos");
		dataVencimento2.set(2013,12,1,0,0,0);
		
		Lancamento lancamento1 = new Lancamento();
		lancamento1.setDescrisao("Venda de licença de software");
		lancamento1.setDataVencimento(dataVencimento1.getTime());
		lancamento1.setDataPagamento(dataVencimento1.getTime());
		lancamento1.setValor(new BigDecimal(103.000));
		lancamento1.setTipoLancamento(TipoLancamento.RECEITA);
		lancamento1.setPessoa(fornecedor);
		
		Lancamento lancamento2 = new Lancamento();	
		lancamento2.setDescrisao("Venda de suporte anula");
		lancamento2.setPessoa(cliente);
		lancamento2.setDataPagamento(dataVencimento1.getTime());
		lancamento2.setDataVencimento(dataVencimento1.getTime());
		lancamento2.setValor(new BigDecimal(77.000));
		lancamento2.setTipoLancamento(TipoLancamento.DESPESA);
		
		Lancamento lancamento3 = new Lancamento();
		lancamento3.setDescrisao("Treinamento tecnico");
		lancamento3.setPessoa(cliente);
		lancamento3.setDataPagamento(dataVencimento2.getTime());
		lancamento3.setDataVencimento(dataVencimento2.getTime());
		lancamento3.setValor(new BigDecimal(12.000));
		lancamento3.setTipoLancamento(TipoLancamento.DESPESA);
		
		manager.commit();
		em.persist(cliente);
		em.persist(fornecedor);
		em.persist(lancamento1);
		em.persist(lancamento2);
		em.persist(lancamento3);
		
		em.close();
	}
}
