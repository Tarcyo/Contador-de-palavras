/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg;

import org.jfree.data.general.DefaultPieDataset;
import javax.swing.JFrame;
import jdk.nashorn.internal.codegen.CompilerConstants;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

/**
 *
 * @author Tarcyo
 */
public class MontaGráfico {
    
    private JFrame graficoArtigo=new JFrame();
    
    
   
    
    
    
    public void criaGraficoArtigo(int quantA,int quantO,int quantAs,int quantOs) {
        DefaultPieDataset graficoPizza = new DefaultPieDataset();
       
        
        if(quantA>0){
            graficoPizza.setValue(Artigo.A.getDescricao(), quantA);
        }
        if(quantO>0){
            graficoPizza.setValue(Artigo.O.getDescricao(), quantO);
        }
        if(quantAs>0){
            graficoPizza.setValue(Artigo.AS.getDescricao(), quantAs);
        }
        if(quantOs>0){
            graficoPizza.setValue(Artigo.OS.getDescricao(), quantOs);
        }
        
        
        
       
        
        JFreeChart grafico = ChartFactory.createPieChart("Artigos que Aparecem no texto: ", graficoPizza, true, true, false);
        ChartPanel cp = new ChartPanel(grafico);
        
        this.graficoArtigo.add(cp);
        
    }
    
    public boolean mostraGraficoArtigo(){
        if(this.graficoArtigo==null){
            return false;
        }
        this.graficoArtigo.setVisible(true);
        return true;
    }
}
