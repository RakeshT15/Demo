package com.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Sort 
{
			
	   public static void main(String args []) throws FileNotFoundException
	    {
	    	    
	          	File fo = new File("D:/MY DOCS/project/Test.txt");
	          	
					Scanner sc = new Scanner(fo);
					 ArrayList<String> ls = new ArrayList<String>(); // put file into a list  				 
					 while(sc.hasNextLine())                         // reads whole file 
					 {            									//convert file into 
						ls.add(sc.nextLine());
						
					 }
					
					String w =ls.toString()+1;
					System.out.println(w);
					sc.close();
					
					String[] ar = w.split(" ");
					
				HashMap<String,Integer> ha = new HashMap<String,Integer>();
				
					for(String nw : ar)
					{
						
						if(ha.containsKey(nw))
						{
							ha.put(nw,ha.get(nw)+1);
						}
						else
							ha.put(nw,1);
					}
					
					System.out.println(ha);
		
	          	
	    }
	   
		
	}

