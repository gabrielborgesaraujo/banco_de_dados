package classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class Revista {
    private String nome;
    private int numEdicao;
    private LocalDate dataPub;
    private Editora editora;
    private String manchete;
    private String editoria;
    private ArrayList<Artigo> artigos;

    @Override
    public String toString() {
        return "\nRevista" + "\nNome: " + nome 
                + "\nNúmero da Edição: " + numEdicao 
                + "\nData da Publicação: " + dataPub 
                + editora.toString() 
                + "\nManchete: " + manchete 
                + "\nÁrea de Atuação: " + editoria 
                + "\nArtigos " + artigos.toString();
    }
    
    public Revista() {
        this.editora = new Editora();
        this.artigos = new ArrayList<>();
    }

    public Revista(String nome, int numEdicao, LocalDate dataPub, Editora editora, String manchete, String areaAtuacao, ArrayList<Artigo> artigos) {
        this.nome = nome;
        this.numEdicao = numEdicao;
        this.dataPub = dataPub;
        this.editora = editora;
        this.manchete = manchete;
        this.editoria = areaAtuacao;
        this.artigos = artigos;
    }
 
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumEdicao() {
        return numEdicao;
    }

    public void setNumEdicao(int numeroEdicao) {
        this.numEdicao = numeroEdicao;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public LocalDate getDataPub() {
        return dataPub;
    }

    public void setDataPub(LocalDate dataPublicacao) {
        this.dataPub = dataPublicacao;
    }

    public String getManchete() {
        return manchete;
    }

    public void setManchete(String manchetePrincipal) {
        this.manchete = manchetePrincipal;
    }

    public String getEditoria() {
        return editoria;
    }

    public void setEditoria(String editoria) {
        this.editoria = editoria;
    }

    public ArrayList<Artigo> getArtigos() {
        return artigos;
    }

    public void setArtigos(ArrayList<Artigo> artigos) {
        this.artigos = artigos;
    }
           
}
