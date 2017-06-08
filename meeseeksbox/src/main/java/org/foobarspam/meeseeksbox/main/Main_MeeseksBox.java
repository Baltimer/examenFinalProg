package org.foobarspam.meeseeksbox.main;
import java.util.ArrayList;

import org.foobarspam.meeseeksbox.mrmeeseks.*;

public class Main_MeeseksBox {
	public static void main( String[] args ){
        
		// Crea una estructura de datos llamada setMrMe donde almacenar los Mr Meeseeks creados
		ArrayList<MrMeeseeks> setMrMe = new ArrayList<MrMeeseeks>();
		// Crea una estructura de datos llamada ids donde almacenar los ids de los Mr Meeseeks creados
		ArrayList<Integer> ids = new ArrayList<Integer>(); 
		
		// Caja de MrMeeseeks que sirve para llamarlos.
		MrMeeseeksBox box = new MrMeeseeksBox();
		
		box.pushButton(setMrMe);
		System.out.println("Open Jerry's stupid mayonnaise jar");
		box.getMrMe().formulateRequest("Open", "stupid jar");
		System.out.println();
		
		box.pushButton(setMrMe);    
		System.out.println("I wanna be popular at school!");
		box.getMrMe().formulateRequest("Be", "popular at school");
		System.out.println();
		
		box.pushButton(setMrMe);
		System.out.println("I wanna be a more complete woman!");
		box.getMrMe().formulateRequest("Be", "a more complete woman");
		System.out.println();
		
		System.out.println("Estos son los Mr Meeseeks creados:");
		listMrMeeseeks(setMrMe);
		System.out.println();
		
		collectIds(setMrMe, ids);
		
		System.out.println("Adios, Mr Meeseeks...");
		
		for(Integer id : ids){
			explodeMrMeeseeks(setMrMe, id);   
		}
		System.out.println();
		
		System.out.println("Ahora quedan " + setMrMe.size() + " MrMeeseeks operativos.");
		
		System.out.println("        ___");
		System.out.println("    . -^   `--,");
		System.out.println("   /# =========`-_");
		System.out.println("  /# (--====___====\\");
		System.out.println(" /#   .- --.  . --.|");
		System.out.println("/##   |  * ) (   * ),");
		System.out.println("|##   \\    /\\ \\   / |");
		System.out.println("|###   ---   \\ ---  |");
		System.out.println("|####      ___)    #|");
		System.out.println("|######           ##|");
		System.out.println(" \\##### ---------- /");
		System.out.println("  \\####           (");
		System.out.println("   `\\###          |");
		System.out.println("     \\###         |");
		System.out.println("      \\##        |");
		System.out.println("       \\###.    .)");
		System.out.println("        `======/");  
	}

		/* collectIds(setMrMe, ids)
		 * Almacena en un array los ids de los Mr Meeseeks creados
		 */
	public static void collectIds(ArrayList<MrMeeseeks> setMrMe, ArrayList<Integer> ids){
		for(MrMeeseeks MrMe : setMrMe){
			ids.add(MrMe.getId());
		}
	}

		/* listMrMeeseeks(setMrMe)
		 * Lista los ids de todos los Mr Meeseeks creados
		 */
	public static void listMrMeeseeks(ArrayList<MrMeeseeks> setMrMe){
		for(MrMeeseeks MrMe : setMrMe){
			System.out.println(MrMe.getId());
		}
	}

		/* explodeMrMeeseeks(setMrMe, id)
		 * elimna del conjunto de Mr Meeseeks creados el que ya ha completado su cometido
		 */	
	public static void explodeMrMeeseeks(ArrayList<MrMeeseeks> setMrMe, Integer id){
		// Clonamos setMeMr porque si lo utilizamos para el bucle surgira
		// una excepcion de tipo "ConcurrentModificationException", ya que no
		// se puede modificar el objecto sobre el cual estás iterando en el bucle.
		ArrayList<MrMeeseeks> cloneSetMrMe = new ArrayList<MrMeeseeks>();
		for(MrMeeseeks MrMe : setMrMe){
			cloneSetMrMe.add(MrMe);
		}
		for(MrMeeseeks MrMe : cloneSetMrMe){
			if(MrMe.getId() == id){
				MrMe.stopExisting();
				setMrMe.remove(MrMe);
			}
		}
	}
}
