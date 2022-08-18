package com.files.demo;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Files001 {

	public static void main(String args[]) {
		
	FileReader in = null;//to read a file
	
	BufferedReader br = null;//
	try {
		in = new FileReader("text.txt");
		
		br=new BufferedReader(in);
		String li;
		 
		while((li = br.readLine())!=null)//to read text into line by line
		{
			System.out.println(li);
		}
			 
		 }
	
		catch(FileNotFoundException ex) {
			//ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
	   	
		catch(IOException ex) {
	   		ex.printStackTrace();
	   	}
		catch(NullPointerException ex) {
	   	System.out.println(ex.getMessage());
		}
	
      	finally {
      		try {
      			
      			if(in != null)
      				in.close();
      		}
      		catch(IOException ex) {
      		System.out.println(ex.getMessage());
      		}
      	}
	}
}

      		
