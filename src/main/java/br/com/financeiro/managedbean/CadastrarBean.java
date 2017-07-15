package br.com.financeiro.managedbean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class CadastrarBean {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean validar(){
		if(this.getNome().length()>3){
			return true;
		}
		return false;
	}
	
	public void realizaCadsatro(){
		if(validar()){
			cadastrar();
		}
		else{
			erro();
		}
	}
	
	public void cadastrar() {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cadastro efetuado",
				"Cliente " + this.getNome()+ " cadastrado com sucesso");
		context.addMessage(null, mensagem);

	}
	public void erro(){
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Erro ao cadastrar","Erro");
		context.addMessage(null, message);
	}
	
}
