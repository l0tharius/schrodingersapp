package com.l0tharius.schrodingersapp.music;

import java.util.Scanner;

import com.l0tharius.schrodingersapp.music.MusicConsoleListView;
import com.l0tharius.schrodingersapp.music.MusicDAO;

/*****************************************************************
*	Date: 2018
*	@author COR replicated by l0tharius as part of CA
*  
* 
*****************************************************************/

public class MusicController {
	
	private MusicConsoleListView view;
	private MusicDAO model;
    Scanner input = new Scanner(System.in);
	
	public MusicController(MusicConsoleListView view, MusicDAO model) {
		this.view = view;
		this.model = model;
	}

	public void display() {
		
		view.setMusicList(model.getAllMusic());
		view.display();
        System.out.println(" \n Press enter return to the main menu");
		this.input.nextLine();
		
	}	

}
