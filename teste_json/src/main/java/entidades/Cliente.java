package entidades;

import java.util.List;

public class Cliente {
	
	private String nome;
	private List<Animal> animais;
	
	
	
	
	
	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public List<Animal> getAnimais() {
		return animais;
	}





	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}





	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", animais=" + animais + "]";
	}
	
	

}
