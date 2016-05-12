package com.joseosmar.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContatoDAO {

	private Connection connection;

	public ContatoDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Contato contato) {
		String sql = "INSERT INTO contato " + "(id, nome)" + " VALUES (?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setLong(1, contato.getId());
			stmt.setString(2, contato.getNome());

			stmt.execute();
			stmt.close();

			System.out.println("Gravado");
		} catch (SQLException e) {
			System.out.println("Erro");
		}
	}
}