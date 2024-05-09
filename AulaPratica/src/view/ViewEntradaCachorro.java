package view;

import java.io.IOException;
import java.util.Scanner;

import entidade.*;

public class ViewEntradaCachorro {
	
	public static Cachorro getNewCachorroFromUser() {
		System.out.println("Entre com os dados do cachorro:");
		String nome = getNomeCachorroFromUser();
		int idade = getIdadeCachorroFromUser();
		return Cachorro.createNewCachorro(nome, idade);
	}
	
	public static String getNomeCachorroFromUser() {
		System.out.println("Entre com o nome do cachorro:");
		try {
			return getNomeFromUser();
		}catch (NomeVazioException e) {
			System.out.println(e.getMessage());
			System.out.println("tente novamente");
			return getNomeCachorroFromUser();
		}
	}
	
	
	public static String getNomeFromUser() throws NomeVazioException {
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		if(nome.trim().equals("")) {
			throw new NomeVazioException("nome \"" + nome + "\" eh vazio");
		}
		return nome.trim();
	}
	
	
	public static String getNomeBuscaFromUser() {
		System.out.println("Entre com a busca do nome do cachorro:");
		try {
			return getNomeFromUser();
		}catch (NomeVazioException e) {
			System.out.println("impossivel buscar");
			System.out.println(e.getMessage());
			System.out.println("tente novamente");
			return getNomeBuscaFromUser();
		}
	}
	
	public static int getIdadeCachorroFromUser() {
		System.out.println("Entre com a idade do cachorro:");
		try {
			return getIdadeFromUser();
		}catch (IdadeFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("Tente novamente");
			return getIdadeCachorroFromUser();
		}
		
	}
	
	public static int getIdadeFromUser() throws IdadeFormatException{
		Scanner in = new Scanner(System.in);
		String idadeString = in.nextLine();
		try {
			int idade = Integer.parseInt(idadeString);
			if(idade<0) {
				throw new IdadeFormatException("Idade " + idade + " eh negativa");
			}
			return idade;
		}catch (NumberFormatException e) {
			throw new IdadeFormatException("Idade \"" + idadeString + "\" nao esta formatada como inteiro");
		}
	}
	
	private static class NomeVazioException extends IOException{
		public NomeVazioException(String message) {
			super(message);
		}
	}
	
	private static class IdadeFormatException extends IOException{
		public IdadeFormatException(String message) {
			super(message);
		}
	}
	
}
