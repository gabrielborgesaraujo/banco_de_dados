package classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class Artigo {
    private String titulo;
    private int pagina;
    private ArrayList<Autor> autores; 
    private ArrayList<String> palavrasChaves;

    @Override
    public String toString() {
        return "Titulo: " + titulo 
                + ", Pagina: " + pagina 
                + ", Autores" + autores.toString() 
                + ", Palavras-chaves: " + palavrasChaves.toString();
    }
    
    public Artigo() {
        this.autores = new ArrayList<>();
        this.palavrasChaves = new ArrayList<>();
    }

    public Artigo(String titulo, 
            int pagina, 
            ArrayList<Autor> autores, 
            ArrayList<String> palavrasChaves) {
        this.titulo = titulo;
        this.pagina = pagina;
        this.autores = autores;
        this.palavrasChaves = palavrasChaves;
    }
    
    
   
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }
    
    public ArrayList<String> getPalavrasChaves() {
        return palavrasChaves;
    }

    public void setPalavrasChaves(ArrayList<String> palavrasChaves) {
        this.palavrasChaves = palavrasChaves;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }
    
}
