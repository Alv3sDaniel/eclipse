package com.castro.factory;

public class Server extends Computador{

	private String ram;
	private String hdd;
	private String cpu;
	
	public Server(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd.concat("in raid-0");
	}

	@Override
	public String getCPU() {
		return this.cpu.concat("x2");
	}


}
