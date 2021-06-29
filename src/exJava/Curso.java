package exJava;

public class Curso { //Classe Curso
	
	private int codigo; //atributo código - privado e do tipo int 
	private String nome; //atributo nome - privado e do tipo String
	
	public Curso() { //Ctor vazio
		
	}

	
	public Curso(int codigo, String nome) { //ctor com os atributos da classe passados nor parâmetros
		this.codigo = codigo;
		this.nome = nome;
	}
	 
	//Getters e Setters

	public int getCodigo() { 
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
