/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Flavia
 */
public class Estante {
    //Array que vai conter todas as revistas cadastradas
    private int totalDeRevistas;
    private ArrayList<Revista> revistas;
    private File fileJson;
    
    public Estante() {
        this.revistas = new ArrayList<>();
    }
    
    public Estante(int totalDeRevistas, File fileJson) {
        this.totalDeRevistas = totalDeRevistas;
        this.fileJson = fileJson;
    }
    
    public String toJoson(Estante estante){
        //Manipulando json com gson
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        
        //Serializando uma instânca de Revista para JSON
        System.out.println("retornei o json...");
        return gson.toJson(estante);
    }
    
    public int getTotalDeRevistas() {
        return totalDeRevistas;
    }
    
    public void setTotalDeRevistas(int totalDeRevistas) {
        this.totalDeRevistas = totalDeRevistas;
    }
    
    public ArrayList<Revista> getRevistas() {
        return revistas;
    }
    
    public void addRevista(Revista revista) {
        this.revistas.add(revista);
    }
    
    public File getFileJson() {
        return fileJson;
    }
    
    public void setFileJson(File fileJson) {
        this.fileJson = fileJson;
    }
}
