package teste_io;

public class TesteLeitura {
	
	public static void main(String[] args) {
		
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.dir"));
		
		String sep = System.getProperty("file.separator");
		Leitura_IO.leArquivo("files"+sep+"arquivo.in");
	}

}
