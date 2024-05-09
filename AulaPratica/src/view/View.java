package view;

import java.util.Scanner;

import dados.Dados;
import dao.DaoCachorro;
import entidade.Cachorro;

public class View {
	
	public static final String FILE_NAME = "files/cachorros.csv";
	
	Dados dados = new Dados();
	
	public void init() {
		
		DaoCachorro.preencheDados(FILE_NAME, dados);
		menu();
	}
	
	public void save() {
		DaoCachorro.saveDados(FILE_NAME, dados);
	}
	
	public void menu() {
		
		int opcao = -1;
		while(opcao!=0) {
			System.out.println("Escolha: ");
			System.out.println("1 - para listar");
			System.out.println("2 - para adicionar");
			System.out.println("3 - para modificar idade");
			System.out.println("0 - para sair");
			Scanner in = new Scanner(System.in);
			
			String opcaoString = in.nextLine();
			try {
				opcao = Integer.parseInt(opcaoString);
			}catch (NumberFormatException e) {
				opcao = -1;
			}
			switch (opcao) {
			case 1: {
				menuListar();
				break;
			}
			case 2: {
				menuAdicionar();
				break;
			}
			case 3: {
				menuModificarIdade();
				break;
			}
			case 0: {
				save();
				break;
			}
			default:
				System.out.println("Opcao \""+ opcaoString+ "\" invalida");
			}
		}
	}
	
	
	public void menuListar() {
		
		int opcao = -1;
		System.out.println("Escolha: ");
		System.out.println("1 - para listar todos");
		System.out.println("2 - para buscar por nome");
		Scanner in = new Scanner(System.in);
		
		String opcaoString = in.nextLine();
		try {
			opcao = Integer.parseInt(opcaoString);
		}catch (NumberFormatException e) {
			opcao = -1;
		}
		switch (opcao) {
		case 1: {
			ViewSaidaCachorro.showAllCachorros(dados);
			break;
		}
		case 2: {
			ViewSaidaCachorro.showCachorroSearchByName(dados);
			break;
		}
		default:
			System.out.println("Opcao \""+ opcaoString+ "\" invalida");
			System.out.println("Voltando ao menu inicial");
		}
	}
	
	
	
	
	public void menuAdicionar() {
		
		Cachorro novoCachorro = ViewEntradaCachorro.getNewCachorroFromUser();
		dados.addCachorro(novoCachorro);
		
	}
	
	
	
	public void menuModificarIdade() {
		
		System.out.println("Entre com o nome do cachorro:");
		ViewSaidaCachorro.showCachorroSearchByName(dados);
		
		System.out.println("Entre com o id do cachorro:");
		Scanner in = new Scanner(System.in);
		String idString = in.nextLine();
		try {
			int id = Integer.parseInt(idString);
			Cachorro c = dados.getCachorroById(id);
			if(c==null) {
				System.out.println("Id " + id + " nao encontrado");
				return;
			}
			System.out.println("Modificando a idade do cachoro " + c);
			int novaIdade = ViewEntradaCachorro.getIdadeCachorroFromUser();
			c.setIdade(novaIdade);
			System.out.println("cachorro modificado: " + c);
			
		}catch (NumberFormatException e) {
			System.out.println("formato do id: \"" + idString + "\" invalido");
			System.out.println("voltando ao menu inicial");
			return;
		}
		
	}
	
	
	
	
	
}
