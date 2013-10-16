import javax.servlet.http.HttpUtils;

import org.json.JSONObject;

/*
 *  Kole Reece & Andre Haynes 
 * 
 *  10/16/2013
 */
public class BtcParser {

	public String apiKey="";
	
	private String result="";
	
	private static final String URL="";
	
	public JSONObject doPost()
	{
		result=HttpUtil.httpPost(URL);
		
	}
}
