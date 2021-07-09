package dados;

import negocio.Pessoa;

public class RepositorioPessoasArray {

	private Pessoa[] pessoas;
	private int indice;
	private static int totalDePessoas;
	
	RepositorioPessoasArray(){
		
	}
	RepositorioPessoasArray (int tamanho){
	indice = 0;
	pessoas = new Pessoa[tamanho];	
	}
				//Método de inserir pessoas
	public void inserir(Pessoa x) throws RepositorioException {
		pessoas [indice] = x;
		indice = indice + 1;
		RepositorioPessoasArray.totalDePessoas = RepositorioPessoasArray.totalDePessoas + 1;
	}
	
				//Método de procurar pessoas
	public Pessoa procurarString (String numCPF) throws Exception {
		Pessoa procurado = null;
	for (int i=0; i< indice; i++ ) {
		Pessoa aux = this.pessoas[i];
		if (aux.getCpf().equals(numCPF))
			procurado = aux;
	}
		return procurado;
}
				//Método de remover pessoas
	public void remover (String numCPF) throws Exception {
		for (int i=0; i< indice; i++ ){
			Pessoa aux = this.pessoas[i];
			if(aux.getCpf().equals(numCPF)) {
			this.pessoas[i] = this.pessoas[indice -1];
			this.pessoas[indice -1] = null;
			indice = indice -1;
			System.out.println("CPF removido: "+numCPF);
			RepositorioPessoasArray.totalDePessoas = RepositorioPessoasArray.totalDePessoas - 1;
			}
			else {
				throw new Exception("Exception message");
			}
		}
		
	}	

	public static int getTotalDePessoas() {
		return RepositorioPessoasArray.totalDePessoas;
	}
	
	
	
	public String toString() {
		return super.toString();
					
		}


}	