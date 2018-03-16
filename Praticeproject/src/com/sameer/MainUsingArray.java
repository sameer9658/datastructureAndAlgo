package com.sameer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainUsingArray {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s ;
        boolean isUpperCase=false;
        String finalString = "";
        boolean isFirstWord=true;
        while((s = bufferedReader.readLine())!=null){
        	String[] tokens=s.split(" ");
        	for(int i=0;i<=tokens.length;i++){
        		
        		if(isFirstWord){
        			int noOfChar=tokens[i].length();
            		finalString=finalString.concat(String.valueOf(tokens[i].charAt(0)).toUpperCase()); 
            		
            		for(int j =1;j<noOfChar;j++){
            			if(j%2!=0){
            				finalString = finalString.concat(String.valueOf(tokens[i].charAt(j)).toLowerCase());
            				
            				
            			}else{
            				finalString = finalString.concat(String.valueOf(tokens[i].charAt(j)).toUpperCase());	
            				
            			}
         
      	          }
            		finalString.concat(" ");
            		isFirstWord=false;
            		if(noOfChar%2!=0){
            			isUpperCase=true;
            			i++;
            		}
            		
            	}
        		if(isUpperCase){
        			int noOfChar=0;
        			//s=tokens[i].length();
        			System.out.println(tokens[i]);
            		//finalString=finalString.concat(String.valueOf(tokens[i].charAt(0)).toLowerCase()); 
            		for(int k =1;k<noOfChar;k++){
            			if(k%2!=0){
            				finalString = finalString.concat(String.valueOf(tokens[i].charAt(k)).toUpperCase());
            			}else{
            				finalString = finalString.concat(String.valueOf(tokens[i].charAt(k)).toLowerCase());	
            			}
         
      	          }
            		finalString.concat(" ");
            		if(noOfChar%2==0){
            			isUpperCase=true;
            		}
            		
            	}else{
            		int noOfChar=tokens[i].length();
            		finalString=finalString.concat(String.valueOf(tokens[i].charAt(0)).toUpperCase()); 
            		for(int l =1;l<noOfChar;l++){
            			if(l%2!=0){
            				finalString = finalString.concat(String.valueOf(tokens[i].charAt(l)).toLowerCase());
            			}else{
            				finalString = finalString.concat(String.valueOf(tokens[i].charAt(l)).toUpperCase());	
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
