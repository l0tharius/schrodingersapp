package com.l0tharius.schrodingersapp.user;

import com.l0tharius.schrodingersapp.data.DataManagerSQLite;
import com.l0tharius.schrodingersapp.menu.IExecutable;

/*****************************************************************
*	Date: 2018
*	@author COR replicated by l0tharius as part of CA
*  
* 
*****************************************************************/

public class UserViewMenuItem implements IExecutable {
	
	public UserViewMenuItem(){}
	
	public void execute()
	{
		
		
		//Get the User data
		UserDAO model = new UserDAO( DataManagerSQLite.getInstance() );
		UserConsoleListView view = new UserConsoleListView();
		UserController controller = new UserController( view, model);
		controller.display();
		
	}
	
}
