package com.l0tharius.schrodingersapp.playlist;

public class PlayList {

	private int userID;
	private String username;
	private String artist_name;
	private String album_name;
	private String track_name;
	private String track_length;
	
	
	public PlayList(int userID, String username, String artist_name, String album_name, String track_name,
			String track_length) {
		this.userID = userID;
		this.username = username;
		this.artist_name = artist_name;
		this.album_name = album_name;
		this.track_name = track_name;
		this.track_length = track_length;
	}


	public int getUserID() {
		return userID;
	}


	public void setUserID(int userID) {
		this.userID = userID;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getArtist_name() {
		return artist_name;
	}


	public void setArtist_name(String artist_name) {
		this.artist_name = artist_name;
	}


	public String getAlbum_name() {
		return album_name;
	}


	public void setAlbum_name(String album_name) {
		this.album_name = album_name;
	}


	public String getTrack_name() {
		return track_name;
	}


	public void setTrack_name(String track_name) {
		this.track_name = track_name;
	}


	public String getTrack_length() {
		return track_length;
	}


	public void setTrack_length(String track_length) {
		this.track_length = track_length;
	}


	@Override
	public String toString() {
		return String.format(
				"PlayList [userID=%s, username=%s, artist_name=%s, album_name=%s, track_name=%s, track_length=%s]",
				userID, username, artist_name, album_name, track_name, track_length);
	}
	
	public void display() {
		System.out.println(this.toString());
	}

}
