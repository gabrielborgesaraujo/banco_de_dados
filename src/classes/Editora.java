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
public class Editora {
    private String nome;
    private String cnpj;

    @Override
    public String toString() {
        return "\nEditora " + nome 
                + "\nCNPJ: " + cnpj;
    }
    
    public Editora() {
    }

    public Editora(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }
      
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
