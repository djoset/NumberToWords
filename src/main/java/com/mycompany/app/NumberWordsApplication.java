package com.mycompany.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public final class NumberWordsApplication {
	private final BufferedReader reader ;
	
	
	public NumberWordsApplication() {
		new NumberWords();
		reader = new BufferedReader( new InputStreamReader( System.in ) ) ;
	}
	
	public int execute() {
		while( true ) {
			try {
				System.out.print( "Enter number (0 to exit): " ) ;
				String value = reader.readLine() ;
				int number = Integer.parseInt( value ) ;
				if(number == 0) {
					System.exit(0);
				}
				String result  = new NumberWords().toWords(number);
				System.out.println(result);
			} catch ( Exception e ) {
				System.out.println( "Invalid number" ) ;
			}
		}
	}

	public static void main(String[] args) {
		new NumberWordsApplication().execute() ;
		
	}

}
