package org.springframework.samples.test;

import org.junit.Assume;
import org.junit.Test;

public class FailingTest {
	@Test
	public void failingTest() {
		Assume.assumeTrue(false);
		//assertTrue(true);
	}
}
