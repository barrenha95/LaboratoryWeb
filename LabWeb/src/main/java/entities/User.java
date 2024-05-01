package entities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class User {

	private final int id;
	private final String nome;
	private final String email;
	private final int telefone;
	private final String password;

	public User(final int id,
				final String nome,
				final String email,
				final int telefone,
				final String password) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.password = password;
	}

}
