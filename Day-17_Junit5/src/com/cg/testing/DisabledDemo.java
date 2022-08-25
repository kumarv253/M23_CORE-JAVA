package com.cg.testing;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

@Disabled ///this class will be disabled when we run the code and your all the method output will not print 
public class DisabledDemo {
	
	@Test
	void print()
	{
		System.out.println("Hey There,i am using Disable annotation");
	}

}
