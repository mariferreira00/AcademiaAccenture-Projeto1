package negocio;

public class Professor extends Pessoa { //Cria��o da classe professor estendendo de Pessoa
	private double salario;

    public Professor(String nome, String cpf, int idade, double salario) { //ctor com parametros
        super(nome, cpf, idade);
        this.salario = salario;
    }

    public Professor() { //ctor vazio
    }
    
    //Getters and Setters

    public double getSalario() { 
        return salario;
    }

    public  void setSalario(double salario) {
        this.salario = salario;
    }
   
    public String toString() {
    	return "| Professor(a): : "
    			+ this.getNome()
    			+ "| CPF: "
    			+ this.getCpf()
    			+ "| Idade: "
    			+ this.getIdade()
    			+ "| Sal�rio: R$"
    			+ salario;
    }
}


