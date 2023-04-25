/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste;

public class Financiamento {
   private double valorTotal;
   private double entrada;
   private double parcelas;
            
            
    public Financiamento(double valorTotal, double entrada, double parcelas){
        
        if(entrada < valorTotal * 0.02){
            throw new RuntimeException("A entrada deve ser pelo menos 20% do valor total");
        }
        else if(parcelas < 6){
            throw new RuntimeException("o numero minimo de parcelas deve ser 6");
        }
        
        this.entrada = entrada;
        this.parcelas = parcelas;
        this.valorTotal = valorTotal;
    }
    
    public double prestacao(){
        return (valorTotal - entrada) / parcelas;
    }
    
}
