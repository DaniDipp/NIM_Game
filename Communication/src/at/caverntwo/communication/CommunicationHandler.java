package at.caverntwo.communication;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class CommunicationHandler 
{	
	public static final String msgAck = "ack";
	
	private Socket socket;
	private PrintWriter out;
	
	public CommunicationHandler(Socket socket_) throws Exception
	{
		socket = socket_;
		//out = new PrintWriter(socket.getOutputStream());
	}
	
	private void send(String s)
	{
//		out.write(s);
		System.out.println(s);
	}
	
	public void SendButtonStates(boolean[][] buttonStates)
	{
		StringBuffer sb = new StringBuffer();
		for (byte i = 0; i < buttonStates.length; i++)
		{
			for (byte j = 0; j < buttonStates[i].length; j++)
			{
				sb.append(Encoder.EncodeState(i, j, buttonStates[i][j]));
			}
		}
		send(sb.toString());
	}
	
	public boolean[][] RecieveButtonStates(String decode)
	{
		String[] bs = decode.split(";");
		boolean[][] buttonStates = {{false}, {false, false, false}, {false, false, false, false, false}, {false, false, false, false, false, false, false}}; //tree initialization
		for (int i = 0; i < bs.length; i++)
		{
			System.out.println(bs[i]);
			Encoder.DecodeState(bs[i]);
			System.out.println("dec: row: " + Encoder.decoder.row + ", coloumn: " + Encoder.decoder.coloumn + ", enabled: " + Encoder.decoder.enabled);
			buttonStates[Encoder.decoder.row][Encoder.decoder.coloumn] = Encoder.decoder.enabled;
		}
		return buttonStates;
	}	
	
	public void SendAcknowledge()
	{
		send(Encoder.EncodeMessage(msgAck));
	}
	
}
