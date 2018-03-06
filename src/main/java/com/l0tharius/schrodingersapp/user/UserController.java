package com.l0tharius.schrodingersapp.user;

import java.util.Scanner;

/*****************************************************************
*	Date: 2018
*	@author COR replicated by l0tharius as part of CA
*  
* 
*****************************************************************/

public class UserController {
	
	private UserConsoleListView view;
	private UserDAO model;
    Scanner input = new Scanner(System.in);
	
	public UserController(UserConsoleListView view, UserDAO model) {
		this.view = view;
		this.model = model;
	}

	public void display() {
		
		view.setUserList(model.getAllUsers());
		view.display();
        System.out.println(" \n Press enter return to the main menu");
		this.input.nextLine();
		
	}	

}
