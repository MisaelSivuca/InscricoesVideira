package br.com.IncricoesVideira.entity;

public class Produtos {
	private int Cod_Pro;
	private String Nome_Pro;
	private String Descricao_Pro;
	private float Valor;
	private int Cod_Adm;
	
	public Produtos() {
		super();
	}

	public Produtos(int cod_Pro, String nome_Pro, String descricao_Pro, float valor, int cod_Adm) {
		super();
		Cod_Pro = cod_Pro;
		Nome_Pro = nome_Pro;
		Descricao_Pro = descricao_Pro;
		Valor = valor;
		Cod_Adm = cod_Adm;
	}

	public int getCod_Pro() {
		return Cod_Pro;
	}

	public void setCod_Pro(int cod_Pro) {
		Cod_Pro = cod_Pro;
	}

	public String getNome_Pro() {
		return Nome_Pro;
	}

	public void setNome_Pro(String nome_Pro) {
		Nome_Pro = nome_Pro;
	}

	public String getDescricao_Pro() {
		return Descricao_Pro;
	}

	public void setDescricao_Pro(String descricao_Pro) {
		Descricao_Pro = descricao_Pro;
	}

	public float getValor() {
		return Valor;
	}

	public void setValor(float valor) {
		Valor = valor;
	}

	public int getCod_Adm() {
		return Cod_Adm;
	}

	public void setCod_Adm(int cod_Adm) {
		Cod_Adm = cod_Adm;
	}
	

}
