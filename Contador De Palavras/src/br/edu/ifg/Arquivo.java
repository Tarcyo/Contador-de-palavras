/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg;


import java.io.File;

/**
 *
 * @author Tarcyo
 */
public class Arquivo implements IntArquivo {
    
    
    private final String nomeDoArquivo;
    private final String extensao;
    private final String endereco;
    private final int quantidadeDeLinhas;
    private final String conteudo;
    private final File ponteiro;
    
    public File getPonteiro() {
        return ponteiro;
    }
    
   
    
    @Override
    public String toString() {
        return "Arquivo{\n" + "nomeDoArquivo=" + nomeDoArquivo + "\nextensao=" + extensao + "\nendereco=" + endereco + "\nquantidadeDeLinhas=" +quantidadeDeLinhas + "\nconteudo=\n" + conteudo + '}';
    }

    public String getNomeDoArquivo() {
        return nomeDoArquivo;
    }

    public String getExtensao() {
        return extensao;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getQuantidadeDeLinhas() {
        return quantidadeDeLinhas;
    }

    public String getConteudo() {
        return conteudo;
    }

   
    public Arquivo(String endereco) {
        this.endereco = endereco;
        this.ponteiro=new File(this.getEndereco());
        this.conteudo = this.leArquivo(this.getPonteiro()).toUpperCase();
        this.quantidadeDeLinhas = this.ContaLinhas(this.getPonteiro());
        this.nomeDoArquivo = this.pegaNomeDoArquivo(this.getPonteiro());
        this.extensao = this.pegaExtensaoDoArquivo(this.getPonteiro());
    }

}
