package com.mycompany.app;

public class NumberWords {

	public final String oneToNineteen[] = {"","One","Two","Three","Four","Five","Six",
			"Seven","Eight","Nine","Ten","Eleven","Tweleve","Thirteen","Fourteen",
			"Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"}; 
	
	public final String tens[]= {"","","Twenty" , "Thirty" , "Fourty","Fifty",
		"Sixty","Seventy","Eighty","Ninety"	};
	
	public String toWords( int number ) {
		
		String result = new String();
		if(number < 0 ) {
			
			result = "Error";
		
		}
		else if(number > 999){
			
			result = "Number out of range";
			
		}
		else {
			if(number <= 19)
				result = oneToNineteen[number] ;
			
			else if(number<100) {
				
				result = tens[number/10] + ((number%10!=0)?" ":"" )+ oneToNineteen[number%10] ;
				
			}
			
			else {
				
				result = oneToNineteen[number/100] +" Hundred"+ ((number%100!=0)?" ":"") + toWords(number%100) ;
				
			}

		}
		return result.trim() ;
	}

}
