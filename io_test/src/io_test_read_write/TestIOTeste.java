package io_test_read_write;

public class TestIOTeste {
	
	public static void main(String[] args) {
		
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("file.separator"));
		
		IOTest.leArquivo("files"+System.getProperty("file.separator")+"file.in");
		
	}

}
