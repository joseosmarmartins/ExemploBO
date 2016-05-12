package com.joseosmar.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection(){
		try{
			return DriverManager.getConnection("jdbc:postgresql://localhost/contato", "postgres", "bullshit06");
		}catch (SQLException e){
			throw new RuntimeException(e);			
		}	
	}
}