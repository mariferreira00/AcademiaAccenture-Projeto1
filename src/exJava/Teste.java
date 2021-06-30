package exJava;

public class Teste {
	 public static void main(String[] args) {
		 
		 	Curso c1 = new Curso(01, "Análise e Desenvolvimento de Sistemas");
	        Curso c2 = new Curso(02, "Ciência da Computação");
	        
	        Aluno a1 = new Aluno("Maria Ferreira","111.222.333-00", 26, c1);
	        Aluno a2 = new Aluno("Felipe Neto","888.999.555-11", 28, c2);
	        
	        Professor p1 = new Professor("Fernando Aires", "123,687,458-85", 38, 3800);
	        
	        RepositorioPessoasArray r =  new RepositorioPessoasArray(10);

	        r.inserir(a1);
	        r.inserir(a2);
	        r.inserir(p1);
	        
	        
	        Pessoa wtd = r.procurar("111.222.333-00");
	        if (wtd == null) { // validação do parâmetro passado utilizando as condicionais if else
				System.out.println("Não existe nenhum registro de pessoa com o cpf informado");
			} else {
				System.out.println("Pessoa encontrada com sucesso, nome: " + wtd.getNome() + ", cpf:  " + wtd.getCpf());
			}
	        
	        

	        wtd = r.procurar("888.999.555-11");
	        if (wtd == null){
	            System.out.println("Não existe nenhum registro de pessoa com o CPF informado!");
	        }else {
	            r.remover("888.999.555-11");
	            System.out.println("Pessoa : "+ wtd.getNome()+ " - Status: removida com sucesso!");
	        }

	    }
	}


