package org.foobarspam.meeseeksbox.mrmeeseks;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

import org.foobarspam.meeseeksbox.interfaces.Doable;
import org.foobarspam.meeseeksbox.main.*;

public class MrMeeseeks implements Doable {
		private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
		private Integer id;
		String[] messageOnRequest = {"Oooh yeah! Can do!", "Yes sireee!", "Oh, yeah! Yes, ma'am!"};
		String messageOnDone = "All done!";
		String messageOnExplode = "Pooooof";
		
		public MrMeeseeks(){
			this.id = ID_GENERATOR.incrementAndGet();
		}
		
		// SETTERS Y GETTERS
		public Integer getId(){
			return this.id;
		}
		public String[] getMessageOnRequest(){
			return this.messageOnRequest;
		}
		public String getMessageOnDone(){
			return this.messageOnDone;
		}
		public String getMessageOnExplode(){
			return this.messageOnExplode;
		}
		
		// Genera un mensaje al crear el meeseek
		public void sayMessageOnCreate(){
			System.out.println("I'm Mr Meeseeks " + getId() + ". Look at meeee!");
		}
		public void sayMessageOnDone(){
			System.out.println(getMessageOnDone());
		}
		public void sayMessageOnExplode(){
			System.out.println(getMessageOnExplode() + " " + getId());
		}
		
		// Realiza una peticion y se ejecuta
		public void formulateRequest(String request, String action) {
			sayMessageOnRequest();
			String message = doRequest(request, action);
			System.out.println(message);
			sayMessageOnDone();
		}
		
		// Realiza un mensaje de la peticion
		public void sayMessageOnRequest(){
			String mensaje = generateMessageOnRequest();
			System.out.println(mensaje);
		}
		// Genera un mensaje de la peticion
		private String generateMessageOnRequest(){
			int numero = ThreadLocalRandom.current().nextInt(getMessageOnRequest().length);
			return getMessageOnRequest()[numero];			
		}

		// Realiza la peticion
		public String doRequest(String request, String action) {
			String requestAction = request + " " + action;
			return requestAction;
		}
		
		// Deja de existir
		public void stopExisting() {
			sayMessageOnExplode();
		}

}