package com.bridgelabz.Junit;


import java.util.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class SqrtTest {
	private double a;
	private double b;
	
	Sqrt s;
	@Before
	public void setUp() {
		s=new Sqrt();
	}
	public  void Output(double b,double a) {
		this.a=a;
		this.b=b;
		
	}
	@ParameterizedTest
	public static Collection<Object[]> testdata(){
	Object[][] data=new Object[][] {{1.414213562373095,2.0}};
	return Arrays.asList(data);
}
	@Test
	public void test() {
	assertEquals(b, s.qrt(a));
	}
	private void assertEquals(double b2, Object object) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
