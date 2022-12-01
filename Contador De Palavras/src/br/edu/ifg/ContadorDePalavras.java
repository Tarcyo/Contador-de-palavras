/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg;

import java.util.ArrayList;

/**
 *
 * @author Tarcyo
 */
public class ContadorDePalavras implements IntContadorDePalavras{

    @Override
    public String toString() {
        return "ContadorDePalavras{\n" + "quantidadeTotal=" + quantidadeTotal + "\nquantidadeAs=" + quantidadeAs + "\n quantidadeOs=" + quantidadeOs + "\nquantidadeEs=" + quantidadeEs + "\n quantidadeO=" + quantidadeO + "\n quantidadeA=" + quantidadeA + "\n quantidadeE=" + quantidadeE + "\n quantidadeEu=" + quantidadeEu + "\n quantidadeTu=" + quantidadeTu + "\n quantidadeEle=" + quantidadeEle + "\n quantidadeEla=" + quantidadeEla + "\n quantidadeElo=" + quantidadeElo + "\n quantidadeNos=" + quantidadeNos + "\n quantidadeVos=" + quantidadeVos + "\n quantidadeEles=" + quantidadeEles + "\n quantidadeElas=" + quantidadeElas + "\n quantidadeElos=" + quantidadeElos + "\nquantidadePrimeiraPessoa=" + quantidadePrimeiraPessoa + "\nquantidadeSegundaPessoa=" + quantidadeSegundaPessoa + "\nquantidadeTerceiraPessoa=" + quantidadeTerceiraPessoa + "\n palavrasDoTexto=" + palavrasDoTexto + '}';
    }

    private int quantidadeTotal;
    private int quantidadeAs;
    private int quantidadeOs;
    private int quantidadeEs;
    private int quantidadeO;
    private int quantidadeA;
    private int quantidadeE;
    private int quantidadeEu;
    private int quantidadeTu;
    private int quantidadeEle;
    private int quantidadeEla;
    private int quantidadeElo;
    private int quantidadeNos;
    private int quantidadeVos;
    private int quantidadeEles;
    private int quantidadeElas;
    private int quantidadeElos;
    private int quantidadePrimeiraPessoa;
    private int quantidadeSegundaPessoa;
    private int quantidadeTerceiraPessoa;
    private ArrayList<String> palavrasDoTexto;

    public int getQuantidadePrimeiraPessoa() {
        return quantidadePrimeiraPessoa;
    }

    public void setQuantidadePrimeiraPessoa(int quantidadePrimeiraPessoa) {
        this.quantidadePrimeiraPessoa = quantidadePrimeiraPessoa;
    }

    public int getQuantidadeTerceiraPessoa() {
        return quantidadeTerceiraPessoa;
    }

    public void setQuantidadeTerceiraPessoa(int quantidadeTerceiraPessoa) {
        this.quantidadeTerceiraPessoa = quantidadeTerceiraPessoa;
    }
    

    public ContadorDePalavras(Arquivo arquivo) {
        this.palavrasDoTexto=this.filtraPalavras(arquivo.getConteudo());
        this.quantidadeTotal=this.getPalavrasDoTexto().size();
        this.quantidadeA=this.contaPalavra(this.getPalavrasDoTexto(), Artigo.A.getDescricao());
        this.quantidadeAs=this.contaPalavra(this.getPalavrasDoTexto(), Artigo.AS.getDescricao());
        this.quantidadeO=this.contaPalavra(this.getPalavrasDoTexto(), Artigo.O.getDescricao());
        this.quantidadeOs=this.contaPalavra(this.getPalavrasDoTexto(), Artigo.OS.getDescricao());
        this.quantidadeE=this.getQuantidadeA()+this.getQuantidadeO();
        this.quantidadeEs=this.getQuantidadeOs()+this.getQuantidadeAs();
        this.quantidadeEu=this.contaPalavra(this.getPalavrasDoTexto(), Pronome.EU.getDescricao());
        this.quantidadeTu=this.contaPalavra(this.getPalavrasDoTexto(), Pronome.TU.getDescricao());
        this.quantidadeNos=this.contaPalavra(this.getPalavrasDoTexto(), Pronome.NOS.getDescricao());
        this.quantidadeVos=this.contaPalavra(this.getPalavrasDoTexto(), Pronome.VOS.getDescricao());
        this.quantidadeEle=this.contaPalavra(this.getPalavrasDoTexto(), Pronome.ELE.getDescricao());
        this.quantidadeEla=this.contaPalavra(this.getPalavrasDoTexto(), Pronome.ELA.getDescricao());
        this.quantidadeElas=this.contaPalavra(this.getPalavrasDoTexto(), Pronome.ELAS.getDescricao());
        this.quantidadeEles=this.contaPalavra(this.getPalavrasDoTexto(), Pronome.ELES.getDescricao());
        this.quantidadeElo=this.getQuantidadeEle()+this.getQuantidadeEla();
        this.quantidadeElos=this.getQuantidadeEles()+this.getQuantidadeElas();
        this.quantidadePrimeiraPessoa=this.getQuantidadeEu()+this.getQuantidadeNos();
        this.quantidadeSegundaPessoa=this.getQuantidadeTu()+this.getQuantidadeVos();
        this.quantidadeTerceiraPessoa=this.getQuantidadeElo()+this.getQuantidadeElos();
        
        
        
        

    }

    public int getQuantidadeTotal() {
        return quantidadeTotal;
    }

    public int getQuantidadeAs() {
        return quantidadeAs;
    }

    public int getQuantidadeOs() {
        return quantidadeOs;
    }

    public int getQuantidadeEs() {
        return quantidadeEs;
    }

    public int getQuantidadeO() {
        return quantidadeO;
    }

    public int getQuantidadeA() {
        return quantidadeA;
    }

    public int getQuantidadeE() {
        return quantidadeE;
    }

    public int getQuantidadeEu() {
        return quantidadeEu;
    }

    public int getQuantidadeTu() {
        return quantidadeTu;
    }

    public int getQuantidadeEle() {
        return quantidadeEle;
    }

    public int getQuantidadeEla() {
        return quantidadeEla;
    }

    public int getQuantidadeElo() {
        return quantidadeElo;
    }

    public int getQuantidadeNos() {
        return quantidadeNos;
    }

    public int getQuantidadeVos() {
        return quantidadeVos;
    }

    public int getQuantidadeEles() {
        return quantidadeEles;
    }

    public int getQuantidadeElas() {
        return quantidadeElas;
    }

    public int getQuantidadeElos() {
        return quantidadeElos;
    }

    public int getQuantPrimeiraPessoa() {
        return quantidadePrimeiraPessoa;
    }

    public int getQuantidadeSegundaPessoa() {
        return quantidadeSegundaPessoa;
    }

    public ArrayList<String> getPalavrasDoTexto() {
        return palavrasDoTexto;
    }

}
