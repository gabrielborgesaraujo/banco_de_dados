package arquivos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Flavia
 */
public class FileWriterReaderTest {
    public static void main(String[] args) {
        File file = new File("arquivo.txt");
        try(FileWriter fw = new FileWriter(file)){
            FileReader fr = new FileReader(file);
            fw.write("Escrevendo uma mensagem no arquivo" + '\n' + "E pulando uma linha 3");
            fw.flush();
            char [] in = new char[500];
            int size = fr.read(in);
            System.out.println("Tamanho: " + size);
            for(char c: in){
                System.out.print(c);
            }           
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        /*try {
            FileWriter fw = new FileWriter(file);
            //FileWriter fw = new FileWriter(file, true); habilitando o appendo no arquivo
            fw.write("Escrevendo uma mensagem no arquivo" + '\n' + "E pulando uma linha 3");
            fw.flush();
            fw.close();
            
            FileReader fr = new FileReader(file);
            char [] in = new char[500];
            int size = fr.read(in);
            System.out.println("Tamanho: " + size);
            for(char c: in){
                System.out.print(c);
            }
            fr.close();      
        } catch (IOException ex) {
            Logger.getLogger(FileWriterReaderTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
    }
}
