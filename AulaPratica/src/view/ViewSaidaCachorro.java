package view;

import java.util.Collection;

import dados.Dados;
import entidade.Cachorro;

public class ViewSaidaCachorro {
	
	public static void showAllCachorros(Dados dados) {
		for(var c: dados.getAllCachorros()) {
			System.out.println(c);
		}
	}
	
	public static void showCachorroSearchByName(Dados dados) {
		String nomeBusca = ViewEntradaCachorro.getNomeBuscaFromUser();
		Collection<Cachorro> resultado = dados.searchCachorroByName(nomeBusca);
		if(resultado.size()==0) {
			System.out.println("Nenhum resultado encontrado");
		}
		for(var c: resultado) {
			System.out.println(c);
		}
	}

}
