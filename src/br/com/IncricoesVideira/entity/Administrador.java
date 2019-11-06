package br.com.IncricoesVideira.entity;

public class Administrador extends Usuario {
	private String cargo;

	public Administrador() {
		super();
	}

	public Administrador(int codigo, String cpf, String nome, String email, String usuario, String senha, String bairro,
			int numero, String logradouro, int cep, String cidade, String estado, String pais, int telefone) {
		super(codigo, cpf, nome, email, usuario, senha, bairro, numero, logradouro, cep, cidade, estado, pais, telefone);
	}

	public Administrador(String cargo) {
		super();
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
