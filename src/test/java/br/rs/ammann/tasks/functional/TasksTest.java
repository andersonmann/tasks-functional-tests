/**
 * 
 */
package br.rs.ammann.tasks.functional;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

/**
 * @author andersonmann
 *
 */
public class TasksTest extends BrowserFactory {

	@Test
	public void simpleTest1() {
		String value = driver.getCurrentUrl();
		assertEquals("https://www.google.com/", value);
	}

	@Test
	public void simpleTest2() {
		String value = driver.getCurrentUrl();
		assertEquals("https://www.google.com/", value);
	}

	@Test
	public void simpleTest3() {
		String value = driver.getCurrentUrl();
		assertEquals("https://www.google.com/", value);
	}
}