package tests;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class Test111_Test {
	@Test
	public void test111(){
		Logger log = Logger.getLogger(getClass());
		log.info("Log from project 3");
		
		Assert.assertTrue("Test from assert", true);
	}
}
