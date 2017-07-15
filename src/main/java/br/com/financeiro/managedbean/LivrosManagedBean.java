package br.com.financeiro.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.financeiro.model.Livro;

@ManagedBean
public class LivrosManagedBean {
	
	private List<Livro> livros;
	private Livro novoLivro;
	
	
	
	public LivrosManagedBean(List<Livro> livros, Livro novoLivro) {
		super();
		this.livros = new ArrayList<Livro>();
		this.novoLivro = new Livro();
	}

	public List<Livro> getLivros() {
		return livros;
	}
	
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
	public Livro getNovoLivro() {
		return novoLivro;
	}
	
	public void setNovoLivro(Livro novoLivro) {
		this.novoLivro = novoLivro;
	}
	
	public List<Livro> addLivros(){
		livros = new ArrayList<Livro>();
		livros.add(new Livro("Java","Deitel"));
		livros.add(new Livro("Android","Thiengo"));
		livros.add(new Livro("Python","Guanabara"));
		return livros;
	}
	
	public void adicionarLivro(){
		this.livros.add(novoLivro);
		this.novoLivro = new Livro();
	}
}
