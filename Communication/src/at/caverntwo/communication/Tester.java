package at.caverntwo.communication;

/**
 * A Tester Class that shows how to use the Encoder class! Will probably be removed in future.
 * @author Caverntwo
 *
 */
public class Tester {

	public static void main(String[] args)
	{
		Encoder encoder = new Encoder();
		
		System.out.println(encoder.EncodeMessage("Hörmann"));
		System.out.println(encoder.EncodeState((byte) 1, (byte) 2, true));
		System.out.println(encoder.EncodeState((byte) 0, (byte) 2, false));
		System.out.println(encoder.EncodeState((byte) 1, (byte) 4, true));
		
		System.out.println(encoder.DecodeMessage("mHörmann;"));
		encoder.DecodeState("s12:e;");
		System.out.println("Row: " + Encoder.decoder.row + ", Coloumn: " + Encoder.decoder.coloumn + ", Enabled: " + Encoder.decoder.enabled);
		encoder.DecodeState("s02:d;");
		System.out.println("Row: " + Encoder.decoder.row + ", Coloumn: " + Encoder.decoder.coloumn + ", Enabled: " + Encoder.decoder.enabled);
		encoder.DecodeState("s12:e;");
		System.out.println("Row: " + Encoder.decoder.row + ", Coloumn: " + Encoder.decoder.coloumn + ", Enabled: " + Encoder.decoder.enabled);
	}
}
