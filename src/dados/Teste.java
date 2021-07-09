package dados;


import java.util.List;
import java.util.Scanner;

import negocio.Aluno;
import negocio.Curso;
import negocio.Professor;


public class Teste {

	public static void main(String[] args) throws RepositorioException {
		Scanner input = new Scanner(System.in);
		//RepositorioPessoasArray rep = new RepositorioPessoasArray(20);
		AlunoDAO psd = new AlunoDAO();
		ProfessorDAO prof = new ProfessorDAO();	
		int opcao = 0;

		do {
			System.out.println("MENU PRINCIPAL - Selecione uma das opções abaixo: \n");
			System.out.println("         =============================");
			System.out.println("         |     1 - Inserir ALUNO      |");
			System.out.println("         |     2 - Inserir PROFESSOR  |");
			System.out.println("         |     3 - Remover  ALUNO     |");
			System.out.println("         |     4 - Remover PROFESSOR  |");		
			System.out.println("         |     0 - Sair               |");
			System.out.println("         =============================\n");
			opcao = input.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Insira um nome: \n");			
				String nome = input.next();	
				System.out.println("Insira um cpf: \n");
				String cpf = input.next();	
				System.out.println("Insira uma idade: \n");			
				int idade = input.nextInt();
				System.out.println("Insira o código do Curso: \n");
				int codCurso = input.nextInt();				
				System.out.println("Insira o nome do Curso: \n");
				String nomeCurso = input.next();
				Curso curso1 = new Curso(codCurso, nomeCurso);				
				Aluno aluno = new Aluno();
				aluno.setNome(nome);
				aluno.setCpf(cpf);
				aluno.setIdade(idade);
				aluno.setCurso(curso1);
				psd.adiciona(aluno);
				System.out.println("Aluno Registrado com Sucesso!");
				System.out.println("Listando todos os alunos cadastrados: ");
				
				List<Aluno> alunos = psd.getLista();
				
				for(int i=0;i<alunos.size();i++){
					System.out.println("=========================================");
		            System.out.println("Aluno(a): " + alunos.get(i).getNome());
		            System.out.println("CPF: " + alunos.get(i).getCpf());
		            System.out.println("Idade: " + alunos.get(i).getIdade());
		            System.out.println("Curso: " + alunos.get(i).getCurso().getNome() + " | Código: " +  alunos.get(i).getCurso().getCodigo());
		            System.out.println("=========================================");
				}
			
				
				
				break;

			case 2:
				System.out.println("Insira um nome: \n");			
				String nomeProf = input.next();	
				System.out.println("Insira um cpf: \n");
				String cpfProf = input.next();				
				System.out.println("Insira uma idade: \n");				
				int idadeProf = input.nextInt();				
				System.out.println("Insira o valor do Salário: \n");
				int salarioProf = input.nextInt();	
				Professor professor = new Professor();
				professor.setNome(nomeProf);
				professor.setCpf(cpfProf);
				professor.setIdade(idadeProf);
				professor.setSalario(salarioProf);	
				prof.adiciona(professor);
				System.out.println("Listando todos os professores cadastrados: ");
		
		List<Professor> professores = prof.getLista();
		
		for(int i=0;i<professores.size();i++){
			System.out.println("=========================================");
            System.out.println("Professor(a): " + professores.get(i).getNome());
            System.out.println("CPF: " + professores.get(i).getCpf());
            System.out.println("Idade: " + professores.get(i).getIdade());
            System.out.println("Salário: " + professores.get(i).getSalario());
            System.out.println("=========================================");
		}
				break;

			/*case 3:
				System.out.println("Digite o cpf do aluno que deseja REMOVER: ");				
				String cpfProcura = input.next();

				try {
					 Pessoa p = rep.procurarString(cpfProcura);					 
					 System.out.println(p.toString());
				} catch(Exception e) {					
					System.out.println("CPF não encontrado!");
				}
				break;

			case 4:
				System.out.println("######Lista atual de pessoas: "+((RepositorioPessoasLista)rep).listarPessoas());
				System.out.println("Digite o cpf que deseja REMOVER: ");								
				String procuradoRemover = input.next();				
				try {
				rep.remover(procuradoRemover);
				} catch(Exception e) {				
					System.out.println("CPF não encontrado!");
				}
				System.out.println("######Lista atual de pessoas: "+((RepositorioPessoasLista)rep).listarPessoas());
				System.out.println("-- FIM --");
				break;*/
				
			case 0:
				System.out.println("Encerrando a aplicação... Volte sempre!");
				break;

			default:
				System.out.println("Opção: "+ opcao);
				System.out.println("Opção Inválida!");
				break;
			}			
		} while (opcao != 0);
	
		input.close();
	}
	}
		

		
		



