package br.com.qm.autopecas.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Venda {
	@Id
	@Column(name = "codigo_venda")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigoVenda;
	
	@Column(name = "cod_barras")
	private long codBarras;
	
	private int quantidade;
	@Column(name ="nome_vendedor")
	private String nomeVendedor;
	@Column(name = "data_venda")
	private LocalDate dataVenda;
	
	private float valor;
	@Column(name = "forma_pagamento")
	private String formaPagamento;
	
	
	public Venda(int codigoVenda, long codBarras, int quantidade, String nomeVendedor, LocalDate dataVenda, float valor,
			String formaPagamento) {
		super();
		this.codigoVenda = codigoVenda;
		this.codBarras = codBarras;
		this.quantidade = quantidade;
		this.nomeVendedor = nomeVendedor;
		this.dataVenda = dataVenda;
		this.valor = valor;
		this.formaPagamento = formaPagamento;
	}
	public int getCodigoVenda() {
		return codigoVenda;
	}
	public void setCodigoVenda(int codigoVenda) {
		this.codigoVenda = codigoVenda;
	}
	public long getCodBarras() {
		return codBarras;
	}
	public void setCodBarras(long codBarras) {
		this.codBarras = codBarras;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getNomeVendedor() {
		return nomeVendedor;
	}
	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}
	public LocalDate getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(LocalDate dataVenda) {
		this.dataVenda = dataVenda;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	
}
