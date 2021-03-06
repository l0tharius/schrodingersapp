package com.l0tharius.schrodingersapp.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.l0tharius.schrodingersapp.user.UserDAO;
import com.l0tharius.schrodingersapp.music.MusicDAO;

/*****************************************************************
*	Date: 2018
*	@author COR replicated by l0tharius as part of CA
*  
* 
*****************************************************************/

public class DataManagerSQLite implements IDataManager {
	
	// DATA
	//............................................................
	
	private final Logger LOG = LogManager.getLogger(DataManagerSQLite.class);
	private static DataManagerSQLite oneInstance = new DataManagerSQLite();
	private String databaseFile = null;
	private Connection connection = null;
	
	// CONSTRUCTORS
	//............................................................
	
	private DataManagerSQLite() {} 
	
	public static DataManagerSQLite getInstance() {
		return oneInstance;
	}
	
	// METHODS
	//............................................................
	
	public void setDataFile(String databaseFile) {
		this.databaseFile = databaseFile;
	}
	
	//@Override
	public Connection getConnectionObject() throws SQLException {
		if (this.databaseFile != null) {
			this.connection = DriverManager.getConnection(this.databaseFile);
			LOG.debug("Database connection established");
		} else {
			connection = null;
		}	
		return connection;
	}
	
	//@Override
	public void disconnect() throws SQLException {
		connection.close();
		LOG.debug("Database connection established");
	}

}
