package dados;

import java.util.*;

import negocio.Pessoa;
import negocio.RepositorioPessoas;

public class RepositorioPessoasLista implements RepositorioPessoas {

	private List<Pessoa> pessoas;
	
	
	public RepositorioPessoasLista () {
		pessoas = new ArrayList<Pessoa>();
	}
	

	public void inserir(Pessoa x) throws RepositorioException {
		 
		 for(Pessoa p : pessoas) {
			 if(p.getCpf().equals(x.getCpf())) {
				 throw new RepositorioException();
			 }
		 }
		 pessoas.add(x);
	}
		

	public Pessoa procurarString(String numCPF) throws Exception {
		
		Pessoa procurada = null;
		for (Pessoa pessoa: pessoas) {
			if(pessoa.getCpf().equals(numCPF)) {
				System.out.println("CPF encontrado!");
				procurada = pessoa;
			}
		}
		return procurada;
	}

	
	public void remover(String numCPF) throws Exception {
		int posicao = -1;
		for (Pessoa pessoa: pessoas) {
			if (pessoa.getCpf().equals(numCPF)) {
				posicao = pessoas.indexOf(pessoa);
				break;
				
			}
		}
		if (posicao != -1) {
			pessoas.remove(posicao);
			System.out.println("CPF removido: "+numCPF);
		}else {
			throw new Exception("Exception message");
		}
	}

	public List<Pessoa> listarPessoas(){
		return this.pessoas;
	}

}
