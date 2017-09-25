package fr.univ_amu.iut;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionUnique {
	private static ConnexionUnique instance = null;

	private static final String CONNECT_URL = "jdbc:mysql://mysql-alban-peyric.alwaysdata.net/alban-peyric_bd_m3106";
	private static final String LOGIN = "144380_apeyric";
	private static final String PASSWORD = "123456";
	private Connection connection;


	private ConnexionUnique() {
		super();
		try {
			connection = DriverManager.getConnection(CONNECT_URL,LOGIN,PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection()
	{
		return connection;
	}

	public static ConnexionUnique getInstance()
	{
		if (instance == null)
			instance = new ConnexionUnique();
		return instance;
	}





}
