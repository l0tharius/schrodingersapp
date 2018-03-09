package com.l0tharius.schrodingersapp.user;

import java.util.ArrayList;
import java.util.Iterator;

/*****************************************************************
*	Date: 2018
*	@author COR replicated by l0tharius as part of CA
*  
* 
*****************************************************************/

import com.l0tharius.schrodingersapp.menu.ConsoleControls;

public class UserConsoleListView {
	
	ArrayList<User> userList;
	
	public UserConsoleListView() {

	}

	public void setUserList( ArrayList<User> userList) {
		this.userList = userList;
	}
	
	public void display() {
		
		System.out.println( ConsoleControls.ANSI_YELLOW_BRIGHT + "... USER VIEWER ..." + ConsoleControls.ANSI_RESET);
		System.out.println("\n");
		Iterator<User> iterator = this.userList.iterator();
		while (iterator.hasNext()) {
			User aUser = 
				(User)iterator.next();
			aUser.display();
		}
	}

}
