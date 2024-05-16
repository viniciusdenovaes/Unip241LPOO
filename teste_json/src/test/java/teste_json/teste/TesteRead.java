package teste_json.teste;

import dao.DaoJson;
import entidades.Dados;

public class TesteRead {
	public static void main(String[] args) {
		
		Dados dados = DaoJson.loadClientes("files/clientes.json");
		System.out.println(dados);
	}
	

}
