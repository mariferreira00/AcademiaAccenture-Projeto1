package negocio;

import dados.RepositorioException;

public interface RepositorioPessoas {
	
	public void inserir(Pessoa x) throws RepositorioException;
	public Pessoa procurarString(String numCPF) throws Exception;	
	public void remover(String numCPF) throws Exception;
}