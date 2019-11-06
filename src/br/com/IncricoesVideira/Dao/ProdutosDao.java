package br.com.IncricoesVideira.Dao;


import java.sql.Connection;

import br.com.IncricoesVideira.Connection.ConnectionFactory;
import br.com.IncricoesVideira.entity.Produtos;

public class ProdutosDao {
	private Connection conn;
	
	public ProdutosDao() {
		ConnectionFactory factory = new ConnectionFactory();
		conn = factory.getConexaoMySQL();
	}
	

}
