package entidade;

public class Cachorro{
	
	private static int maiorId = 0;
	
	private int id;
	private String nome;
	private int idade;
	
	
	
	public Cachorro(int id, String nome, int idade) {
		
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		
		updateMaiorId();
		
	}

	private void updateMaiorId() {
		if(this.id>maiorId) {
			maiorId = this.id;
		}
	}
	
	public static Cachorro createNewCachorro(String nome, int idade) {
		return new Cachorro(maiorId+1, nome, idade);
	}


	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}



	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	@Override
	public String toString() {
		return "" + id + " - " + nome + ", idade: " + idade;
	}
	
	

}
