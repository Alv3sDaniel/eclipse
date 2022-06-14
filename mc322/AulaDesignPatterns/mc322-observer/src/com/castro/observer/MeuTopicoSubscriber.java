package com.castro.observer;

public class MeuTopicoSubscriber implements Observer {

	private String nome;
	private Subject topico;

	public MeuTopicoSubscriber(String nome) {
		this.nome = nome;
	}

	@Override
	public void update() {
		String msg = (String) topico.getUpdate(this);
		if (msg == null) {
			System.out.println(nome + ":: Nenhuma mensagem nova!");
		} else
			System.out.println(nome + ":: Nova Mensagem!::" + msg);
	}

	@Override
	public void setSubject(Subject sub) {
		this.topico = sub;
	}

}
