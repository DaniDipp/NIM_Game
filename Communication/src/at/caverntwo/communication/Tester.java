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
		Encoder.DecodeState("s12:e;");
		System.out.println("Row: " + Encoder.decoder.row + ", Coloumn: " + Encoder.decoder.coloumn + ", Enabled: " + Encoder.decoder.enabled);
		Encoder.DecodeState("s02:d;");
		System.out.println("Row: " + Encoder.decoder.row + ", Coloumn: " + Encoder.decoder.coloumn + ", Enabled: " + Encoder.decoder.enabled);
		Encoder.DecodeState("s12:e;");
		System.out.println("Row: " + Encoder.decoder.row + ", Coloumn: " + Encoder.decoder.coloumn + ", Enabled: " + Encoder.decoder.enabled);
		
		try {
			CommunicationHandler c = new CommunicationHandler(null);
			c.SendButtonStates(new boolean[][] {{false}, {false, true, false}, {false, false, false, true, false}, {false, true, false, false, false, false, true}});
			boolean[][] sd = c.RecieveButtonStates("s00:d;s10:d;s11:e;s12:d;s20:d;s21:d;s22:d;s23:e;s24:d;s30:d;s31:e;s32:d;s33:d;s34:d;s35:d;s36:e;");
//			boolean[][] sd = c.RecieveButtonStates("s00:d;");
			for (int i = 0; i < sd.length; i++)
			{
				for (int j = 0; j < sd[i].length; j++)
				{
					System.out.print(sd[i][j] + " ");
				}
				System.out.println();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
