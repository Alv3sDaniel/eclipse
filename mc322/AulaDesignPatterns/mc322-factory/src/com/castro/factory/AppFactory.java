package com.castro.factory;

public class AppFactory {
	
	public static void main(String[] args) {
		Computador pc = ComputadorFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
		Computador server = ComputadorFactory.getComputer("server","16 GB","1 TB","3 GHz");
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
	}


}
