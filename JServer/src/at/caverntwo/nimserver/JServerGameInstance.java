package at.caverntwo.nimserver;

import java.net.Socket;

public class JServerGameInstance implements Runnable 
{
	private Socket socket;
	private String sName;
	
	private boolean[][] buttonStates = {{true}, {true, true, true}, {true, true, true, true, true}, {true, true, true, true, true, true, true}};
	private boolean[][] oldButtonStates =  {{true}, {true, true, true}, {true, true, true, true, true}, {true, true, true, true, true, true, true}};
	
	public JServerGameInstance(Socket connection, String name) {
		this.socket = connection;
		this.sName = name;
	}

	@Override
	public void run() {
		//do the game stuff
		
//		preGameInit();
//		while(gameInProgress){
//			recieveLastRound();
//			playRound();
//			endRound();
//		}
//		closeConnection();
	}

	
}
