package br.com.financeiro.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputText;

@ManagedBean
//@RequestScoped	//Escopo de requisisao (durante a req)
@ViewScoped 		//"  	" de sessao  (ate um refresh nav f5)
//@SessionScoped		//" 	" de sessao (durante toda a sessao)
//@ApplicationScoped	//"		" de aplicacao (compartilhamento)
public class NomesBean {
	private String nome;
	private List<String> nomes = new ArrayList<String>();
	
	private HtmlInputText inputNome;
	private HtmlCommandButton botaoAdicionar;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<String> getNomes() {
		return nomes;
	}
	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}
	public HtmlCommandButton getBotaoAdicionar() {
		return botaoAdicionar;
	}
	public void setBotaoAdicionar(HtmlCommandButton botaoAdicionar) {
		this.botaoAdicionar = botaoAdicionar;
	}
	public void setInputNome(HtmlInputText inputNome) {
		this.inputNome = inputNome;
	}
	public HtmlInputText getInputNome() {
		return inputNome;
	}
	public void adicionar(){
		nomes.add(nome);
		if(this.nomes.size()>3){
			this.inputNome.setDisabled(true);
			this.botaoAdicionar.setDisabled(true);
			this.botaoAdicionar.setValue("Lista de nomes cheia");
		}
	}
	public String encaminha(){
		nomes.add(nome);
		if(this.nomes.size()>0)
			return "hello";
		
		return null;
		
	}
	
}
