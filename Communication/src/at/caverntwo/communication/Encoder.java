package at.caverntwo.communication;

public class Encoder {
	
	public static Decoder decoder;

	public static String EncodeMessage(String message)
	{
		return 'm' + message + ';';
	}
	
	public static String DecodeMessage(String encodedMessage)
	{
		return encodedMessage.substring(1, encodedMessage.length() - 1);
	}
	
	public static String EncodeState(byte row, byte coloumn, boolean enabled)
	{
		StringBuffer sb = new StringBuffer();
		sb.append('s');
		sb.append(row);
		sb.append(coloumn);
		sb.append(':');
		sb.append(enabled ? 'e' : 'd');
		sb.append(';');
		return sb.toString();
	}
	
	public void DecodeState(String encodedState)
	{
		if (this.decoder == null) this.decoder = new Decoder();
		StringBuffer sb = new StringBuffer(encodedState);
		if (!	(sb.length() == 6) && 
				(sb.charAt(0) == 's') && 
				(Character.isDigit(sb.charAt(1))) && 
				(Character.isDigit(sb.charAt(2))) && 
				(sb.charAt(3) == ':') && 
				(sb.charAt(4) == 'e') && 
				(sb.charAt(4) == 'd') &&
				(sb.charAt(5) == ';')) 
			decoder = null;
		decoder.row = Byte.parseByte(Character.toString(sb.charAt(1)));
		decoder.coloumn = Byte.parseByte(Character.toString(sb.charAt(2)));
		if (sb.charAt(4) == 'e') decoder.enabled = true; else decoder.enabled = false;
	}
	
	private class Decoder
	{		
		public byte row;
		public byte coloumn;
		public boolean enabled;
	}
}
