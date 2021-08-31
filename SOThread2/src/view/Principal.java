package view;

import controller.Thread_controller;

public class Principal {

	public static void main(String[] args) {
		Thread_controller tc1 = new Thread_controller();
			tc1.start();
		Thread_controller tc2 = new Thread_controller();
			tc2.start();
		Thread_controller tc3 = new Thread_controller();
			tc3.start();
		Thread_controller tc4 = new Thread_controller();
			tc4.start();
		Thread_controller tc5 = new Thread_controller();
			tc5.start();
		
		
		
		
		
	}

}