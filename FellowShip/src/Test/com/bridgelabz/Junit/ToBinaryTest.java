package com.bridgelabz.Junit;
import org.junit.Test;

import java.util.InputMismatchException;

public class ToBinaryTest {

	  @Test(expected=InputMismatchException.class)
	  public void thr() throws Exception{
	    //exception.expect(java.lang.NumberFormatException.class);
	//    exception.expectMessage("");
	    ToBinary t = new ToBinary();
	    t.bin();
	   
	  }
	 

}
