package com.castro.observer;

import java.util.ArrayList;

public class MeuTopico implements Subject{
	
	private ArrayList<Observer> observers;
	private String msg;
	private boolean changed;
	private final Object MUTEX= new Object();
	
	public MeuTopico(){
		this.observers = new ArrayList<>();
	}
	@Override
	public void registrar(Observer obj) {
		if(obj == null) throw new NullPointerException("Null Observer");
		synchronized (MUTEX) {
		if(!observers.contains(obj)) observers.add(obj);
		}
	}

	@Override
	public void excluirRegistro(Observer obj) {
		synchronized (MUTEX) {
		observers.remove(obj);
		}
	}

	@Override
	public void notificarObservadores() {
		//ArrayList<Observer> observersLocal = null;
		
		synchronized (MUTEX) {
			if (!changed)
				return;
			//observersLocal = new ArrayList<>(this.observers);
			this.changed=false;
		}
		for (Observer obj : this.observers) {
			obj.update();
		}

	}

	@Override
	public Object getUpdate(Observer obj) {
		return this.msg;
	}
	
	public void postarMensagem(String msg){
		System.out.println("Mensagem postada no tópico:" + msg);
		this.msg=msg;
		this.changed=true;
		notificarObservadores();
	}

}


