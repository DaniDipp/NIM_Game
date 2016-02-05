package at.caverntwo.nimserver;

import java.net.Socket;

public class JServerGameInstance implements Runnable 
{
	private Socket socket;
	
	public JServerGameInstance(Socket connection) {
		this.socket = connection;
	}

	@Override
	public void run() {
		System.out.println("HELLO");
		//do the game stuff
	}	

	
}
