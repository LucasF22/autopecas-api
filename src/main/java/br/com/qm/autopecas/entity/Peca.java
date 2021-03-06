package br.com.qm.autopecas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pecas")
public class Peca {
	
		@Id
		@Column(name = "cod_barras") 
		private long codBarras;
		@Column
		private String nome;
		@Column(name = "mod_carro")
		private String modeloCarro;
		@Column
		private String fabricante;
		@Column(name = "pco_custo")
		private float pcoCusto;
		@Column(name = "pco_venda")
		private float pcoVenda;
		@Column
		private int estoque;
		@Column
		private String categoria;
		
		public Peca() {
			
		}
		public Peca(long codBarras, String nome, String modeloCarro, String fabricante, float pcoCusto, float pcoVenda,
				int estoque, String categoria) {
			
			this.codBarras = codBarras;
			this.nome = nome;
			this.modeloCarro = modeloCarro;
			this.fabricante = fabricante;
			this.pcoCusto = pcoCusto;
			this.pcoVenda = pcoVenda;
			this.estoque = estoque;
			this.categoria = categoria;
		}

		

		public long getCodBarras() {
			return codBarras;
		}

		public void setCodBarras(long codBarras) {
			this.codBarras = codBarras;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getModeloCarro() {
			return modeloCarro;
		}

		public void setModeloCarro(String modeloCarro) {
			this.modeloCarro = modeloCarro;
		}

		public String getFabricante() {
			return fabricante;
		}

		public void setFabricante(String fabricante) {
			this.fabricante = fabricante;
		}

		public float getPcoCusto() {
			return pcoCusto;
		}

		public void setPcoCusto(float pcoCusto) {
			this.pcoCusto = pcoCusto;
		}

		public float getPcoVenda() {
			return pcoVenda;
		}

		public void setPcoVenda(float pcoVenda) {
			this.pcoVenda = pcoVenda;
		}

		public int getEstoque() {
			return estoque;
		}

		public void setEstoque(int estoque) {
			this.estoque = estoque;
		}

		public String getCategoria() {
			return categoria;
		}

		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}
}
