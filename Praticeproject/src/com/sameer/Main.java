package com.sameer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	 public static void main(String[] args) throws IOException {
		 
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        String s ;
	        boolean isUpperCase=false;
	        String finalString = "";
	        while((s = bufferedReader.readLine())!=null){
	        	StringTokenizer stringTokenizer = new StringTokenizer(s," ");
	        	
	        	boolean isFirstWord=true;
	        	
	            if(stringTokenizer.hasMoreTokens()){
	            	if(isFirstWord){
	            		int noOfChar=stringTokenizer.nextElement().toString().length();
	            		//finalString=finalString.concat(String.valueOf(stringTokenizer.nextToken().charAt(0)).toUpperCase()); 
	            		System.out.println(stringTokenizer.nextElement().toString());
	            		for(int i =1;i<=noOfChar;i++){
	            			if(i%2!=0){
	            				finalString = finalString.concat(String.valueOf(stringTokenizer.nextToken().charAt(i)).toLowerCase());
	            			}else{
	            				finalString = finalString.concat(String.valueOf(stringTokenizer.nextToken().charAt(i)).toUpperCase());	
	            			}
	         
	      	          }
	            		finalString.concat(" ");
	            		isFirstWord=false;
	            		if(noOfChar%2==0){
	            			isUpperCase=true;
	            		}
	            		
	            	}
	            	if(isUpperCase){
	            		int noOfChar=stringTokenizer.nextElement().toString().length();
	            		finalString=finalString.concat(String.valueOf(stringTokenizer.nextToken().charAt(0)).toLowerCase()); 
	            		for(int i =1;i<=noOfChar;i++){
	            			if(i%2!=0){
	            				finalString = finalString.concat(String.valueOf(stringTokenizer.nextToken().charAt(i)).toUpperCase());
	            			}else{
	            				finalString = finalString.concat(String.valueOf(stringTokenizer.nextToken().charAt(i)).toLowerCase());	
	            			}
	         
	      	          }
	            		finalString.concat(" ");
	            		if(noOfChar%2==0){
	            			isUpperCase=true;
	            		}
	            		
	            	}else{
	            		int noOfChar=stringTokenizer.nextElement().toString().length();
	            		finalString=finalString.concat(String.valueOf(stringTokenizer.nextToken().charAt(0)).toUpperCase()); 
	            		for(int i =1;i<=noOfChar;i++){
	            			if(i%2!=0){
	            				finalString = finalString.concat(String.valueOf(stringTokenizer.nextToken().charAt(i)).toLowerCase());
	            			}else{
	            				finalString = finalString.concat(String.valueOf(stringTokenizer.nextToken().charAt(i)).toUpperCase());	
	            			}
	         
	      	          }
	            		finalString.concat(" ");
	            		isFirstWord=false;
	            		if(noOfChar%2==0){
	            			isUpperCase=true;
	            		}
	            		
	            		
	            	}
	         	
	            	
	            }
	            System.out.println(finalString);

	        }

	    }
}
