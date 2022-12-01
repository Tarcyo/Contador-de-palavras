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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static boolean testaSeECaracterEspecial(char c) {
        if (c == '.' || c == ',' || c == '(' || c == ')' || c == ':' || c == ';' || c == '?' || c == '!' || c == '"' || c == '&' || c == '|' || (c + "").equals("'") || c == ' ' || c == '\n')
        {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Arquivo arquivo = new Arquivo("C:\\Users\\Tarcyo\\Desktop\\Poema.txt");
        ContadorDePalavras cdp = new ContadorDePalavras(arquivo);
        MontaGráfico mt=new MontaGráfico();
        
        mt.criaGraficoArtigo (cdp.getQuantidadeA(),cdp.getQuantidadeO(), cdp.getQuantidadeAs(), cdp.getQuantidadeOs());
        mt.mostraGraficoArtigo();
    }

}
