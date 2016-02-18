package at.caverntwo.nimserver;

import java.net.Socket;

public class JServerGameInstance implements Runnable 
{
	private Socket socket;
	private String sName;
	
	private boolean[][] buttonStates = {{true}, {true, true, true}, {true, true, true, true, true}, {true, true, true, true, true, true, true}};
	private boolean[][] oldButtonStates =  {{true}, {true, true, true}, {true, true, true, true, true}, {true, true, true, true, true, true, true}};
	private boolean gameInProgress = true;
	
	public JServerGameInstance(Socket connection, String name) {
		this.socket = connection;
		this.sName = name;
	}

	@Override
	public void run() {
		//do the game stuff
		
		preGameInit();
		while(gameInProgress ){
			recieveLastRound();
			playRound();
			endRound();
		}
		closeConnection();
	}

	private void preGameInit() {
		// TODO Sending Server information
		// TODO Setting up game variables
		
	}

	private void recieveLastRound() {
		// TODO Recieve last rounds information from Client
		
	}

	private void playRound() {
		// TODO Calculate the best moves and perform them
		
	}

	private void endRound() {
		// TODO Send performed moves to Client
		
	}

	private void closeConnection() {
		// TODO End Game and close Connection to Client
		
	}

	
}
