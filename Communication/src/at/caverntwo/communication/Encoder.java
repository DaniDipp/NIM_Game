package at.caverntwo.communication;

/**
 * @author Caverntwo
 * How to use this class:
 * <h1>Encoding</h1>
 * Encodes a command with a  semicolon ';'. Encoding is done with methods that returns properly formatted commands.
 * <h3>Examples of Return Values</h3>
 * "mmymessage;"
 * "s00:e;"
 * <h1>Decoding</h1>
 * Decoding is done via the internal class "decoder".
 * Once a command is decoded, it's parameters can be read via the decoder class.
 */
public class Encoder {
	
	public static Encoder.Decoder decoder = new Encoder.Decoder();
	
	public static String EncodeMessage(String message)
	{
		return 'm' + message + ';';
	}
	
	public static String DecodeMessage(String encodedMessage)
	{
		return encodedMessage.charAt(0) == 'm' ? encodedMessage.substring(1, encodedMessage.length()) : null;
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
	
	/**
	 * You need to read the values from the internal class "decoder".
	 * @param encodedState
	 */
	public static boolean DecodeState(String encodedState)
	{
		StringBuffer sb = new StringBuffer(encodedState);
		if (!	(sb.length() == 5) && 
				(sb.charAt(0) == 's') && 
				(Character.isDigit(sb.charAt(1))) && 
				(Character.isDigit(sb.charAt(2))) && 
				(sb.charAt(3) == ':') && 
				(sb.charAt(4) == 'e') && 
				(sb.charAt(4) == 'd') ) 
			return false;
		decoder.row = Byte.parseByte(Character.toString(sb.charAt(1)));
		decoder.coloumn = Byte.parseByte(Character.toString(sb.charAt(2)));
		if (sb.charAt(4) == 'e') decoder.enabled = true; else decoder.enabled = false;
		System.out.println(decoder.toString());
		return true;
	}
	
	public static class Decoder
	{		
		public byte row;
		public byte coloumn;
		public boolean enabled;
	}
}
