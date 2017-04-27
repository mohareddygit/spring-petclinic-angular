package org.springframework.samples.test;

import static org.junit.Assert.fail;

import org.junit.Test;

public class FailingTest {
	@Test
	public void failingTest() {
		fail();
	}
}
