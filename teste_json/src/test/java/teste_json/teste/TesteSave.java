package teste_json.teste;

import java.util.Arrays;

import dao.DaoJson;
import entidades.Animal;
import entidades.Cliente;
import entidades.Dados;

public class TesteSave {
	
	public static void main(String[] args) {
		Dados dados = new Dados();
		
		Animal a1 = new Animal();
		a1.setNome("Brutus");
		a1.setIdade(7);
		
		Animal a2 = new Animal();
		a2.setNome("Rex");
		a2.setIdade(8);
		
		Animal a3 = new Animal();
		a3.setNome("Chirriro");
		a3.setIdade(4);
		
		Cliente c1 = new Cliente();
		c1.setNome("vini");
		c1.setAnimais(Arrays.asList(a1, a2, a3));
		
		dados.setClientes(Arrays.asList(c1));
		
		DaoJson.saveClientes("files/clientes.json", dados);
	}
	


}
