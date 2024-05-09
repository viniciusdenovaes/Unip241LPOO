package view;

import java.util.Collection;

import dados.Dados;
import entidade.Cachorro;

public class ViewSaidaCachorro {
	
	public static void showAllCachorros(Dados dados) {
		System.out.println();
		System.out.println("========================");
		System.out.println("Listando todos cachorros");
		for(var c: dados.getAllCachorros()) {
			System.out.println(c);
		}
		System.out.println("========================");
		System.out.println();
	}
	
	public static void showCachorroSearchByName(Dados dados) {
		String nomeBusca = ViewEntradaCachorro.getNomeBuscaFromUser();
		Collection<Cachorro> resultado = dados.searchCachorroByName(nomeBusca);
		if(resultado.size()==0) {
			System.out.println("Nenhum resultado encontrado");
		}
		System.out.println();
		System.out.println("==================================");
		System.out.println("Listando todos cachorros com nome " + nomeBusca);
		for(var c: resultado) {
			System.out.println(c);
		}
		System.out.println("==================================");
		System.out.println();
	}

}
