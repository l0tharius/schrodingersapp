package com.l0tharius.schrodingersapp.music;

public class Music {


	//Declaration of objects
	
	private int musicID;
	private String artist_name;
	private String album_name;
	private String track_name;
	private String track_length;
	
	//constructors
	public Music(int musicID, String artist_name, String album_name, String track_name, String track_length) {
		this.musicID = musicID;
		this.artist_name = artist_name;
		this.album_name = album_name;
		this.track_name = track_name;
		this.track_length = track_length;
	}
	//getters and setters

	public int getMusicID() {
		return musicID;
	}

	public void setMusicID(int musicID) {
		this.musicID = musicID;
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

	//toString method
	@Override
	public String toString() {
		return String.format("Music [musicID=%s, artist_name=%s, album_name=%s, track_name=%s, track_length=%s]",
				musicID, artist_name, album_name, track_name, track_length);
	}
	
	public void display() {
		System.out.println(this.toString());
		
	}
	
	
}//EOC
