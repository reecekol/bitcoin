import java.io.IOException;


public class testBtcParser {

	
	public static void main (String []args ) 
	{
		
		
	
		BtcParser btc = new BtcParser();
		
		while(true)
		{
			
			try {
				btc.doPost();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			try {
			  
			    Thread.sleep(100);
			} catch ( java.lang.InterruptedException ie) {
			    System.out.println(ie);
			}
		}
	
	}
	
}
