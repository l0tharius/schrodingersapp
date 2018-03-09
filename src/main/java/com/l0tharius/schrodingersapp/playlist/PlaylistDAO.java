package com.l0tharius.schrodingersapp.playlist;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.l0tharius.schrodingersapp.data.IDataManager;


public class PlaylistDAO implements IPlaylistDAO{
	
	
		
		// DATA
		//............................................................
		
		private IDataManager dataManager;
		
		// This is added to every class that needs to log with one change
		// The getLogger( ) part should contain the name of the class its in
		// So you know the messages that came from objects of this class
		private final Logger LOG = LogManager.getLogger(PlaylistDAO.class);

		// CONSTRUCTORS
		//............................................................
		
		public PlaylistDAO( IDataManager dataManager ) {
			
			this.dataManager = dataManager;
		}
		
		// METHODS
		//............................................................
		
		public ArrayList<PlayList> getAllPlayList(){
			
			ArrayList<PlayList> playList = new ArrayList<PlayList>();
			
			// Get JDBC connection to database
			Connection connection = null;
			
	        try
	        {
	        	  // get a database connection
	        	  connection = this.dataManager.getConnectionObject();
	        			       	
	          Statement statement = connection.createStatement();
	          statement.setQueryTimeout(30);  // set timeout to 30 sec.
	          
	          // Run the query
	          
	          ResultSet resultSet = statement.executeQuery("select * from playlist_view where userID = 0");
	          
	          // iterate through the results create User objects put in the ListArray
	          
	          while(resultSet.next())
	          {
	        	  	  PlayList playlist  = new PlayList(
	        	  			  resultSet.getInt("userID"),
	        	  			  resultSet.getString("username"),
	        	  			  resultSet.getString("artist_name"),
	        	  			  resultSet.getString("album_name"),
	        	  			  resultSet.getString("track_name"),
	        	  			  resultSet.getString("track_length")
	        	  			  );
	              
	              // putting the user objects into the list but not using them yet
	              playList.add(playlist);
	              
	              // print the results by using the toString() on User
	              LOG.debug( "Music object : " + playlist);
	          }
	        	  
	        }
	        catch(SQLException e)
	        {
	          // if the error message is "out of memory",
	          // it probably means no database file is found
	          LOG.error(e.getMessage());
	        } 
	        finally
	        {
	          try
	          {
	            if(connection != null)
	            	this.dataManager.disconnect();
	          }
	          catch(SQLException e)
	          {
	            // connection close failed.
	            LOG.error(e.getMessage());
	          }
	        }
	        
	        return playList;

		}//EOM
		
		public PlayList getPlayList(int userID) {
			throw new UnsupportedOperationException();
		}
		
		public int addPlayList( PlayList aPlayList) {
			throw new UnsupportedOperationException();
		}
		
		public void updatePlayList( PlayList aPlayList) {
			throw new UnsupportedOperationException();
		}
		
		public void deletePlayList( PlayList aPlayList) {
			throw new UnsupportedOperationException();
		}
		
		public String printPlayList( int userID) {
			throw new UnsupportedOperationException();
		}

	}
