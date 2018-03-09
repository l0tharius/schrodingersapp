package com.l0tharius.schrodingersapp.music;

import com.l0tharius.schrodingersapp.data.DataManagerSQLite;
import com.l0tharius.schrodingersapp.menu.IExecutable;

/*****************************************************************
*	Date: 2018
*	@author COR replicated by l0tharius as part of CA
*  
* 
*****************************************************************/

public class MusicViewMenuItem implements IExecutable {
	
	public MusicViewMenuItem(){}
	
	public void execute()
	{
		
		
		//Get the User data
		MusicDAO model = new MusicDAO( DataManagerSQLite.getInstance() );
		MusicConsoleListView view = new MusicConsoleListView();
		MusicController controller = new MusicController( view, model);
		controller.display();
		
	}
	
}
