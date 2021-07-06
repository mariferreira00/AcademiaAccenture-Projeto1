package negocio;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
		
		Curso cs1 = new Curso();
		
		System.out.println("Informe o código do curso: ");
		cs1.setCodigo(input.nextInt());  
		
		System.out.println("Informe o nome do curso: ");
		cs1.setNome(input.next()); 
		
		Aluno aluno1 = new Aluno();
		aluno1.setCurso(cs1);
		
		System.out.println("Informe o nome e sobrenome da pessoa a ser cadastrada: ");
		aluno1.setNome(input.next());
		
		
		System.out.println("Informe o CPF: ");
		aluno1.setCpf(input.next());
		
		System.out.println("Informe a idade: ");
		aluno1.setIdade(input.nextInt ());
	
		System.out.println("Informações do Aluno -> " + aluno1.toString());
		
		input.close();
	}
		
	//menu principal
		/*Scanner sc = new Scanner(System.in);
		int opcao = 0;
	
    
    do{
		System.out.println("\n\n### MENU PRINCIPAL - Digite o número da opção desejada ###");
		System.out.println("\n                ===================================");
		System.out.println("                  |     1 - Cadastrar Pessoa     |");
		System.out.println("                  |     2 - Procurar Pessoa      |");
		System.out.println("                  |     3 - Remover Pessoa       |");
		System.out.println("                  |     4 - Exibir detalhes      |");
		System.out.println("                  |     0 - Sair                 |");
		System.out.println("                 ===================================\n");

		
		
		opcao = sc.nextInt();
		
		
		switch (opcao) {
		
		case 1:
			//método para inserir pessoa
			
			break;
			
		case 2:
			//método para procurar pessoa
			break;
                
		case 3:
			//método para remover pessoa
			
			break;
			
		case 4:
			//toString para exibir detalhes da pessoa
			
			break;
			
		case 0:
			System.out.println("Saindo da aplicação, obrigada por usar nossos serviços!");
			break;
			
		default:
			System.out.println("Opção Inválida!");
			break;
		} sc.close();
	} while (opcao != 0);
    
	}*/
	}
		
		



