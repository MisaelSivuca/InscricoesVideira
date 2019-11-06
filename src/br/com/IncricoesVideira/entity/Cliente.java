package br.com.IncricoesVideira.entity;

public class Cliente extends Usuario {

	public Cliente() {
		super();
	}

	public Cliente(int codigo, String cpf, String nome, String email, String usuario, String senha, String bairro,
			int numero, String logradouro, int cep, String cidade, String estado, String pais, int telefone) {
		super(codigo, cpf, nome, email, usuario, senha, bairro, numero, logradouro, cep, cidade, estado, pais, telefone);
	}

	
	


}
