package classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Aluno
 */
public class Autor {   
    private String nome;

    @Override
    public String toString() {
        return nome;
    }

    public Autor() {
    }

    public Autor(String nome) {
        this.nome = nome;
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }   
    
}
