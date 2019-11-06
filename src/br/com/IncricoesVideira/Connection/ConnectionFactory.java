package br.com.IncricoesVideira.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private static String status;
	
	public  Connection getConexaoMySQL() {
		Connection connection = null; // atributo do tipo Connection
		try {
			// Carregando o JDBC Driver padrão
			String driverName = "com.mysql.jdbc.Driver";
			//String driverName = "com.mysql.cj.jdbc.Driver";
			//String driverName = "org.mariadb.jdbc.Driver";
			Class.forName(driverName);

			// Configurando a nossa conexão com um banco de dados//
			String serverName = "localhost"; // caminho do servidor do BD
			String mydatabase = "eventos_videira"; // nome do seu banco de dados
			//String url = "jdbc:mariadb://" + serverName + ":3306/" + mydatabase;
			String url = "jdbc:mysql://" + serverName + ":3306/" + mydatabase
					+"?useServerPrepStmts=false";
			String username = "root"; // nome de um usuário de seu BD
			String password = "123456"; // sua senha de acesso
			connection = DriverManager.getConnection(url, username, password);

			// Testa sua conexão//

			if (connection != null) {
				status = ("STATUS--->Conectado com sucesso!");
			} else {
				status = ("STATUS--->Não foi possivel realizar conexão");
			}
			
			System.out.println(status);
			return connection;
		} catch (ClassNotFoundException e) { // Driver não encontrado
			System.out.println("O driver expecificado nao foi encontrado.");
			return null;
		} catch (SQLException e) {
			// Não conseguindo se conectar ao banco
			System.out.println("Nao foi possivel conectar ao Banco de Dados.");
			return null;
		}
	}

}


