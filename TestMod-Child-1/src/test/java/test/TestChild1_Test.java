package test;

import org.apache.log4j.Logger;
import org.junit.Test;

public class TestChild1_Test {
	@Test
	public void testChild1 (){
		Logger log = Logger.getLogger(getClass());
		log.info("Child1 tests log");
		log.info("test Idea");
		log.info("test Eclipse");
	}
}
