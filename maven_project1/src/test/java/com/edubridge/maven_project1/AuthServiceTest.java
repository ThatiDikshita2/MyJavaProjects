package com.edubridge.maven_project1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AuthServiceTest {
	private static AuthService auth;
  
	@BeforeAll
	public static void setup() {
		auth = new AuthService();
		System.out.println("BeforeAll");
	}
	
	@AfterAll
	public static void tearup() {
		auth = new AuthService();
		System.out.println("AfterAll");
	}
	
    @Disabled
	@Test 
	@DisplayName("check with valid data")
	public void testAuthenticateWithValidDate() {
		boolean actual = auth.authenticate("admin", "admin123");
		assertTrue(actual);
	}

	@Test
	@DisplayName("check with invalid data")
	public void testAuthenticateWithInValidDate() {
		boolean actual = auth.authenticate("admin", "admin");
		assertFalse(actual);
	}
}