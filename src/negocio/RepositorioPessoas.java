package negocio;

public interface RepositorioPessoas {
	public void inserir(Pessoa x);	
	public Pessoa procurarString(String numCPF);	
	public void remover(String numCPF);
}