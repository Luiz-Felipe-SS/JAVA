package com.api.Produto1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


// '@Entity' para criar a minha table no banco de dados
// 'Table' comando para renomiar uma tabela no banco de  dados
@Entity
@Table(name = "produtos")
public class ProdutoModelo {
	
	// 'Column' comando  para renomira o campo codigo 
	//id para identificar  como chave primaria
	// 'GeneratedValue(strategy = GenerationType.IDENTITY)' para gerar automaticamente minha chave primaria
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCodigo")
	private int codigo;
	
	@Column(name = "nomeCliente")
	private String nome;
	
	@Column(name = "valorCompra")
	private double valor;
	
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
