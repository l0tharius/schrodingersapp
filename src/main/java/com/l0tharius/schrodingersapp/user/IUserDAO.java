package com.l0tharius.schrodingersapp.user;

/*****************************************************************
*	Date: 2018
*	@author COR replicated by l0tharius as part of CA
*  
* 
*****************************************************************/

import java.util.ArrayList;

public interface IUserDAO {
	
	public ArrayList<User> getAllUsers();
	public User getUser(int userID);
	public int addUser( User aUser);
	public void updateUser( User aUser);
	public void deleteUser( User aUser);
	public String printUser( int userID);

}
