package at.caverntwo.communication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class CommunicationHandler 
{   
	private Socket socket;
	private PrintWriter out;
	private BufferedReader in;
	
	private boolean[][] lastButtonStates;
	public boolean recievedButtonStates;
	public ArrayList<String> NewMessages;
	public boolean HasNewMessages;
	
	public CommunicationHandler(Socket socket_) throws Exception
	{
		socket = socket_;
		out = new PrintWriter(socket.getOutputStream());
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		recievedButtonStates = false;
		HasNewMessages = false;
		out.println("Hello"); out.flush();
	}
	
	public void Send(String s)
	{
		out.write(s);
		System.out.println(s);
	}
	
	public void DoUpdate() throws Exception
	{
		ArrayList<String> cmds = new ArrayList<String>();
		while (true)
		{
			String line = in.readLine();
			out.println(line); out.flush();
			if (line == null || line.equals("") || !(line.charAt(0) == 's' || line.charAt(0) == 'm')) break; 
			cmds.add(line);
		}
		checkCmds(cmds);
	}
	
	private void checkCmds(ArrayList<String> cmds)
	{
		StringBuffer sb = new StringBuffer(); //Temporarily save all states here
		for (String cmd : cmds) {
			if (cmd == null) continue;
			if (cmd.charAt(0) == 's' || cmd.charAt(0) == 'm') {sb.append(cmd); System.out.println(cmd);}
//			else throw new Exception("Comment not found!");
		}
		System.out.println(sb.toString());
	}
	
	public boolean[][] GetButtonStates()
	{
		recievedButtonStates = false;
		return this.lastButtonStates;
	}
	
	public void SendButtonStates(boolean[][] buttonStates)
	{
		out.println(Encoder.EncodeButtonStates(buttonStates));
	}
}