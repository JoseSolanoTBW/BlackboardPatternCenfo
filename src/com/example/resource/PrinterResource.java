package com.example.resource;

public class PrinterResource extends Resource {

	@Override
	public void executeAction() {
		System.out.println("This is a message from Printer resource");	
		Status = "Imprimiendo";
		System.out.println(Status);
	}

}
