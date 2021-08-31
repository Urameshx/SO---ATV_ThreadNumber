package controller;

public class Thread_controller extends Thread {

	public Thread_controller() {
		
	}
	
	@Override
	public void run() {
		System.out.println("Thread nº:" + getId());
	}

}