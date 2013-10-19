

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;



/*
 *  Kole Reece & Andre Haynes 
 * 
 *  10/16/2013
 */
public class BtcParser {

	public  String apiKey="";
	
	public String secret="";
	
	private String result="";
	
	public  String method;
	
	private int nonce=100;// hard code for now
	
	private String url;
	
    String line;
	
	public void doPost() 
	{
        this.apiKey="";
        this.secret="";
        this.method="getInfo";
        
        Mac macEncoding;
        SecretKeySpec key = null;
        
        try {
           key = new SecretKeySpec( apiKey.getBytes( "UTF-8"), "HmacSHA512" );
        } catch( UnsupportedEncodingException uee) {
            System.err.println( "Unsupported encoding exception: " + uee.toString());
           
        } 
        
        
        CloseableHttpClient httpclient = HttpClients.createDefault();
       
       
       HttpGet httpGet = new HttpGet("https://btc-e.com/tapi");
       
       
       try {
		CloseableHttpResponse response1 = httpclient.execute(httpGet);
	
		 HttpEntity entity = response1.getEntity();
		 
 	      InputStreamReader test =  new InputStreamReader(entity.getContent());
 	      
 	      BufferedReader rd = new BufferedReader(test);
 	      
 	      
 	     String line;
 	     
 	      while((line=rd.readLine())!=null)
 	      {
 	    	  
 	    	System.out.println(line);  
 	      }
 	      
 	      
 	    
	    } 
       
     catch (ClientProtocolException e) {
		    e.printStackTrace();
		    
		    
	  } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
    }
}
