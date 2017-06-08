package org.foobarspam.meeseeksbox.mrmeeseks;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class MrMeeseeks {
		private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
		private Integer id;
				
		public MrMeeseeks(){
			this.id = ID_GENERATOR.incrementAndGet();
		}

		public String generateMessageOnRequest(){
		  String[] mensajes = {"Oooh yeah! Can do!", "Yes sireee!", "Oh, yeah! Yes, ma'am!"};
		  int numero = ThreadLocalRandom.current().nextInt(mensajes.length);
		  return mensajes[numero];
		}

}