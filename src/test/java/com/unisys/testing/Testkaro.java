package com.unisys.testing;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.unisys.demos.BaseClass;

import junit.framework.Assert;


public class Testkaro {
	
	private BaseClass baseclass;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
		baseclass = new BaseClass();
	}

	@Test
	public void testAdd() {
		baseclass = new BaseClass();
		int a = 10;
		int b = 20;
		int eresult = 30;
		long result = baseclass.add(10,20);
		Assert.assertEquals(result, eresult);
	}

	

}
