package br.com.IncricoesVideira.entity;

public class Evento {
	private int Cod_Ev;
	private int Data_Ev;
	private String Nome_Ev;
	private float Valor_Ev;
	private String Desc_Ev;
	private String Capacidade_Ev;
	
	public Evento() {
		super();
	}

	public Evento(int cod_Ev, int data_Ev, String nome_Ev, float valor_Ev, String desc_Ev, String capacidade_Ev) {
		super();
		Cod_Ev = cod_Ev;
		Data_Ev = data_Ev;
		Nome_Ev = nome_Ev;
		Valor_Ev = valor_Ev;
		Desc_Ev = desc_Ev;
		Capacidade_Ev = capacidade_Ev;
	}

	public int getCod_Ev() {
		return Cod_Ev;
	}

	public void setCod_Ev(int cod_Ev) {
		Cod_Ev = cod_Ev;
	}

	public int getData_Ev() {
		return Data_Ev;
	}

	public void setData_Ev(int data_Ev) {
		Data_Ev = data_Ev;
	}

	public String getNome_Ev() {
		return Nome_Ev;
	}

	public void setNome_Ev(String nome_Ev) {
		Nome_Ev = nome_Ev;
	}

	public float getValor_Ev() {
		return Valor_Ev;
	}

	public void setValor_Ev(float valor_Ev) {
		Valor_Ev = valor_Ev;
	}

	public String getDesc_Ev() {
		return Desc_Ev;
	}

	public void setDesc_Ev(String desc_Ev) {
		Desc_Ev = desc_Ev;
	}

	public String getCapacidade_Ev() {
		return Capacidade_Ev;
	}

	public void setCapacidade_Ev(String capacidade_Ev) {
		Capacidade_Ev = capacidade_Ev;
	}
	
	
	
	

}
