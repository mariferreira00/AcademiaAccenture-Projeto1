package exJava;

public class Aluno { //Classe Aluno
	private String nome; //atributos privados com seus respectivos tipos e nomes
	private String cpf;
	private int idade;
	private Curso curso;
	
	public Aluno() { //Ctor vazio
		
	}
	
	public Aluno(String nome, String cpf, int idade, Curso curso) { //Ctor com os atributos da classe passados nor parâmetros
		this.nome=nome;
		this.cpf=cpf;
		this.idade=idade;
		this.curso=curso;
	}
	
	//Getters e Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
}
