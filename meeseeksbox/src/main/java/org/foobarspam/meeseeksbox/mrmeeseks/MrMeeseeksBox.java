package org.foobarspam.meeseeksbox.mrmeeseks;

import java.util.ArrayList;

public class MrMeeseeksBox {
	private MrMeeseeks MrMe = null;
	
	public MrMeeseeksBox(){
		
	}
	
	public MrMeeseeks getMrMe(){
		return this.MrMe;
	}
	
	public void pushButton(ArrayList<MrMeeseeks> setMrMe){
		createMrMeeseeks(setMrMe);
		getMrMe().sayMessageOnCreate();
	}
	
	public void createMrMeeseeks(ArrayList<MrMeeseeks> setMrMt){
		MrMe = new MrMeeseeks();
		setMrMt.add(MrMe);
	}
	
}
