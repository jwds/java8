package br.com.casadocodigo.java8.models;

import java.util.function.Consumer;

public class Mostrador implements Consumer<Usuario> {

	@Override
	public void accept(Usuario u) {
		System.out.println(u.getNome());
	}

}
