package at.caverntwo.nimserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import at.caverntwo.communication.Encoder;

public class JServerMain {

	public static void main(String[] args)
	{
		StartServerThread(10110);
	}
	
	public static void StartServerThread(int port)
	{
		System.out.println("Starting Server with port " + port + "!");
		ServerSocket socket = null;
		try
		{
			socket = new ServerSocket(port);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("Server started up successfully!");
		
		while (true)
		{
			try
			{
				Socket connection = socket.accept();
				if (connection.isConnected())
				{
					System.out.println("Client successfully connected, starting game...");
					Thread gameInstance = new Thread(new JServerGameInstance(connection));
					gameInstance.start();
				}
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
