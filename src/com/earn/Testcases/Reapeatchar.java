package com.earn.Testcases;


import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Reapeatchar {
	
	SoftAssert P;
@Test
	public void A()
	{
	
	P= new SoftAssert();
		int count=0;
		String S= "ASDFGAFA";
		char ch='S';
		for(int i=0; i<S.length(); i++)
		{
			if (ch==S.charAt(i))
			{
				count++;
			}
		}
		
		
		System.out.println(count);
		P.assertAll();
	}

@Test
public void B()
{
	
	P= new SoftAssert();
	
	System.out.println("Step 1");
	//Assert.assertEquals("actual", "expected");
	//P.assertEquals("actual", "expected");
	//assert.fail("ExceptionX should be thrown");
	int count=0;
	String S= "ASDFGAFA";
	char ch='S';
	for(int i=0; i<S.length(); i++)
	{
		if (ch==S.charAt(i))
		{
			count++;
		}
	}
	
	P.assertAll();
	System.out.println(count);
	//P.assertAll();
	//Assert.fail("ExceptionX should be thrown");
	
	
	
}

	}


