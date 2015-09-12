package br.com.casadocodigo.java8.tests;

import java.util.Arrays;
import java.util.List;

import br.com.casadocodigo.java8.models.Usuario;

public class Capitulo2 {

	public static void main(String[] args) {

		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

		// for (Usuario usuario : usuarios) {
		// System.out.println(usuario.getNome());
		// }

		// usuarios.forEach(u -> System.out.println(u.getNome()));
		usuarios.forEach(u -> u.tornaModerador());

	}

}
