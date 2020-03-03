package com.unisys.demos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BaseClass {
	Logger logger = LoggerFactory.getLogger(BaseClass.class);
	public int add(int a, int b){
		logger.info("Add method logger set");
		return a+b;
	}
	
	public int mult(int a, int b){
		return a*b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
