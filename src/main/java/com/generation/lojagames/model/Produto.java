package com.generation.lojagames.model;

import java.math.BigDecimal;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O Atributo nome é obrigatório")
	@Size(max = 255, message = "O atributo nome deve ter no maximo 255 caracteres")
	private String nome;
	
	@NotBlank(message = "O Atributo descricao é obrigatório")
	@Size(min = 10, max = 2000, message = "O atributo descricao deve ter no minimo 10 e no maximo 2000 caracteres")
	private String descricao;
	
	@NotBlank(message = "O Atributo console é obrigatório")
	@Size(min = 1, max = 100, message = "O atributo console deve ter no minimo 1 e no maximo 100 caracteres")
	private String console;
	
	@NotNull
	private int quantidade;
	
	private LocalDate dataLancamento;
	
	@NotNull
	private BigDecimal preco;
	
	@Size(max = 500, message = "O link da foto não pode ser maior do que 500 caracteres!")
	private String foto;
	
	private Long curtir;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Long getCurtir() {
		return curtir;
	}

	public void setCurtir(Long curtir) {
		this.curtir = curtir;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
