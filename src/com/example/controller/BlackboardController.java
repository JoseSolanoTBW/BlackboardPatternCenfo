package com.example.controller;

import com.example.blackboard.Blackboard;
import com.example.resource.Resource;

public class BlackboardController {
	
	private Blackboard pizarra;
	
	public BlackboardController( Blackboard blackboard) {
		pizarra = blackboard;
	}
	
	public void executeAll() {
		for (Resource resource : pizarra.resoruces) {
			resource.executeAction();			
		}
	}
}
