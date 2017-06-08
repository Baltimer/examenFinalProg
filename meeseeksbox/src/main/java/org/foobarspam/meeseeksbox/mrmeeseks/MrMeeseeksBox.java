package org.foobarspam.meeseeksbox.mrmeeseks;

import java.util.ArrayList;

public class MrMeeseeksBox {
	private MrMeeseeks MrMe = null;
	
	public MrMeeseeksBox(){
		
	}
	 
	// SETTERS Y GETTERS
	public MrMeeseeks getMrMe(){
		return this.MrMe;
	}
	
	// Genera un MrMeeseeks para condecerte una peticion
	public void pushButton(ArrayList<MrMeeseeks> setMrMe){
		createMrMeeseeks(setMrMe);
		getMrMe().sayMessageOnCreate();
	}
	
	// Crea el MrMeeseeks
	public void createMrMeeseeks(ArrayList<MrMeeseeks> setMrMt){
		MrMe = new MrMeeseeks();
		setMrMt.add(MrMe);
	}
	
}
