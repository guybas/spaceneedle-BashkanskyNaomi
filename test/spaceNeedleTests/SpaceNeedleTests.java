//*******************************************************
//DO NOT MODIFY THIS FILE!!!
//*******************************************************

package spaceNeedleTests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.lang.reflect.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import spaceNeedle.SpaceNeedle;

public class SpaceNeedleTests {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	/**
	 * Set the Standard output and error streams to send to our private streams
	 * instead of the console before each test runs
	 */
	@Before
	public void setup() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	/**
	 * Reset the Standard output, error, and input streams back to their default
	 * (Console and System.in) after each test runs
	 */
	@After
	public void cleanUpStreams() {
		System.setOut(System.out);
		System.setErr(System.err);
		System.setIn(System.in);
	}

	/**
	 * Set the Class Constant field SIZE to the specified value
	 */
	private static void setSize(Object newValue) throws Exception {
		// Get the SIZE field
		Field field = SpaceNeedle.class.getDeclaredField("SIZE");
		field.setAccessible(true);

		// Remove final modifier from the field
		Field modifiersField = Field.class.getDeclaredField("modifiers");
		modifiersField.setAccessible(true);
		modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
		
		// Set the new value
		field.set(null, newValue);
	}

	/**
	 * Test the SpaceNeedle class with a SIZE of 2
	 */
	@Test
	public void testOutputSize2() throws FileNotFoundException {
		try {
			setSize(2);
		} catch (Exception e) {
			fail("Failed to set the SIZE. Did you change the Class Constant?");
		}

		String filename = "test\\spaceNeedleTests\\Size2.txt";
		File file = new File(filename);
		Scanner in = new Scanner(file);
		String expectedOutput = in.useDelimiter("\\Z").next().replaceAll("\r", "");
		in.close();

		SpaceNeedle.main(null);
		String actualOutput = outContent.toString().replaceAll("\r", "");

		assertEquals("Output for Size 2 didn't match the expected.", expectedOutput, actualOutput);
	}

	/**
	 * Test the SpaceNeedle class with a SIZE of 3
	 */
	@Test
	public void testOutputSize3() throws FileNotFoundException {
		try {
			setSize(3);
		} catch (Exception e) {
			fail("Failed to set the SIZE. Did you change the Class Constant?");
		}

		String filename = "test\\spaceNeedleTests\\Size3.txt";
		File file = new File(filename);
		Scanner in = new Scanner(file);
		String expectedOutput = in.useDelimiter("\\Z").next().replaceAll("\r", "");
		in.close();

		SpaceNeedle.main(null);
		String actualOutput = outContent.toString().replaceAll("\r", "");

		assertEquals("Output for Size 3 didn't match the expected.", expectedOutput, actualOutput);
	}

	/**
	 * Test the SpaceNeedle class with a SIZE of 4
	 */
	@Test
	public void testOutputSize4() throws FileNotFoundException {
		try {
			setSize(4);
		} catch (Exception e) {
			fail("Failed to set the SIZE. Did you change the Class Constant?");
		}

		String filename = "test\\spaceNeedleTests\\Size4.txt";
		File file = new File(filename);
		Scanner in = new Scanner(file);
		String expectedOutput = in.useDelimiter("\\Z").next().replaceAll("\r", "");
		in.close();

		SpaceNeedle.main(null);
		String actualOutput = outContent.toString().replaceAll("\r", "");

		assertEquals("Output for Size 4 didn't match the expected.", expectedOutput, actualOutput);
	}
}
