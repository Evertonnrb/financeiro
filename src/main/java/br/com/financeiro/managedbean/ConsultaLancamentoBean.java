package br.com.financeiro.managedbean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.financeiro.model.Lancamento;
import br.com.financeiro.util.JpaUtil;

@ManagedBean
@ViewScoped
public class ConsultaLancamentoBean {
	private List<Lancamento> lancamentos;
	
	public void consultar(){
		EntityManager manager = JpaUtil.getEntityManager();
		TypedQuery<Lancamento> query = manager.createQuery("from Lancamento",Lancamento.class);
		this.lancamentos = query.getResultList();
		manager.close();
	}
	public List<Lancamento> getLancamentos() {
		return lancamentos;
	}
}
