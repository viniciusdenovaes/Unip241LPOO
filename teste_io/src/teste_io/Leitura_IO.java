package teste_io;



import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Leitura_IO {

    public static void leArquivo(String filePath){

        try (   InputStream is = new FileInputStream(filePath);
                InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
            ){
            String linha;
            int i=0;
            while((linha = br.readLine()) != null){

                System.out.println("linha " + i++);

                String[] palavras = linha.split(",");

                for(String p: palavras){
                    System.out.println("palavra: " + p);
                }

            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
