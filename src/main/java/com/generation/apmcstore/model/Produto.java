package com.generation.apmcstore.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "tb_produto")

public class Produto {
	
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank (message = "O nome é obrigatório!")
	@Size(min = 2, max = 25, message = "O nome deve ter no mínimo 1 e no máximo 25 caracteres!")
	@Column (length = 25)
	private String nome;
	
	@Size(min = 1, max = 500, message = "A descrição deve ter no mínimo 1 e no máximo 500 caracteres!")
	@Column (length = 500)
	private String descricao;
	
	@NotBlank (message = "Informe qual console você deseja!")
	@Size(min = 3, max = 15, message = "O nome do console deve ter no mínimo 3 e no máximo 15 caracteres!")
	@Column (length = 15)
	private String console;
	
	@NotNull (message = "Não é possível criar sem quantidade.")
	@Positive (message = "O número deve ser um valor maior que zero.")
	private int quantidade;
	
	@NotNull (message = "Não é possível criar um produto sem o preço!")
	@Positive (message = "O valor deve ser maior que zero!")
    private float preco;
	
	@NotBlank (message = "Insira uma foto para o seu produto!")
	private String foto;
	
	@ManyToOne //
	@JsonIgnoreProperties("Produto")
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

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
