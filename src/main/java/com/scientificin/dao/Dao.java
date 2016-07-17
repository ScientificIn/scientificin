package com.scientificin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Dao<T> {
	
	private Connection conn;
	
	public Dao () {
		try {
			this.conn = DriverManager.getConnection("jdbc:mysql://localhost/scientificin", "root", "root");
		} catch (SQLException e) {
			System.err.println("Nâo foi possível instanciar o DAO.");
		}
	}

	public boolean save (T t) {
		return false;
	}
}
