package com.test01;
import java.net.URL; 
import java.net.URLConnection;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class MTest02 {

	
	public static void main(String[] args) throws IOException {
		
		URL url = new URL("https://cdn1.iconfinder.com/data/icons/system-black-circles/512/java-512.png");
	    URLConnection urlConnection = url.openConnection();
	    urlConnection.connect();
	    
	    DataInputStream din = new DataInputStream(urlConnection.getInputStream());
	    //getinputstream: 나한테 읽어들인다.read.
	    
	    FileOutputStream fout = new FileOutputStream("a.png");
	    
	    byte[] b = new byte[1];
	    
	    while (din.read(b, 0, 1) != -1) {
	    	fout.write(b, 0, 1);
	    }
	    
	    fout.close();
	    din.close();
	    
	    		
	} 
}
