package negocio;


public class RepositorioPessoasArray implements RepositorioPessoas{
	private Pessoa [] pessoas;
    private int indice;
    private static int totalDePessoas;

    public RepositorioPessoasArray(int tamanho){
        indice = 0;
        pessoas = new Pessoa[tamanho];
    }

    public void inserir(Pessoa pessoa){
        pessoas[indice] = pessoa;
        indice = indice + 1;
        RepositorioPessoasArray.totalDePessoas = RepositorioPessoasArray.totalDePessoas + 1;

    }

    public Pessoa procurar(String cpf){
        
        for (int i = 0; i<indice;i++){
            Pessoa wtd = this.pessoas[i];
            if(wtd.getCpf().equals(cpf)){
                return wtd;
            }
        }

        return null;
    }
    

    public void remover(String cpf){
        for (int i = 0; i<indice; i++){
            Pessoa wtd = this.pessoas[i];
            if (wtd.getCpf().equals(cpf)){

                this.pessoas[i] = this.pessoas[indice - 1];
                this.pessoas[indice - 1] = null;
                indice =  indice - 1;
                RepositorioPessoasArray.totalDePessoas = RepositorioPessoasArray.totalDePessoas - 1;
            }
        }

    }
	public static int getTotalDePessoas() {
		return RepositorioPessoasArray.totalDePessoas;
	}
}