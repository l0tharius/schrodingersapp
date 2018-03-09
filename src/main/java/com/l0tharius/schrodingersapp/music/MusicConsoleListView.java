package com.l0tharius.schrodingersapp.music;

import java.util.ArrayList;
import java.util.Iterator;

/*****************************************************************
*	Date: 2018
*	@author COR replicated by l0tharius as part of CA
*  
* 
*****************************************************************/

import com.l0tharius.schrodingersapp.menu.ConsoleControls;

public class MusicConsoleListView {
	
	ArrayList<Music> musicList;
	
	public MusicConsoleListView() {

	}

	public void setMusicList( ArrayList<Music> musicList) {
		this.musicList = musicList;
	}
	
	public void display() {
		
		System.out.println( ConsoleControls.ANSI_YELLOW_BRIGHT + "... MUSIC VIEWER ..." + ConsoleControls.ANSI_RESET);
		System.out.println("\n");
		Iterator<Music> iterator = this.musicList.iterator();
		while (iterator.hasNext()) {
			Music aMusic = 
				(Music)iterator.next();
			aMusic.display();
		}
	}

}
