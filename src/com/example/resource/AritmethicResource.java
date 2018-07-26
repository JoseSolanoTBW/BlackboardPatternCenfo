package com.example.resource;

public class AritmethicResource extends Resource {

	@Override
	public void executeAction() {
		System.out.println(3+3);
		Status = "Sumando"; 
		System.out.println(Status);
	}
}
