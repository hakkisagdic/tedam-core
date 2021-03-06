package com.lbs.tedam.exception;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.lbs.tedam.exception.localized.GeneralLocalizedException;

public class GeneralLocalizedExceptionTest {

	@Test
	public void testGeneralLocalizedExceptionTest() {
		GeneralLocalizedException exception = new GeneralLocalizedException(new Exception("generalException"));
		assertNotNull(exception.getMessage());
	}
}
