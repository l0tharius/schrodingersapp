package com.l0tharius.schrodingersapp.menu;

import java.util.Scanner;

/*****************************************************************
*	Date: 2018
*	@author COR replicated by l0tharius as part of CA
*  
* 
*****************************************************************/

public class UndefinedMenuItem implements IExecutable {
	
	Scanner input = new Scanner(System.in);
	
	public UndefinedMenuItem(){}
	
	//@Override
	public void execute() {		
		System.out.println("The class " + UndefinedMenuItem.class.getName() + " is a placeholder menu item.");
        System.out.println(" \n Press enter return to the main menu");
		this.input.nextLine();
	}

}
