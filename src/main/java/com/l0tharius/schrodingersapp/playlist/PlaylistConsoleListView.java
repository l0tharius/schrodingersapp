package com.l0tharius.schrodingersapp.playlist;


import java.util.ArrayList;
import java.util.Iterator;

/*****************************************************************
*	Date: 2018
*	@author COR replicated by l0tharius as part of CA
*  
* 
*****************************************************************/

import com.l0tharius.schrodingersapp.menu.ConsoleControls;

public class PlaylistConsoleListView {
	
	ArrayList<PlayList> playList;
	
	public PlaylistConsoleListView() {

	}

	public void setPlayList( ArrayList<PlayList> playList) {
		this.playList = playList;
	}
	
	public void display() {
		
		System.out.println( ConsoleControls.ANSI_YELLOW_BRIGHT + "... Playlist VIEWER ..." + ConsoleControls.ANSI_RESET);
		System.out.println("\n");
		Iterator<PlayList> iterator = this.playList.iterator();
		while (iterator.hasNext()) {
			PlayList aPlaylist = 
				(PlayList)iterator.next();
			aPlaylist.display();
		}
	}

}

