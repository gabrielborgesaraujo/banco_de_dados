package arquivos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Flavia
 */
public class FileTest {
    public static void main(String[] args){
        File file = new File("arquivo.txt");
        try {
            System.out.println(file.createNewFile());
            if(file.exists()){
                System.out.println("Permissão de leitura? " + file.canRead());
                System.out.println("Permissão de escrita? " + file.canWrite());
                System.out.println("Path: " + file.getPath());
                System.out.println("Full Path: " + file.getAbsolutePath());
                System.out.println("É um diretório? " + file.isDirectory());
                System.out.println("É um arquivo ? " + file.isFile());
                System.out.println("Está oculto? " + file.isHidden());
                System.out.println("Última modificação: " + new Date(file.lastModified()));
                System.out.println("Deletado? " + file.delete());
            }
        } catch (IOException ex) {
            Logger.getLogger(FileTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
