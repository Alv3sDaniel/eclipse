package com.castro.observer;

public class AppObserver {
	
	public static void main(String[] args) {
		//create subject
		MeuTopico topico = new MeuTopico();
		MeuTopico noticias = new MeuTopico();
		
		//create observers
		Observer obsCell = new MeuTopicoSubscriber("smartphone");
		Observer obsPC = new MeuTopicoSubscriber("PC");
		Observer obsArduino = new MeuTopicoSubscriber("Arduino");
		
		//register observers to the subject
		topico.registrar(obsCell);
		topico.registrar(obsPC);
		topico.registrar(obsArduino);
		
		noticias.registrar(obsCell);
		
		obsCell.setSubject(topico);
		obsPC.setSubject(topico);
		obsArduino.setSubject(topico);
		
		
		
		//now send message to subject
		//topico.postarMensagem("MC322!");
		//noticias.postarMensagem("Vai chover amanhã!");
		
		obsCell.update();
		obsPC.update();
		obsArduino.update();
		
		topico.postarMensagem("Unicamp");
		//noticias.postarMensagem("Vai chover...");
	}


}

