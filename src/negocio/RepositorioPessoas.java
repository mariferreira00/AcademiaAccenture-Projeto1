package negocio;

public interface RepositorioPessoas {
	
	 void inserir(Pessoa pessoa);
	 Pessoa procurar(String numCPF);
	 void remover(String numCPF);

}
