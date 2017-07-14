package br.com.financeiro.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="hello")
@RequestScoped				//Registra no iniciao da sessao
public class HelloWorldBean {
	
	private String nome;
	private String sobrenome;
	private String nomeCompleto;
	private List<String> nomes = new ArrayList<String>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nome + sobrenome;
	}
	
	public String dizerOla(){
		return nome+ " " +sobrenome; 
	}
	
	public List<String> getNomes() {
		return nomes;
	}
	
	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}
	
	public void addNomes(){
		nomes.add(this.nomeCompleto);
	}
}
