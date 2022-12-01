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
public interface IntContadorDePalavras {

    default boolean testaSeECaracterEspecial(char c) {
        if (c == '.' || c == ',' || c == '(' || c == ')' || c == ':' || c == ';' || c == '?' || c == '!' || c == '"' || c == '&' || c == '|' || (c + "").equals("'") || c == ' ' || c == '\n')
        {
            return true;
        }
        return false;

    }

    default ArrayList<String> filtraPalavras(String s) {
        ArrayList<String> palavras = new ArrayList<>();
        char texto[] = s.toCharArray();
        ArrayList<String> palavra = new ArrayList<>();
        for (int i = 0; i < texto.length; i++)
        {

            palavra.add(texto[i] + "");
            if (testaSeECaracterEspecial(texto[i]))
            {

                for (int j = 0; j <= texto.length + 1; j++)
                {
                    palavra.remove(".");
                    palavra.remove(",");
                    palavra.remove(" ");
                    palavra.remove("'");
                    palavra.remove("\"");
                    palavra.remove("!");
                    palavra.remove("?");
                    palavra.remove("\n");
                    palavra.remove("");
                    palavra.remove(":");
                    palavra.remove(")");
                    palavra.remove("(");
                    palavra.remove(";");
                    palavra.remove(":");
                    palavra.remove("&");
                    palavra.remove("|");

                }
                String p = "";
                for (int j = 0; j < palavra.size(); j++)
                {
                    p = p + palavra.get(j);
                }
                palavras.add(p);
                palavras.remove("");
                palavra.clear();

            }

        }
        return palavras;
    }

    default int contaPalavra(ArrayList<String> palavras, String palavra) {
        int quant = 0;
        for (String p : palavras)
        {
            if (p.equals(palavra))
            {
                quant++;
            }

        }
        
        return quant;

    }

}
