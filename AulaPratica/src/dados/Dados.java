package dados;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import entidade.Cachorro;

public class Dados {
	
	private Map<Integer, Cachorro> cachorros = new TreeMap<>();
	
	public void addCachorro(Cachorro c) {
		this.cachorros.put(c.getId(), c);
	}
	
	public Cachorro getCachorroById(int id) {
		return this.cachorros.get(id);
	}
	
	public Collection<Cachorro> getAllCachorros(){
		List<Cachorro> allCachorros = new ArrayList<>(cachorros.values());
		allCachorros.sort(new ComparadorCachorroNome());
		return allCachorros;
	}
	
	public Collection<Cachorro> searchCachorroByName(String key){
		List<Cachorro> resultado = new ArrayList<>();
		for(Cachorro c: cachorros.values()) {
			if(c.getNome().toLowerCase().contains(key.toLowerCase().trim())) {
				resultado.add(c);
			}
		}
		resultado.sort(new ComparadorCachorroNome());
		return resultado;
	}
	
	private class ComparadorCachorroNome implements Comparator<Cachorro>{

		@Override
		public int compare(Cachorro o1, Cachorro o2) {
			if(!o1.getNome().equals(o2.getNome())) {
				return o1.getNome().compareTo(o2.getNome());
			}
			return Integer.compare(o1.getIdade(), o2.getIdade());
		}
		
	}

}
