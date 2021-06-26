package exJava;

public class TesteAluno {

	public static void main(String[] args) { //Teste 
		
		Curso c1= new Curso(); //Criação de novo objeto da classe Curso
		c1.setCodigo(1); // Utilizamos o sets declarado na classe
		c1.setNome("Análise e Desenvolvimento de Sistemas");
		
		Curso c2=new Curso();
		c2.setCodigo(2);
		c2.setNome("Sistemas de Informação"); 
		
		Aluno a1=new Aluno(); //Criação de novo objeto da classe Aluno
		a1.setNome("Maria"); // Utilizamos os sets declarado na classe
		a1.setCpf("102.687.364-99");
		a1.setIdade(26);
		a1.setCurso(c1); // No momento da chamada desse atributo no print devemos lembrar de usar : c1.getCurso().getNome() para acessar o atributo nome da classe Curso

		Aluno a2=new Aluno();
		a2.setNome("Ana Lima");
		a2.setCpf("703.895.314-96");
		a2.setIdade(23);
		a2.setCurso(c2); // No momento da chamada desse atributo no print devemos lembrar de usar : c2.getCurso().getNome() para acessar o atributo nome da classe Curso
		 
		
		//Sysout para imprimir no console as informações
		System.out.println("| Aluno(a): " + a1.getNome() + " | CPF: " + a1.getCpf() + " | Idade: " + a1.getIdade() + " | Curso: " +a1.getCurso().getNome() + " |");
		System.out.println("| Aluno(a): " + a2.getNome() + " | CPF: " + a2.getCpf() + " | Idade: " + a2.getIdade() + " | Curso: " + a2.getCurso().getNome() + " |");
	}

}
