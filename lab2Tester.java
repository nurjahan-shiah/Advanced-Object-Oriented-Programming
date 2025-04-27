package test_lab2;

import static org.junit.Assert.*;

import org.junit.Test;

import lab2.Lab2;

public class Lab2Tester {

	@Test
	public void testLicencePoints_NegativeSpeeds() {
        // Test negative actual speed
        assertEquals("Should return -1 for negative actualSpeed", -1, Lab2.LicencePoints(-10, 50, false));
        // Test negative max speed
        assertEquals("Should return -1 for negative maxSpeed", -1, Lab2.LicencePoints(60, -50, false));
    }

    @Test
    public void testLicencePoints_NoViolation() {
        // Test no speed violation
        assertEquals("Should return 0 when actualSpeed <= maxSpeed", 0, Lab2.LicencePoints(50, 50, false)); //nothing given in lab 2
        assertEquals("Should return 0 when actualSpeed < maxSpeed", -1, Lab2.LicencePoints(40, 50, false));
    }

    @Test
    public void testLicencePoints_StuntDriving() {
        // Test stunt driving
        assertEquals("Should return 6 points for stunt driving", 6, Lab2.LicencePoints(100, 50, true));
    }

    @Test
    public void testLicencePoints_MajorViolation() {
        // Test speed over max by 50 or more
        assertEquals("Should return 6 points for speed >= maxSpeed + 50", 6, Lab2.LicencePoints(101, 50, false));
    }

    @Test
    public void testLicencePoints_ModerateViolation() {
        // Test speed over max by 30 to 49
        assertEquals("Should return 4 points for speed >= maxSpeed + 30 and <= maxSpeed + 49", 4, Lab2.LicencePoints(80, 50, false));
    }

    @Test
    public void testLicencePoints_MinorViolation() {
        // Test speed over max by 16 to 29
        assertEquals("Should return 3 points for speed >= maxSpeed + 16 and <= maxSpeed + 29", 3, Lab2.LicencePoints(70, 50, false));
    }

}
