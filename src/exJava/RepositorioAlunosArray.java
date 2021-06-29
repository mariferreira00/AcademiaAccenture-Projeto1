package exJava;

public class RepositorioAlunosArray {
	private Aluno[] alunos;
	private int indice;

	public RepositorioAlunosArray(int tamanho) {
		indice = 0;
		alunos = new Aluno[tamanho];
	}
	//método para inserir aluno
	public void inserir(Aluno a) {
		alunos[indice] = a;
		indice = indice + 1;
	}

	//método para procurar Aluno, passando o cpf como parâmetro
	public Aluno procurar(String cpf) {
		for (int x = 0; x < indice; x++) {
			Aluno wtd = this.alunos[x];
			if (wtd.getCpf().equals(cpf))
				return wtd;
		}
		return null;
	}

//método para remover aluno passando cpf como parâmetro
	public void remover(String cpf) {
		for (int x = 0; x < indice; x++) {
			Aluno wtd = this.alunos[x];
			if (wtd.getCpf().equals(cpf)) {
				this.alunos[x] = this.alunos[indice - 1];
				this.alunos[indice - 1] = null;
				indice = indice - 1;
			}
		}
	}
}
