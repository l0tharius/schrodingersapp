package com.l0tharius.schrodingersapp.playlist;

import java.util.ArrayList;

public interface IPlaylistDAO {
	
	public ArrayList<PlayList> getAllPlayList();
	public PlayList getPlayList(int userID);
	public int addPlayList( PlayList aPlayList);
	public void updatePlayList( PlayList aPlayList);
	public void deletePlayList( PlayList aPlayList);
	public String printPlayList( int userID);

}


