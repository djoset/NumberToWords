package com.mycompany.app;


import org.junit.*;

import com.mycompany.app.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	NumberWordsApplication numberWordsApplication;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
		numberWordsApplication = new NumberWordsApplication();
	}

	@Test
	public void numberWords1() {
		Assert.assertEquals("One",numberWords.toWords(1));
	}
	
	
	@Test
	public void numberWords2() {
		Assert.assertEquals("Two",numberWords.toWords(2));
	}
	
	
	@Test
	public void numberWords3() {
		Assert.assertEquals("Three",numberWords.toWords(3));
	}
	
	
	@Test
	public void numberWords4() {
		Assert.assertEquals("Four",numberWords.toWords(4));
	}
	
	
	@Test
	public void numberWords5() {
		Assert.assertEquals("Five",numberWords.toWords(5));
	}
	
	@Test
	public void numberWords6() {
		Assert.assertEquals("Six",numberWords.toWords(6));
	}
	
	@Test
	public void numberWords7() {
		Assert.assertEquals("Seven",numberWords.toWords(7));
	}
	
	@Test
	public void numberWords8() {
		Assert.assertEquals("Eight",numberWords.toWords(8));
	}
	
	@Test
	public void numberWords9() {
		Assert.assertEquals("Nine",numberWords.toWords(9));
	}
	
	@Test
	public void numberWords10() {
		Assert.assertEquals("Ten",numberWords.toWords(10));
	}
	
	@Test
	public void numberWords11() {
		Assert.assertEquals("Eleven",numberWords.toWords(11));
	}
	
	@Test
	public void numberWords12() {
		Assert.assertEquals("Tweleve",numberWords.toWords(12));
	}
	
	@Test
	public void numberWords13() {
		Assert.assertEquals("Thirteen",numberWords.toWords(13));
	}
	
	@Test
	public void numberWords14() {
		Assert.assertEquals("Fourteen",numberWords.toWords(14));
	}
	
	@Test
	public void numberWords15() {
		Assert.assertEquals("Fifteen",numberWords.toWords(15));
	}
	
	@Test
	public void numberWords16() {
		Assert.assertEquals("Sixteen",numberWords.toWords(16));
	}
	@Test
	public void numberWords17() {
		Assert.assertEquals("Seventeen",numberWords.toWords(17));
	}
	
	@Test
	public void numberWords18() {
		Assert.assertEquals("Eighteen",numberWords.toWords(18));
	}
	
	@Test
	public void numberWords19() {
		Assert.assertEquals("Nineteen",numberWords.toWords(19));
	}
	
	
	@Test
	public void numberWords20() {
		Assert.assertEquals("Twenty",numberWords.toWords(20));
	}
	
	
	
	@Test
	public void numberWords100() {
		Assert.assertEquals("One Hundred",numberWords.toWords(100));
	}
	
	
	@Test
	public void numberWords330() {
		Assert.assertEquals("Three Hundred Thirty",numberWords.toWords(330));
	}
	
	@Test
	public void numberWords999() {
		Assert.assertEquals("Nine Hundred Ninety Nine",numberWords.toWords(999));
	}
	
	
	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Number out of range", numberWords.toWords( 1000 ) ) ;
	}
	
	
	@Test
	public void negativeNumberError() {
		
		Assert.assertEquals( "Error", numberWords.toWords( -1 ) ) ;
	}
	
}
