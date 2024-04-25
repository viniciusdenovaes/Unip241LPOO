package teste_io_csv;

import java.util.Collection;

public class TesteLeituraCSV {
	
	public static void main(String[] args) {
		String home_path = System.getProperty("user.home");
		String sep = System.getProperty("file.separator");
		String file_path = home_path+sep+"files"+sep+"tabela.csv";
		
		Collection<Cachorro> cachorros = 
				Leitura_IO_CSV.leArquivo(file_path);
		
		for(var c : cachorros) {
			System.out.println(c);
		}
	}

}
