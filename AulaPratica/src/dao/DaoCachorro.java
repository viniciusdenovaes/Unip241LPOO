package dao;

import entidade.Cachorro;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import dados.Dados;

public class DaoCachorro {

    public static Collection<Cachorro> preencheDados(String filePath, Dados dados){
    	
    	Collection<Cachorro> cachorros = new ArrayList<>();

        try (   InputStream is = new FileInputStream(filePath);
                InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
            ){
            String linha;
            while((linha = br.readLine()) != null){

                String[] palavras = linha.split(";");
                
                int id = Integer.parseInt(palavras[0]);
                String nome = palavras[1];
                int idade = Integer.parseInt(palavras[2]);
                
                Cachorro c = new Cachorro(id, nome, idade);
                
                dados.addCachorro(c);
                
                cachorros.add(c);

            }

        }catch(IOException e){
            e.printStackTrace();
        }
        
        return cachorros;
    }
    
    
    public static void saveDados(String filePath, Dados dados){

        try(    OutputStream os = new FileOutputStream(filePath/*, true*/);
                OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
                PrintWriter pw = new PrintWriter(osw, true);
                ){
        	
            for(var c: dados.getAllCachorros()){
                pw.println(c.getId()+","+c.getNome()+","+c.getIdade());
            }

        }catch(IOException e){
            e.printStackTrace();
        }

    }

}
