package com.l0tharius.schrodingersapp.playlist;

import java.util.Scanner;

import com.l0tharius.schrodingersapp.playlist.PlaylistConsoleListView;
import com.l0tharius.schrodingersapp.playlist.PlaylistDAO;

/*****************************************************************
*	Date: 2018
*	@author COR replicated by l0tharius as part of CA
*  
* 
*****************************************************************/

public class PlaylistController {
	
	private PlaylistConsoleListView view;
	private PlaylistDAO model;
    Scanner input = new Scanner(System.in);
	
	public PlaylistController(PlaylistConsoleListView view, PlaylistDAO model) {
		this.view = view;
		this.model = model;
	}

	public void display() {
		
		view.setPlayList(model.getAllPlayList());
		view.display();
        System.out.println(" \n Press enter return to the main menu");
		this.input.nextLine();
		
	}	

}

