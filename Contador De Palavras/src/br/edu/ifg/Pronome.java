/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg;

/**
 *
 * @author Tarcyo
 */
public enum Pronome {

    EU("EU"),
    TU("TU"),
    ELE("ELE"),
    ELES("ELES"),
    ELA("ELA"),
    ELAS("ELAS"),
    NOS("NÓS"),
    VOS("VÓS");
    

    private String string;

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getString() {
        return string;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setString(String string) {
        this.string = string;
    }
    private String descricao;

    Pronome(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
