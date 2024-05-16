package dao;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import entidades.Animal;
import entidades.Cliente;
import entidades.Dados;

public class DaoJson {
	
	public static Dados loadClientes(String path) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(new File(path), Dados.class);
		}catch(IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public static void saveClientes(String path, Dados dados) {
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		
		File file = new File(path);
		file.getParentFile().mkdirs();
		try {
			file.createNewFile();
			mapper.writeValue(file, dados);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
