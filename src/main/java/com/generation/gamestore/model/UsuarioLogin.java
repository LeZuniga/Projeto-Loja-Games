package com.generation.gamestore.model;

import java.time.LocalDate;

public class UsuarioLogin {

	private Long id;
	
	private String nome;
	
	private String usuario;
	
	private String senha;
	
	private String foto;
	
	private LocalDate dataNascimento;
	
	private String Token;

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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getToken() {
		return Token;
	}

	public void setToken(String token) {
		Token = token;
	}
	
}