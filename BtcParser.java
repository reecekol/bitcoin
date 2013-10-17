import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpUtils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;



/*
 *  Kole Reece & Andre Haynes 
 * 
 *  10/16/2013
 */
public class BtcParser {

	public  String apiKey="";
	
	private String result="";
	
	public  String method;
	
	private int nonce=100;// hard code for now
	
	private URL url;
	

	
	public void doPost()
	{
		URLConnection connection=null;
		
		try {
			url = new URL("https://btc-e.com/tapi");
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	    try {
	    	
			connection.connect();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    try {
			connection.getContent();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    System.out.println();
	}
	
	
	//System.out.Println(result);
	
}
