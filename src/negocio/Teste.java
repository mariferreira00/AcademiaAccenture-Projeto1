package negocio;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
		
		Curso cs1 = new Curso();
		
		System.out.println("Informe o c�digo do curso: ");
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
	
		System.out.println("Informa��es do Aluno -> " + aluno1.toString());
		
		input.close();
	}
		
	//menu principal
		/*Scanner sc = new Scanner(System.in);
		int opcao = 0;
	
    
    do{
		System.out.println("\n\n### MENU PRINCIPAL - Digite o n�mero da op��o desejada ###");
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
			//m�todo para inserir pessoa
			
			break;
			
		case 2:
			//m�todo para procurar pessoa
			break;
                
		case 3:
			//m�todo para remover pessoa
			
			break;
			
		case 4:
			//toString para exibir detalhes da pessoa
			
			break;
			
		case 0:
			System.out.println("Saindo da aplica��o, obrigada por usar nossos servi�os!");
			break;
			
		default:
			System.out.println("Op��o Inv�lida!");
			break;
		} sc.close();
	} while (opcao != 0);
    
	}*/
	}
		
		



