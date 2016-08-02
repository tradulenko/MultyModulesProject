package myPackage;

import org.apache.log4j.Logger;
import org.junit.Test;

public class Test11_Test {
	@Test
	public void test1(){
		System.out.println("Test Child is  running!");
		Logger log = Logger.getLogger(getClass());
		log.info("Test Log");
	}
}
