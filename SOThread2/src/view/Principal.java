package view;

import controller.ThreadController;

public class Principal {

	public static void main(String[] args) {
		ThreadController tc1 = new ThreadController();
			tc1.start();
		ThreadController tc2 = new ThreadController();
			tc2.start();
		ThreadController tc3 = new ThreadController();
			tc3.start();
		ThreadController tc4 = new ThreadController();
			tc4.start();
		ThreadController tc5 = new ThreadController();
			tc5.start();	
	}

}
