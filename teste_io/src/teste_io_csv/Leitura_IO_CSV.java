package teste_io_csv;



import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;

public class Leitura_IO_CSV {

    public static Collection<Cachorro> leArquivo(String filePath){
    	
    	Collection<Cachorro> cachorros = new ArrayList<>();

        try (   InputStream is = new FileInputStream(filePath);
                InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
            ){
            String linha;
            while((linha = br.readLine()) != null){

                String[] palavras = linha.split(";");
                String nome = palavras[0];
                int idade = Integer.parseInt(palavras[1]);
                cachorros.add(new Cachorro(nome, idade));

            }

        }catch(IOException e){
            e.printStackTrace();
        }
        
        return cachorros;
    }
}
