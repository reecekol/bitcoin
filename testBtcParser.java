
public class testBtcParser {

	
	public static void main (String []args )
	{
		BtcParser btc = new BtcParser();
		
		while(true)
		{
			
			btc.doPost();
			
			
			try {
			  
			    Thread.sleep(100);
			} catch ( java.lang.InterruptedException ie) {
			    System.out.println(ie);
			}
		}
	}
	
}
