package com.learning.pg.client;
import java.util.Scanner;
			
			/*
			 	Question# 1 Floor construction 
			*/

public class FloorConstruction {
	
	public static void main(String args[]){
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the total number floors in the building : ");
	    int flrCount = scanner.nextInt();
	    int flrSize[] = new int[flrCount+1];
	    int dayCount=1;
	    int dayValue;
	    for(;dayCount<flrCount+1;dayCount++){
	    	System.out.println("Enter the floor size given on day : "+dayCount);
	    	dayValue = scanner.nextInt();
	        flrSize[dayValue]=dayCount;
        }
	    	    
        int tempFlrCount = flrCount;
        boolean flgNoFlr;
        dayCount=1;
	        
        System.out.println("The order of construction is as follows ");
	                
        for( ;dayCount<=flrCount;dayCount++){
        	flgNoFlr = false;
            System.out.println("\nDay "+dayCount+" :");
            
            while(tempFlrCount>=1 && flrSize[tempFlrCount]<=dayCount){
            	flgNoFlr = true;
                System.out.print(tempFlrCount +" ");
                tempFlrCount--;
            }
            if(flgNoFlr == true){
                System.out.println(" ");
            }
        }
        scanner.close();
	}
}
