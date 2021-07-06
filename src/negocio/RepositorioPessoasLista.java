package negocio;

import java.util.*;

public class RepositorioPessoasLista implements RepositorioPessoas {

	private List<Pessoa> pessoas;

	public RepositorioPessoasLista() {
		pessoas = new ArrayList<Pessoa>();
	}

	public void inserir(Pessoa p) {

		pessoas.add(p);

	}

	public Pessoa procurar(String cpf) {
		Pessoa wtd = null;
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getCpf().equals(cpf))
				wtd = pessoa;

		}
		return wtd;
	}

	public void remover(String cpf) {
		int posicao = -1;
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				posicao = pessoas.indexOf(pessoa);
				break;
			}

		}
		if (posicao != -1)
			pessoas.remove(posicao);

	}

	public List<Pessoa> listarPessoas() {
		return this.pessoas;
	}

}
