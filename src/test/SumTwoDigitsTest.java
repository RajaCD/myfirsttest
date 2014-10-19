package test;

import com.raj.calculations.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.raj.calculations.SumTwoDigits;

public class SumTwoDigitsTest {

	int a;
	int b;
	@Before
	public void SetUP(){
		a=2;
		b=3;
	}
	
	@Test
	public void SumTwo_basic(){
		
		
		SumTwoDigits s=new SumTwoDigits();
		int result=s.Sum(a,b);
		
		assertEquals(5,result);
		
	}
}
