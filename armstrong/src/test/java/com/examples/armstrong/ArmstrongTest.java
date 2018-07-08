package com.examples.armstrong;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class ArmstrongTest 
{
	Armstrong armstrong;
	
	@Before
	public void setup() {
		armstrong = new Armstrong();
	}

	@Test
	public void testValidCase() {
		int armNumber = 153;
		Assert.assertTrue(armstrong.isArmstrong(armNumber));
	}

	@Test
	public void testFalseCase() {
		int armNumber = 20;
		Assert.assertFalse(armstrong.isArmstrong(armNumber));
	}
	
	@Test
	public void testZeroCase() {
		int armNumber = 0;
		Assert.assertTrue(armstrong.isArmstrong(armNumber));
	}
}
