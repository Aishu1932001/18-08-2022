package com.files.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Files002 {

	public static void main(String[] args) {
		
		BufferedReader br =  null;
		FileReader   in =  null;
		
		try {
		List<String>lines = new ArrayList<String>();
			 //String[]lines = new String[20];
			 
			 in = new FileReader("text.txt");
			 br=new BufferedReader(in);
			 String line = br.readLine();
			   
			 while(line !=null) {
			 lines.add(line);
				  
			 line = br.readLine();
			 if(line==null)
			 break;
			  }
			 //String str = Arrays.toString(lines.toArray());
			  
			//String[] str= (String[]) lines.to();
			
		    //System.out.println((str.length);
			 String[] str = new String[lines.size()];
			  
			 for(int i=0; i<lines.size(); i++)
				  
			 str[i] = lines.get(i);
		         
			 for(String s: str)
			 System.out.println("\n\n" + s);
		}
		
			   
			 catch(FileNotFoundException ex) {
			 System.out.println(ex.getMessage());
			 }
		     catch(IOException ex) {
			 System.out.println(ex.getMessage());
		     }
			   
		}
}
		
