package br.com.casadocodigo.java8.models;

public class Usuario {

	private String nome;
	private Integer pontos;
	private boolean moderador;

	public Usuario(String nome, Integer pontos) {
		this.nome = nome;
		this.pontos = pontos;
		this.moderador = false;
	}

	public String getNome() {
		return nome;
	}

	public Integer getPontos() {
		return pontos;
	}

	public void tornaModerador() {
		this.moderador = true;
	}

	public boolean idModerador() {
		return this.moderador;
	}

}
