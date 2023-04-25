/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste;


public class Principal {
    
    public static void main(String[] args){
    double valorTotal = 1000.0;
    double entrada = 100.0;
    double  parcelas = 5.0;
    
    try{
        Financiamento cliente1 = new Financiamento(valorTotal, entrada, parcelas);
        System.out.println(cliente1.prestacao());
    }
    
    catch (RuntimeException erro){
        System.out.println(erro.getMessage());
    }
    }
}
