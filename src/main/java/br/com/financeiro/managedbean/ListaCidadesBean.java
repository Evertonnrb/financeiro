package br.com.financeiro.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ListaCidadesBean {
	private String cidadeNatal;
	private List<String> todasCidades;

	public ListaCidadesBean() {
		this.todasCidades = new ArrayList<String>();
		this.todasCidades.add("Sao Paulo");
		this.todasCidades.add("Rio de Janeiro");
		this.todasCidades.add("Minas Gerais");
		this.todasCidades.add("Campo grande");
		this.todasCidades.add("Natal");
	}

	public String getCidadeNatal() {
		return cidadeNatal;
	}

	public void setCidadeNatal(String cidadeNatal) {
		this.cidadeNatal = cidadeNatal;
	}

	public List<String> getTodasCidades() {
		return todasCidades;
	}
}
