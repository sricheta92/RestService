package com.sample.crud;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;

public class Test {
public static void main(String[] args) throws OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException, IOException {
	OAuthConsumer consumer = new DefaultOAuthConsumer("Dummy", "secret");
	URL url = new URL("https://www.appdirect.com/api/events/dummyChange");
	HttpURLConnection request = (HttpURLConnection) url.openConnection();
	consumer.sign(request);
	request.connect();

}
}
