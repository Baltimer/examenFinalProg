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
		MrMe = new MrMeeseeks();
		setMrMe.add(MrMe);
	}
	
	
}
