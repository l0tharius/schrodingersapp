package com.l0tharius.schrodingersapp.data;

import java.sql.Connection;
import java.sql.SQLException;

/*****************************************************************
*	Date: 2018
*	@author COR replicated by l0tharius as part of CA
*  
* 
*****************************************************************/

public interface IDataManager {
	
	public Connection getConnectionObject() throws SQLException;
	public void disconnect() throws SQLException;
}