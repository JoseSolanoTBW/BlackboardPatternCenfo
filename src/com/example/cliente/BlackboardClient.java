package com.example.cliente;

import com.example.blackboard.Blackboard;
import com.example.controller.BlackboardController;
import com.example.resource.AritmethicResource;
import com.example.resource.PrinterResource;

public class BlackboardClient {

	 public static void main(String[] args) throws Exception {
		Blackboard nuevaPizarra = new Blackboard();
		nuevaPizarra.resoruces.add(new PrinterResource());
		nuevaPizarra.resoruces.add(new AritmethicResource());
		BlackboardController controlador = new BlackboardController(nuevaPizarra);
		controlador.executeAll();
	 }
}
