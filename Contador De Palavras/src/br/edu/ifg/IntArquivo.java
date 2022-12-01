/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Tarcyo
 */
public interface IntArquivo {

    default String leArquivo(File file) {
        String texto = "";
        BufferedReader arquivo;
        try
        {
            arquivo = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException fnf)
        {
            System.out.println(fnf);
            return texto;
        }
        while (true)
        {
            try
            {
                String linha = arquivo.readLine();
                if (linha == null)
                {
                    return texto;
                }
                texto = texto + linha + "\n";
            } catch (IOException io)
            {
                System.out.print(io);
                return texto;
            }
        }
    }

    default int ContaLinhas(File file) {
        BufferedReader bf = null;
        try
        {
            bf = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException fnf)
        {

            System.out.print(fnf);
            return 0;
        }
        {

        }
        int quantLinhas = 0;
        while (true)
        {
            try
            {
                String linha = bf.readLine();
                if (linha != null)
                {
                    quantLinhas++;
                } else
                {
                    return quantLinhas;
                }
            } catch (IOException io)
            {
                System.out.print(io);
            }

        }

    }

    default String pegaNomeDoArquivo(File arq) {

        char[] nomeCompleto = arq.getName().toCharArray();
        String nome = "";

        for (int i = 0; i < nomeCompleto.length; i++)
        {
            if (nomeCompleto[i] == '.')
            {
                return nome;
            }
            nome += nomeCompleto[i];

        }
        return nome;

    }

    default String pegaExtensaoDoArquivo(File arq) {
        char[] nomeCompleto = arq.getName().toCharArray();
        String extensao = "";

        for (int i = 0; i < nomeCompleto.length; i++)
        {
            if (nomeCompleto[i] == '.')
            {
                for (int j = i; j < nomeCompleto.length; j++)
                {
                    extensao += nomeCompleto[j];

                }
            }

        }
        return extensao;

    }

}
