/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import classes.Artigo;
import classes.Autor;
import classes.Editora;
import classes.Estante;
import classes.Revista;
import classes.janela_principal;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Flavia
 */
public class EstanteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criando a instância da Estante, a qual armazenará as instâncias de Revista
        Estante estante = new Estante();
        
        //TODO code application logic here
        Revista revista = new Revista();
        revista.setNome("Veja");
        revista.setNumEdicao(2569);
        revista.setDataPub(LocalDate.of(2018, 1, 31));
        
        Editora editora = new Editora();
        editora.setNome("Abril");
        editora.setCnpj("02183757000193");
        
        revista.setEditora(editora);
        revista.setManchete("Lula a um passo do abismo");
        revista.setEditoria("Diversas");
        
        //criando o array de artigos
        ArrayList<Artigo> artigos = new ArrayList<>();
        
        //criando um artigo para add ao array de artigos
        Artigo artigo1 = new Artigo();
        
        artigo1.setTitulo("Três homens e um destino");
        artigo1.setPagina(19);
        //criando array de autores do artigo1
        ArrayList<Autor> autores = new ArrayList<>();
        //criando um autor para add à array de autores
        Autor autor1 = new Autor();
        autor1.setNome("Da Redação");
        autores.add(autor1);
        artigo1.setAutores(autores);
        //criando um array de palavras-chaves para o artigo1
        ArrayList<String> palavrasCraves = new ArrayList<>();
        palavrasCraves.add("Lula");
        palavrasCraves.add("TRF4");
        palavrasCraves.add("Condenado");
        palavrasCraves.add("Julgamento");
        palavrasCraves.add("Triplex");
        artigo1.setPalavrasChaves(palavrasCraves);        
        artigos.add(artigo1);
        revista.setArtigos(artigos);
        
        //Adicionando a revista no arraylist da estante
        estante.addRevista(revista);
        
        //Criando o arquivo estante.json
        estante.setFileJson(new File("src\\json\\estante.json"));
        
        //Manipulando json com gson
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        
        String stringJson = null;
        
        //gravando a string json no arquivo estante.json
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(estante.getFileJson()))){
            BufferedReader br = new BufferedReader(new FileReader(estante.getFileJson()));
            bw.write(estante.toJoson(estante));
            bw.flush();
            System.out.println("Arquivo json criado...");
            estante = null;
            
            //Deserializando uma instânca de Revista para JSON
            estante = gson.fromJson(br, Estante.class);
            for(Revista r : estante.getRevistas()){
                System.out.println(revista.toString());
            }
        } catch (IOException ex) {
            System.out.println("Pau no file...");
            ex.getStackTrace();
        }
        janela_principal teste = new janela_principal();
        teste.main(args);
        
    }
}
