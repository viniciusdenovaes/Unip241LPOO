package teste_io_csv;

public class Cachorro {
	
	private String nome;
	private int idade;
	
	
	
	public Cachorro(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}



	@Override
	public String toString() {
		return "Cachorro [nome=" + nome + ", idade=" + idade + "]";
	}
	
	

}
