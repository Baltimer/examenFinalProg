package org.foobarspam.meeseeksbox;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.foobarspam.meeseeksbox.mrmeeseks.MrMeeseeks;
import org.foobarspam.meeseeksbox.mrmeeseks.MrMeeseeksBox;
import org.junit.Before;
import org.junit.Test;

public class TestMrMeeseeks {
	MrMeeseeks MrMe = new MrMeeseeks();
	ArrayList<MrMeeseeks> setMrMe = new ArrayList<MrMeeseeks>();
	ArrayList<Integer> ids = new ArrayList<Integer>(); 
	MrMeeseeksBox box = new MrMeeseeksBox();
	
	@Before
	public void setUp(){
		
	}
	
	@Test
	public void testInstanciaMrMe(){
		// Comprobamos que ha creado un objeto de tipo MrMeeseeks
		assertTrue(MrMe instanceof MrMeeseeks);
	}
	
	@Test
	public void testPushButton(){
		// Comprobamos que lo meta en el array list
		box.pushButton(setMrMe);
		assertEquals(1, setMrMe.size());
	}
	
	@Test
	public void testGenerateMessageOnRequest(){
		// Mostrar mensajes aleatorios al requerir un Meeseek
		System.out.println("\nMensajes aleatorios al aparecer el Meesek:\n");
		System.out.println(MrMe.generateMessageOnRequest());
		System.out.println(MrMe.generateMessageOnRequest());
		System.out.println(MrMe.generateMessageOnRequest());
	}
}
