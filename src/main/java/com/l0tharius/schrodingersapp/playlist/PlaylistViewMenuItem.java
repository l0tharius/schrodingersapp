package com.l0tharius.schrodingersapp.playlist;


	
	import com.l0tharius.schrodingersapp.data.DataManagerSQLite;
	import com.l0tharius.schrodingersapp.menu.IExecutable;

	/*****************************************************************
	*	Date: 2018
	*	@author COR replicated by l0tharius as part of CA
	*  
	* 
	*****************************************************************/

	public class PlaylistViewMenuItem implements IExecutable {
		
		public PlaylistViewMenuItem(){}
		
		public void execute()
		{
			
			
			//Get the User data
			PlaylistDAO model = new PlaylistDAO( DataManagerSQLite.getInstance() );
			PlaylistConsoleListView view = new PlaylistConsoleListView();
			PlaylistController controller = new PlaylistController( view, model);
			controller.display();
			
		}
		

}
