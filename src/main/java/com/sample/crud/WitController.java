package com.sample.crud;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class WitController {
	
	String url = "https://api.wit.ai/converse?v=20160526&session_id=123abc&q=";

	 @RequestMapping(value = "/wit/{msg}", method = RequestMethod.GET, headers = "Accept=application/json")  
	 @ResponseBody
	 public void getAction(@PathVariable String  msg) throws UnsupportedEncodingException {  
		 
	//	String msg1 = "Whats the weather in Rome";
		 URLEncoder.encode(msg, "UTF-8");
		 RestTemplate restTemplate = new RestTemplate();
		 String url1 = url + msg;
		 ResponseEntity<String> response = restTemplate.postForEntity(url1,String.class,String.class);
		 System.out.println(response.getBody());
	 }  
	  
}
